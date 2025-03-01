func isPalindrome(s string) bool {
    var filtered []rune
    for _, ch := range s {
        if unicode.IsLetter(ch) || unicode.IsDigit(ch) {
            filtered = append(filtered, unicode.ToLower(ch))
        }
    }
    reversed := make([]rune, len(filtered))
    copy(reversed, filtered)
    for i, j := 0, len(reversed)-1; i < j; i, j = i+1, j-1 {
        reversed[i], reversed[j] = reversed[j], reversed[i]
    }
    return string(filtered) == string(reversed)
}
