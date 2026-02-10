//private vs public
class ContaBancaria {
    var titular: String = "Cliente" // Public (padrão)
    private var saldo: Double = 1000.0 // Apenas acessível dentro da classe
    fun exibirSaldo() {
        println("Saldo: R$$saldo")
    }
}

open class Animal(val nome: String) {
    open fun som() {
        println("$nome faz um som!")
    }
}
class Cachorro(nome: String) : Animal(nome) {
    override fun som() {
        println("$nome late! 🐶")
    }
}

class Usuario {
    var nome: String = "Desconhecido"
        private set // Só pode ser alterado dentro da classe
    fun definirNome(novoNome: String) {
        if (novoNome.isNotBlank()) {
            nome = novoNome
        }
    }
}

abstract class Forma {
    abstract fun calcularArea(): Double // Metodo abstrato (obrigatório)
    fun descricao() {
        println("Essa é uma forma geométrica.")
    }
}
class Circulo(val raio: Double) : Forma() {
    override fun calcularArea(): Double {
        return 3.14 * raio * raio
    }
}

fun main() {
    val conta = ContaBancaria()
    println(conta.titular) // ✅ Funciona

    // println(conta.saldo) ❌ ERRO! `saldo` é privado
    conta.exibirSaldo() // ✅ Metodo acessa `saldo` internamente

    println("\n------------------------------------------------------------\n")

    val animal = Animal("Animal Genérico")
    val dog = Cachorro("Rex")

    animal.som() // Comportamento da classe pai
    dog.som() // Polimorfismo: comportamento modificado na subclasse

    println("\n------------------------------------------------------------\n")

    val usuario = Usuario()

    // usuario.nome = "Carlos" ❌ ERRO! (private set)
    usuario.definirNome("Carlos") // ✅ Metodo altera o nome

    println(usuario.nome) // ✅ Acesso permitido

    println("\n------------------------------------------------------------\n")

    val circulo = Circulo(5.0)
    println("Área do círculo: ${circulo.calcularArea()}")
    circulo.descricao()

    //A classe Forma é abstrata e contém o metodo calcularArea(), que deve ser implementado nas subclasses.
    //A classe Circulo implementa calcularArea() e retorna a área corretamente.

    /*

    println("\n------------------------------------------------------------\n")

    println("\n------------------------------------------------------------\n")

    */
}