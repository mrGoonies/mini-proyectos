import UIKit

// Variables
var temp: Float =  341.2// Almacena los grados Fareenheeit
let formulaCelsius: Float = (temp - 32) / 1.8

print("Bienvenido al Convertidor de grados Farenheit a Celsius")
print("Trabajaremos con el siguiente grado Farenheit:\n\(temp)Fº")
print("***************")
print("Resultado:\n\(round(formulaCelsius))Cº")
