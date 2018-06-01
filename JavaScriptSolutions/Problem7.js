function nextPrime(num) {
  num += 1
  if (isPrime(num)) {
    return num
  }
  return nextPrime(num)
}

function isPrime(num) {
  for (var i = 2; i <= num/2; i++) {
    if (num % i == 0) {
      return false
    }
  }
  return true
}

function findNthPrime(num) {
  var numOfPrimes = 1;
  var currentPrime = 2;
  while (numOfPrimes < num) {
    currentPrime = nextPrime(currentPrime)
    numOfPrimes += 1
  }
  return currentPrime
}

console.log(findNthPrime(10001))
