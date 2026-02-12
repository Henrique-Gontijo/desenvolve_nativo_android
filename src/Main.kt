fun dividir(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Erro: Não é possível dividir por zero!")
        0 // Retorna um valor padrão
    }
}

fun main() {
    try {
        val resultado = 10 / 0 // ERRO: divisão por zero
        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("Erro: Divisão por zero não permitida!")
    } finally {
        println("Finalizando operação.") // Sempre será executado
    }

    //O bloco try tenta dividir 10 por 0 (o que causa erro).
    //O catch captura o erro (ArithmeticException) e imprime uma mensagem.
    //O finally sempre será executado, independentemente do erro.

    println("\n------------------------------------------------------------\n")

    val resultado = dividir(10, 0)
    println("Resultado: $resultado")

    println("\n------------------------------------------------------------\n")

    val numeros = listOf(1, 2, 3)
    try {
        println(numeros[5]) // ERRO: índice inválido
    } catch (e: IndexOutOfBoundsException) {
        println("Erro: Índice fora dos limites da lista!")
    }

    println("\n------------------------------------------------------------\n")

    val input = "abc" // Entrada inválida
    try {
        val numero = input.toInt() // ERRO: conversão inválida
        println("Número: $numero")
    } catch (e: NumberFormatException) {
        println("Erro: Entrada inválida! Digite um número.")
    }

    println("\n------------------------------------------------------------\n")

    try {
        val lista = listOf(1, 2, 3)
        val numero = "abc".toInt() // ERRO: Conversão inválida
        println(lista[5]) // ERRO: Índice fora dos limites
    } catch (e: NumberFormatException) {
        println("Erro: Conversão de string para número falhou.")
    } catch (e: IndexOutOfBoundsException) {
        println("Erro: Índice fora dos limites da lista!")
    } catch (e: Exception) { // Captura qualquer outro erro
        println("Erro desconhecido: ${e.message}")
    }

    /*

    println("\n------------------------------------------------------------\n")

    */
}