function findLargestPalindrome(maxMultiple) {
  var maxPalindrome = 1
  for (var i = 1; i <= maxMultiple; i++) {
    for (var j = 1; j <= maxMultiple; j++) {
      if (isPalindromeNumber(i * j) && (i * j > maxPalindrome)) {
        maxPalindrome = i * j
      }
    }
  }
  return maxPalindrome
}

function isPalindromeNumber(num) {
  num = num + ""
  if (num == num.split("").reverse().join("")) {
    return true
  }
  return false
}

console.log(findLargestPalindrome(999))
