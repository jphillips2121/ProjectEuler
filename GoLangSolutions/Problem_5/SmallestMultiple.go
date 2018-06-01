package main

import "fmt"

func main() {
	smallestMultipleFound := false
	multipleAttempt := 2520
	for smallestMultipleFound == false {
		multipleAttempt += 2520
		if isDivisibleByNumbers(multipleAttempt) {
			smallestMultipleFound = true
		}
	}
	fmt.Println(multipleAttempt)
}

func isDivisibleByNumbers(num int) bool {
	for i := 1; i <= 20; i++ {
		if num%i != 0 {
			return false
		}
	}
	return true
}
