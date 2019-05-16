package br.edu.scl.sdm.trykotlin.aula20190301

/**
 * Crie uma função de alta ordem genérica (xpto) que receba como parâmetro
 * qualquer uma das duas funções dadas no exercício 3 (soma e cat) e solte
 * a seguinte saída.
 */

fun <T> xpto(i: T, j: T, f: (T, T) -> T): T = f(i, j)

fun main() {
    println(xpto(2, 3, ::soma))
    println(xpto("Jo", "ão", ::cat))
}