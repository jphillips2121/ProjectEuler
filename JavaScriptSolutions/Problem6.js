function sumOfSqrs(num) {
  var total = 0
  for (var i = 1; i <= num; i++) {
    total += i * i
  }
  return total
}

function sqrOfSums(num) {
  var total = 0
  for (var i = 1; i <= num; i++) {
    total += i
  }
  return total * total
}

const num = 100
console.log(sqrOfSums(num) - sumOfSqrs(num))
