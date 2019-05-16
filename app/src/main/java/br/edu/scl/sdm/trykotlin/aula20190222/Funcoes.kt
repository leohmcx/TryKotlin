package br.edu.scl.sdm.trykotlin.aula20190222

/* Função simples */
/*fun multiplo(a: Int, b: Int): Boolean {
    val c: Int = a % b
    if(c == 0){
        return true
    }
    return false
}*/

/* SINGLE-EXPRESSION */
fun multiplo(a: Int = 10, b: Int) = a % b == 0
//fun multiplo(a: Int = 10, b: Int) = if(a % b == 0) true else false

/* Função estendida
infix fun Int.multiplo(b: Int):Boolean {
    val c: Int = this % b
    if(c == 0){
        return true
    }
    return false
}*/

fun main() {
    // Pre-fixado (recebe multiplos parametros)
    println(multiplo(10, 2))

    // infixado (não recebe mais de um parametro) nome da função vai entre os parâmetrps.
    //10.multiplo(2)
    //println(10 multiplo 2)

    // pos-fixado

}