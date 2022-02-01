import java.util.Scanner;

// Instanciamos Scanner
val scanner = Scanner(System.`in`)

class Calculator(name: String) {

    init {
        println("Bienvenido $name.")
    }

    // Métodos
    fun add(num1: Int, num2: Int) = println("El resultado de la suma es:\n${num1 + num2}")

   	fun subtract(num1: Int, num2: Int) = println("El resultado de la resta es:\n${num1 - num2}")
    
    fun multiply(num1: Int, num2: Int) = println("El resultado de la multiplicación es:\n${num1 * num2}")
    
    fun divide(num1: Int, num2: Int) = println("El resultado de la división es:\n${num1 / num2}")

}

// Solicitamos el nombre del usuario
fun nameRequest(): String {
    var input: String

    println("Ingrese su nombre")
    input = readLine().toString()

    return input
}

// Recibimos los números que utilizará el usuario
fun userNumber(): Int {
    println("Debes ingresar un número para que nuestra cálculadora pueda trabajar")

    var num = scanner.nextInt()

    return num
}

// Generamos el menú de nuestra aplicación:
fun menuApplication(): Int {
    var input: Int
    while (true) {
        println("*** Menú ***\n1) Sumar\n2) Restar\n3) Multiplicación\n4) División\n5) Salir")
        println("Ingrese una opción")

        input = scanner.nextInt()

        if (input > 0 && input < 6) break else continue 
    }

    return input
}


fun main() {
    val name = nameRequest()
    val calculator = Calculator(name)

    // Almacenamos los números del usuario
    var numA = userNumber()
    var numB = userNumber()
    var optionMenu = menuApplication()

    when(optionMenu) {
        1 -> calculator.add(numA, numB)
        2 -> calculator.subtract(numA, numB)
        3 -> calculator.multiply(numA, numB)
        4 -> calculator.divide(numA, numB)
        5 -> println("Muchas gracias por probar esta aplicación")
    }
}











