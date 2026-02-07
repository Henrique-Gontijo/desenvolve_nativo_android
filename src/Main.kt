//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nome = "Maria" // `val` - Não pode ser alterado depois
    var idade = 25 // `var` - Pode ser alterado
    println("Nome: $nome, Idade: $idade")
    idade = 26 // Permitido, pois `idade` é um `var`
    println("Nova idade: $idade")
    // nome = "João" // ❌ Erro! `val` não pode ser modificado

    println("\n------------------------------------------------------------\n")

    val numeroInt: Int = 10
    val numeroDouble: Double = 5.5
    val condicao: Boolean = true
    val texto: String = "Aprendendo Kotlin!"
    println("Numero inteiro: $numeroInt")
    println("Numero decimal: $numeroDouble")
    println("Valor booleano: $condicao")
    println("Texto: $texto")

    println("\n------------------------------------------------------------\n")

    print("Digite seu nome: ")
    val name = readLine() // Lê um texto digitado pelo usuário
    print("Digite sua idade: ")
    val old = readLine()?.toIntOrNull() // Converte para `Int`, evitando erro caso o usuário digite algo inválido
    println("Olá, $name! Você tem $old anos.")

    println("\n------------------------------------------------------------\n")

    val a = 10
    val b = 3
    println("Soma: ${a + b}") // 13
    println("Subtração: ${a - b}") // 7
    println("Multiplicação: ${a * b}") // 30
    println("Divisão: ${a / b}") // 3 (Inteiro)
    println("Módulo: ${a % b}") // 1 (Resto da divisão)
}