package br.edu.scl.sdm.trykotlin.aula20190301

/**
 * Exercício 3
 * Dada as funções abaixo e as chamadas na função main. Crie duas funções (foo e bar) de
 * alta ordem que recebam estas funções como parâmetro e soltem as seguinte saída
 *
 * 30
 * Pedro
 */
fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}${j}"

fun foo(i: Int, j: Int, funcao: (i: Int, j: Int) -> Int): Int {
    return funcao(i, j)
}

fun bar(i: String, j: String, funcao: (i: String, j: String) -> String): String {
    return funcao(i, j)
}

fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
}