package main

import "fmt"

func main() {
	num := 600851475143
	currentHighestPrime := 1
	for num > 1 {
		if getNextPrimeFactor(num) > currentHighestPrime {
			currentHighestPrime = getNextPrimeFactor(num)
		}
		num = num / getNextPrimeFactor(num)
	}
	fmt.Println(currentHighestPrime)
}

func getNextPrimeFactor(num int) (primeFactor int) {
	for i := 2; i < num/2; i++ {
		if num%i == 0 {
			return i
		}
	}
	return num
}
