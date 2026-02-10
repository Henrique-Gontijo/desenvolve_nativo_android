class Carro {
    var modelo: String = "Desconhecido"
    var ano: Int = 0
    fun ligar() {
        println("O carro $modelo está ligado.")
    }
}

//Construtor Primário
class Pessoa(val nome: String, val idade: Int) {
    fun saudacao() {
        println("Olá, meu nome é $nome e tenho $idade anos.")
    }
}

//Construtor Secundário
class Animal {
    var nome: String
    var especie: String
    constructor(nome: String, especie: String) {
        this.nome = nome
        this.especie = especie
    }
    fun som() {
        println("$nome faz um som.")
    }
}

fun main() {
    val meuCarro = Carro() // Criando um objeto da classe Carro
    meuCarro.modelo = "Fusca"
    meuCarro.ano = 1970
    println("Modelo: ${meuCarro.modelo}, Ano: ${meuCarro.ano}")
    meuCarro.ligar()

    //Criamos uma classe Carro com dois atributos (modelo, ano) e um metodo (ligar).
    //No main(), criamos um objeto meuCarro e atribuimos valores a ele.
    //Chamamos o metodo ligar(), que imprime uma mensagem.

    println("\n------------------------------------------------------------\n")

    val pessoa1 = Pessoa("Carlos", 25)
    pessoa1.saudacao()

    println("\n------------------------------------------------------------\n")

    val cachorro = Animal("Rex", "Cachorro")
    cachorro.som()

    /*
    println("\n------------------------------------------------------------\n")

    println("\n------------------------------------------------------------\n")

    println("\n------------------------------------------------------------\n")

    */
}