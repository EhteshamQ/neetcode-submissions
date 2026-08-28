class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length == 0 || words.length == 1)
            return true;
        
        Map<Character, Integer> orderMap = new HashMap<>();

        for(int i = 0; i < order.length() ; i++) {
            char ch = order.charAt(i);
            orderMap.put(ch , i);
        }

        for(int i = 0; i < words.length-1; i++) {
            if (!areWordsSorted(words[i], words[i+1], orderMap)) {
                System.out.println("Returning false");
                return false;
            }
        }
        return true;
    }

    boolean areWordsSorted(String w1, String w2, Map<Character, Integer> order){

        for(int i = 0; i < w1.length() && i < w2.length(); i++) {
            System.out.println(w1.charAt(i) + " " + w2.charAt(i) + " - " + (w1.charAt(i) > w2.charAt(i)));
            if(order.get(w1.charAt(i)) > order.get(w2.charAt(i))){
                              return false;}
            if (order.get(w1.charAt(i)) < order.get(w2.charAt(i)))
                {return true;}
            if (i == w1.length() - 1)
                return true;
        }
        return false;

    }


}