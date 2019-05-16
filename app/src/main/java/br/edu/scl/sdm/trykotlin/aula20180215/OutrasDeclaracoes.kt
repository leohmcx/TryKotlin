package br.edu.scl.sdm.trykotlin.aula20180215

fun main() {
    // String com tipo explícito.
    var nome: String = "Leonardo"

    // Tipo determinado implicitamente
    var sobrenome = "Cornachione"

    // Var e val podem ser inicializados a posteriori
    var nomeMeio: String
    nomeMeio = "Henrique M."

    // Float
    var altura: Float = 1.74f

    // Inteiro
    var idade: Int = 36

    var peso: Double = 72.toDouble()
    println("Nome: ${nome} $nomeMeio $sobrenome\n" +
            "Altura: ${altura}\n" +
            "Idade: ${idade}\n" +
            "Peso: ${peso}")
}