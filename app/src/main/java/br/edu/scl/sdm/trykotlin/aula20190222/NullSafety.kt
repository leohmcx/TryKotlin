package br.edu.scl.sdm.trykotlin.aula20190222

fun main() {
    var nome: String
    nome = "Leonardo"

    /**
     * Determinar que uma variável pode receber
     * nulo deve ser adicionado o Elvis ?
      */
    var sobrenome: String?
    sobrenome = null

    /**
     * Caso sobrenome for null recebe Cornachione como valor.
     */
    var sn: String
    sn = sobrenome?:"Cornachione"

    /**
     * Se for verificado se a variavel possuí valor
     * antes da execuação de um método, este não gera
     * erro de compilação/execução.
     */
    if(sobrenome !=null){
        println(sobrenome.capitalize())
        println(sobrenome.length)
    }

    /**
     * Para este caso o Kotlin se protege na execução
     * do método, executando apenas se a variável
     * tiver valor, caso contrário imprime NULL.
     */
    println(sobrenome?.capitalize())
    println(sobrenome?.length)

    /**
     * estou assumindo que esta variavel terá um valor.
      */
    try{
        println(sobrenome!!.capitalize())
        println(sobrenome!!.length)
    } catch (kne: KotlinNullPointerException){
        println("Deu exceção, mané!")
    }

}