class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int original = x;
        int result = 0;

        while (x > 0) {
            int last = x % 10;  
            result = result * 10 + last; 
            x /= 10;
        }
        
        return original == result;
    }
}
