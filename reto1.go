package main

import "fmt"

func circuleArea() {
	pi := 3.1416
	radius := 15.43
	resutl := pi * (radius * radius)

	fmt.Println("El área del círuclo es: ", resutl)

}

func trapezoidArea() {
	a := 2
	b := 300
	h := 520
	resutl := (a + b) * h

	fmt.Println("El área del trapecio es: ", resutl)

}

func squareArea() {
	x := 15
	result := x * x

	fmt.Println("El área del cuadrado es: ", result)

}

func main() {
	// Cálcular el área de un cuadrado, trapecio y un círculo.
	squareArea()
	trapezoidArea()
	circuleArea()

}
