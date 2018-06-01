package main

import "fmt"

func main() {
	fmt.Println(fibSum(0, 1, 1))
}

func fibSum(sum, a, b int) (int, int, int) {
	if b < 4e6 {
		if b%2 == 0 {
			sum += b
		}
		tempa := a
		a = b
		b = tempa + b
		return fibSum(sum, a, b)
	}
	return sum, 0, 0
}
