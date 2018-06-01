function isDivisibleByMax(num, maxNum) {
  for (var i = 2; i <= maxNum; i++) {
    if (!(num % i == 0)) {
      return false
    }
  }
  return true
}

num = 20
while (!isDivisibleByMax(num, 20)) {
  num += 1
}

console.log(num)
