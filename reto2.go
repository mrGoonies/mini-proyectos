package main

import "fmt"

func sayHello(name string, lastname string) string {
	var message string = fmt.Sprintf("Hi %s %s\n", name, lastname)

	return message

}

func main() {
	var firstName string
	var lastname string

	// Input user
	fmt.Println("Ingresa tu nombre")
	fmt.Scanln(&firstName)

	fmt.Println("Ingresa tu apellido")
	fmt.Scanln(&lastname)

	messageForScreen := sayHello(firstName, lastname)

	fmt.Printf(messageForScreen)

}
