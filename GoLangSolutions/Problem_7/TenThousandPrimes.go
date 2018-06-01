package main

import "fmt"

func main() {
	fmt.Println(getToPrimeFactor(1, 10001))
}

func getToPrimeFactor(num, iteration int) int {
	prime := false
	for prime == false {
		num++
		prime = isPrime(num)
	}
	if iteration > 1 {
		return getToPrimeFactor(num, iteration-1)
	}
	return num
}

func isPrime(num int) bool {
	for i := 2; i <= num/2; i++ {
		if num%i == 0 {
			return false
		}
	}
	return true
}
