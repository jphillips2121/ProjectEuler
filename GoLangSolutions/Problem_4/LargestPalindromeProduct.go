package main

import (
	"fmt"
	"strconv"
)

func main() {
	num1 := 1
	num2 := 1
	highestNum := 1
	for num1 < 1000 {
		for num2 < 1000 {
			totalNum := strconv.Itoa(num1 * num2)
			if isReversedSame(totalNum) {
				if num, _ := strconv.Atoi(totalNum); num > highestNum {
					highestNum = num
				}
			}
			num2++
		}
		num1++
		num2 = 1
	}
	fmt.Println(highestNum)
}

func isReversedSame(num string) bool {
	runes := []rune(num)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	if string(runes) == num {
		return true
	}
	return false
}
