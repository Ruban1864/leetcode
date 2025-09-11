import java.util.Arrays;

class Solution {
    public String sortVowels(String s) {
        String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                sb.append(ch);
            }
        }

        char[] vowelArray = sb.toString().toCharArray();
        Arrays.sort(vowelArray);

        char[] result = s.toCharArray();
        int pos = 0;
        for (int i = 0; i < result.length; i++) {
            if (vowels.indexOf(result[i]) != -1) {
                result[i] = vowelArray[pos++];
            }
        }

        return new String(result);
    }
}