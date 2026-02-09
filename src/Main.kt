//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    for (i in 1..5) { // De 1 até 5
        println("Número FOR: $i")
    }

    println("\n------------------------------------------------------------\n")

    var contador = 1
    while (contador <= 5) {
        println("Número WHILE: $contador")
        contador++ // Incrementa 1 a cada repetição
    }


    println("\n------------------------------------------------------------\n")

    for (i in 5 downTo 1) { // Conta de 5 até 1
        println("Contagem FOR: $i")
    }
    println("Boom! 🚀")

    println("\n------------------------------------------------------------\n")

    var numero = 5
    while (numero > 0) {
        println("Contagem WHILE: $numero")
        numero-- // Decrementa 1 a cada repetição
    }
    println("Lançamento! 🚀")

    println("\n------------------------------------------------------------\n")

    var soma = 0
    for (i in 1..5) {
        soma += i // soma = soma + i
    }
    println("A soma dos números de 1 a 5 é: $soma")

    println("\n------------------------------------------------------------\n")

    var soma1 = 0
    var numero1 = 1
    while (numero1 <= 5) {
        soma1 += numero1
        numero1++ // Incrementa o número
    }
    println("A soma dos números de 1 a 5 é: $soma1")
}