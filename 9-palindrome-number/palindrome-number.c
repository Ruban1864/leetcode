bool isPalindrome(int x) {
    long original = x;
    long result = 0;
     if( x < 0)
        return false;

    while( x>0){
        long last = x % 10;
        result = result *10 +last ;
        x /= 10;
    }
    return original == result;
    
}