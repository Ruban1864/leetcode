object Solution {
  def isPalindrome(s: String): Boolean = {
    val filtered = s.toLowerCase.filter(_.isLetterOrDigit)
    filtered == filtered.reverse
}
}