class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2= t.toCharArray();

        if(s.length() != t.length()){
            return false;
        }
        else{
           Arrays.sort(arr1);
           Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        }
        
    }
}