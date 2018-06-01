function getPrime(num) {
    var isPrime = false;
    var divideNum = 2;
    while (!isPrime) {
      if (num % divideNum == 0) {
        isPrime = true
      }
      else {
        divideNum += 1
      }
    }
    return divideNum
}

function findHighestPrime(num) {
  var highestPrime = 1
  while (num > 1) {
    if (getPrime(num) > highestPrime) {
      highestPrime = getPrime(num)
    }
    num = num / getPrime(num)
  }
  return highestPrime
}

console.log(findHighestPrime(600851475143))
