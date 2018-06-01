
function fibSeries(maxNum) {
  var n1 = 1
  var n2 = 2
  var total = 2

  while (n2 < maxNum) {
    var num = n1 + n2
    n1 = n2
    n2 = num
    if (num % 2 == 0) {
      total += num
    }
  }
  return total
}

console.log(fibSeries(4000000))
