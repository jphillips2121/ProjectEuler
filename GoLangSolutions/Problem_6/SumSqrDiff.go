package main

import "fmt"

func main() {
	answer := sqrSum(100) - sumSqr(100)
	fmt.Println(answer)
}

func sumSqr(num int) int {
	total := 0
	for i := 1; i <= num; i++ {
		total += i * i
	}
	return total
}

func sqrSum(num int) int {
	total := 0
	for i := 1; i <= num; i++ {
		total += i
	}
	return total * total
}
