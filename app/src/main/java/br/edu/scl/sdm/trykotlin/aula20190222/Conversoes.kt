package br.edu.scl.sdm.trykotlin.aula20190222

fun main() {

    var numString: String = 10.toString()
    var numDouble: Double = numString.toDouble() // Involve round
    var numFloat: Float = numDouble.toFloat()
    var numInteiro: Int = numFloat.toInt()

    println(numInteiro.toString())

    // Cast AS
    val any: Any = "Any equivale a Object em Java"
    //val string: String = any as String

    // Smart Cast a partir do momento que se foi verificado q a variavel é string
    // automaticamente esta se torna uma string.
    if(any is String) {
        println("${any} é uma String")
    }
}