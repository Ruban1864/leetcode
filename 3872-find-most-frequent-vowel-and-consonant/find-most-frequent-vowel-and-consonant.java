class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowel = new HashMap<>();
        Map<Character,Integer> consoanant = new HashMap<>();
        String vowels = "aeiou";
        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) !=-1){
                vowel.put(ch , vowel.getOrDefault(ch,0)+1);
            }else{
                consoanant.put(ch , consoanant.getOrDefault(ch,0)+1);
            }
        }
        int maxvowel = 0;
        int maxconsonant =0;
        for(int freq : vowel.values()){
            maxvowel =Math.max(maxvowel,freq);
        }
        
        for(int freq : consoanant.values()){
            maxconsonant =Math.max(maxconsonant,freq);
        }
        return maxvowel + maxconsonant;
    }
}