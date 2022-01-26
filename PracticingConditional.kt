fun main() {
  val quizAnswer1 = 15
  var quizAnswer2 = 3
  val quizAnswer3 = "isosceles"
  val quizAnswer4 = 47

  // Imprimir preguntas y solicitar input usuario
  println("What is 75 / 5")
  var studentAnswer1 = Integer.valueOf(readLine())

  println("6 * 2y = 36")
  var studentAnswer2 = Integer.valueOf(readLine())

  println("¿Cuál es el nombre del triángulo que tiene dos lados iguales?")
  var studentAnswer3 = readLine()

  println("8 * 6 - (3 - 2)")
  var studentAnswer4 = Integer.valueOf(readLine())

  // Almacenamos los puntos por respuesta correcta
  var points = 0 

  // Comprobación de respuesta  
  if (studentAnswer1 == quizAnswer1) {
    points += 25
  } 

  if (studentAnswer2 == quizAnswer2) {
    points += 25
  }

  if (studentAnswer3 == quizAnswer3) {
    points += 25
  }

  if (studentAnswer4 == quizAnswer4) {
    points += 25
  }
  
  println("****************************")
  println("Tu calificación es:")

  when (points) {
    in 0..59 -> println("F")
    in 60..69 -> println("D")
    in 70..79 -> println("C")
    in 80..89 -> println("B")
    in 90..100 -> println("A")
    in 101..110 -> println("A+")
    else -> println("Por favor, debes contestar las preguntas del exámen")
  }

  println("****************************")
}
