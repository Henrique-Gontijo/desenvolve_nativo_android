//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val idade = 18
    if (idade < 12) {
        println("Criança")
    } else if (idade < 18) {
        println("Adolescente")
    } else {
        println("Adulto")
    }

    println("\n------------------------------------------------------------\n")

    val numero = 10
    val resultado = if (numero % 2 == 0) "Par" else "Ímpar"
    println("O número é $resultado")

    println("\n------------------------------------------------------------\n")

    val dia = 3
    val nomeDoDia = when (dia) {
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "Dia inválido"
    }
    println("O dia correspondente é: $nomeDoDia")

    println("\n------------------------------------------------------------\n")

    val valor: Any = "cinco" // Pode ser qualquer tipo de dado
    val resultado1 = when (valor) {
        is Int -> "O número é um inteiro: $valor" // Verifica se é um número inteiro
        is Double -> "O número é um decimal: $valor" // Verifica se é um Double
        is String -> "Você digitou um texto: $valor" // Verifica se é uma String
        in 1..10 -> "Número entre 1 e 10" // Verifica se o valor está dentro da faixa de 1 a 10
        "Kotlin" -> "Você digitou a linguagem Kotlin!" // Verifica um valor específico
        else -> "Tipo desconhecido"
    }
    println(resultado1)
}