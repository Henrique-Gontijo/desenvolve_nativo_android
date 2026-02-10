fun main() {
    val numeros1 = arrayOf(10, 20, 30, 40, 50)

    println(numeros1[0]) // Primeiro elemento
    println(numeros1[2]) // Terceiro elemento

    println("\n------------------------------------------------------------\n")

    val frutas1 = listOf("Maçã", "Banana", "Uva")

    println(frutas1[0]) // Acessa o primeiro elemento
    println(frutas1.size) // Tamanho da lista

    println("\n------------------------------------------------------------\n")

    val numeros2 = mutableListOf(1, 2, 3)

    numeros2.add(4) // Adiciona um elemento
    numeros2.removeAt(1) // Remove o segundo elemento
    numeros2[0] = 10 // Modifica o primeiro elemento
    println(numeros2) // Saída: [10, 3, 4]


    println("\n------------------------------------------------------------\n")

    val frutas2 = listOf("Maçã", "Banana", "Uva")

    for (fruta in frutas2) {
        println(fruta)
    }

    println("\n------------------------------------------------------------\n")

    val numeros3 = listOf(1, 2, 3, 4)

    numeros3.forEach { numero ->
        println("Número: $numero")
    }

    println("\n------------------------------------------------------------\n")

    val numeros4 = listOf(10, 20, 30)

    var i = 0
    while (i < numeros4.size) {
        println("Número: ${numeros4[i]}")
        i++
    }


}