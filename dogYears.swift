import UIKit
import Foundation

// Solicitamos la raza del perro
func getDogBreed() -> UInt16{
    var option: UInt16
    
    print("Ingrese la raza de su mascota")

    while (true) {
        print("1) Pequeña (menor a 10 kilos)")
        print("2) Mediana (entre 10 a 22 kilos)")
        print("3) Grande (entre 23 a 40 kilos")
        print("**************\nIngrese una opción\n>> ")
        
        var userOption: String = readLine()
        option = UInt16?(userOption)
        
        
        if (option > 0 && userOption < 4) {
            break;
        } else {
            print("Haz ingresado una opción incorrecta.\nDebes reingresar una opción correcta")
            continue
        }
    }
    
    return option

}


// Entry Point de aplicación:
func main() {
    var dogBreed = getDogBreed()
    
    
    
}

main()



