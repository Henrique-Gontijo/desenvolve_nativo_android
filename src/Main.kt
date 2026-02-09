//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun saudacao1() {
    println("Olá, bem-vindo ao Kotlin!")
}

fun saudacao2(nome: String) {
    println("Olá, $nome! Seja bem-vindo.")
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

inline fun mensagem() {
    println("Esta é uma função inline!")
}
fun operar(numero: Int, operacao: (Int) -> Int): Int {
    return operacao(numero)
}

fun main() {
    saudacao1()

    println("\n------------------------------------------------------------\n")

    saudacao2("Maria")
    saudacao2("João")


    println("\n------------------------------------------------------------\n")

    val resultado1 = somar(10, 5)
    println("Resultado da soma: $resultado1")

    println("\n------------------------------------------------------------\n")

    mensagem()

    println("\n------------------------------------------------------------\n")

    //Exemplo de Expressão Lambda
    val dobrar: (Int) -> Int = { numero -> numero * 2 }
    println("O dobro de 5 é: ${dobrar(5)}")


    println("\n------------------------------------------------------------\n")

    val resultado2 = operar(4) { it * 3 }
    println("O resultado é: $resultado2")

}