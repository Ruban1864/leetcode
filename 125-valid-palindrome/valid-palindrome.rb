# @param {String} s
# @return {Boolean}
def is_palindrome(s)
    s = s.gsub(/[^a-zA-Z0-9]/, '').downcase
    s == s.reverse
end