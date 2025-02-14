class Solution {
    public String reverseWords(String s) {
        s = s.trim();
         String[] word = s.split("\\s+");
         StringBuilder reverse = new StringBuilder();

         for(int i = word.length -1 ; i >= 0 ; i--){
            reverse.append(word[i]);
            if(i > 0){
                reverse.append(" ");
            }
         }
         return reverse.toString();        
    }
}