// Función recursiva
fun countDown(secondsToMidnight: Int) {
    // Caso Base
    if (secondsToMidnight == 0) {
        println("Feliz Año Nuevo!")
    } else {
        println(secondsToMidnight)
        // Llamada recursiva
        countDown(secondsToMidnight - 1)
    }
}


fun main() {
    countDown(10)
}
