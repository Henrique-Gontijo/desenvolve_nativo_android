//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a = 10
    val b = 3
    println("Soma: ${a + b}") // 13
    println("Subtração: ${a - b}") // 7
    println("Multiplicação: ${a * b}") // 30
    println("Divisão: ${a / b}") // 3 (Inteiro)
    println("Módulo: ${a % b}") // 1 (Resto da divisão)

    println("\n------------------------------------------------------------\n")

    val idade = 25
    val temCarteira = true
    println("Pode dirigir? ${(idade >= 18) && temCarteira}") // true
    println("Precisa renovar CNH? ${(idade >= 18) || temCarteira}") // true
    println("Não tem carteira: ${!temCarteira}") // false



    println("\n------------------------------------------------------------\n")

    val resultado = 10 + 5 * 2 // Multiplicação tem prioridade
    println(resultado) // 20
    val resultadoCorreto = (10 + 5) * 2 // Parênteses alteram a ordem
    println(resultadoCorreto) // 30

    println("\n------------------------------------------------------------\n")

    val x = 10
    val y = 5
    val z = 2
    val expressao1 = x > y && y > z // true && true → true
    val expressao2 = x > y || x < z // true || false → true
    val expressao3 = !(x < y) // !(false) → true
    println("Expressão 1: $expressao1") // true
    println("Expressão 2: $expressao2") // true
    println("Expressão 3: $expressao3") // true
}