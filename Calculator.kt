class Calculator(name: String) {
  init {
    println("Bienvenido $name")
  }

  fun add(num1: Int, num2: Int) = println("${num1 + num2}")
  fun subtract(num1: Int, num2: Int) = println("${num1 - num2}")
  fun multiply(num1: Int, num2: Int) = println("${num1 * num2}")
  fun divide(num1: Int, num2: Int) = println("${num1 / num2}")

}

fun main() {
  val myCalculator = Calculator("Goonies")

  myCalculator.add(2, 5)
  myCalculator.subtract(10, 20)
  myCalculator.multiply(5, 5)
  myCalculator.divide(100, 58)

  
}
