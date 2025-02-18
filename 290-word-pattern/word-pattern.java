class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> chm  = new HashMap<>();
        Map<String,Character> wordm  = new HashMap<>();
         String words[] = s.split(" ");
         if(pattern.length() != words.length){
            return false;
         }
        
        for(int i = 0 ; i < words.length ; i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(!chm.containsKey(ch)){
                if(wordm.containsKey(word)){
                    return false;
                }
                else{
                    chm.put(ch,word);
                    wordm.put(word,ch);
                }
            }else{
                String mappedword = chm.get(ch);
                if(!mappedword.equals(word)){
                    return false;
                }

            }
        }
        return true;
    }
}