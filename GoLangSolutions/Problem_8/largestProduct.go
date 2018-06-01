package main

import (
	"fmt"
	"io/ioutil"
	"strconv"
)

func main() {
	b, err := ioutil.ReadFile("digits.txt")
	if err != nil {
		fmt.Println(err)
	}
	str := []rune(string(b))

	maxMultiple := 0
	for i := 0; i < len(str)-13; i++ {
		thirteenDigitMuliple := str[i : i+13]
		if multiplesOfNum(string(thirteenDigitMuliple)) > maxMultiple {
			maxMultiple = multiplesOfNum(string(thirteenDigitMuliple))
		}
	}
	fmt.Println(maxMultiple)
}

func multiplesOfNum(num string) int {
	totalMultiple := 1
	for _, char := range num {
		charNum, _ := strconv.Atoi(string(char))
		totalMultiple = totalMultiple * charNum
	}
	return totalMultiple
}
