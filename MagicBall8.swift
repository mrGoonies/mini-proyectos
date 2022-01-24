import UIKit

// Geeneramos la respuesta para nuestro usuario
func generatingResponse() -> String {
    var randomNumber = UInt8.random(in: 1...9) // se genera un número aleatorio
    var answer: String = String()
    
    switch randomNumber {
    case 1:
        answer = "Sí, definitivamente"
    case 2:
        answer = "Sin duda"
    case 3:
        answer = "Respuesta confusa, intenta otra vez"
    case 4:
        answer = "Pregúntame más tarde"
    case 5:
        answer = "Mis fuentes dicen que no"
    case 6:
        answer = "Muy dudoso"
    default:
        print("Creo que estoy defectuoso o tu pregunta no tiene respuesta")
    }
    
    return answer
    
}


// Generamos una pregunta por medio de un arreglo
func userQuestion() -> String{
    let questions = ["¿Seré millonario?", "¿Soy fachero?", "¿Soy jóven?", "¿?"]
    let question = questions.randomElement()! // Almacena la pregunta aleatoria
    
    if !question.isEmpty {
        print("Su pregunta a sido entregada a nuestra bóla mágica")
        
    } else {
        print("Lo siento pero no sea procesado ningúna pregunta")
    }
    
    return question
    
}


func main() {
    let question = userQuestion()
    let answer = generatingResponse()
    
    print("Pregunta del usuario: \(question)")
    print("La respuesta es: \(answer)")
    
}


main()

