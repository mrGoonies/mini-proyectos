import java.util.Scanner;

// Instanciamos la clase Scanner
val input = Scanner(System.`in`)

// Mostramos las tareas ingresadas por el usuario
fun displayTask(tsks: MutableList<String>) {
    var i: Byte = 0 // Contador para cada tarea

    println("To Do List")
    println("*****************")

    for (task in tsks) {
        println("Tarea nº ${i+1}:\n\t$task")
        i++
    }

    println("*****************")
}

// Almacenamos las tareas que el usuario realizará
fun taskList(cant: Byte): MutableList<String> {
    // Almacenamos las tareas dentro de esta lista
    var tasks = mutableListOf<String>()

    for (i in 0..cant) {
        println("Ingrese la tarea nº ${i+1}")
        var taskDetail = input.nextLine()

        tasks.add(taskDetail)
    }

    return tasks


}

// Se solicita al usuario la cantidad de tareas que va a realizar
fun numberOfTasks(): Byte {
    var nTask: Byte

    while (true) {
        println("Ingrese la cantidad de tareas que debes realizar hoy")
        nTask = input.nextByte()

        if (nTask > 0) {
            println("La cantidad a sido ingresada")
            break
        } else {
            println("Lo siento, pero debes ingresar una cantidad mayor a 0")
            continue
        }
    }
    println("***************")

    nTask--
    return nTask
}

fun main(args: Array<String>) {
    val numberTsk = numberOfTasks()
    val task = taskList(numberTsk)
    displayTask(task)



}
