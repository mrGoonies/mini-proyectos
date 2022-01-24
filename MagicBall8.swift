import UIKit

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
    
    print("Pregunta del usuario: \(question)")
}


main()

