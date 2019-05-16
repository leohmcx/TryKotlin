package br.edu.scl.sdm.trykotlin.aula20190301

//Funções de alta ordem
fun processaInteiro1(i: Int, f: (Int) -> Int): Int = f(i)
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int = f(i, j)

// Funções
fun soma1(i: Int, j: Int): Int = i + j

fun multiplica(i: Int, j: Int): Int = i * j
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}

// main
fun main() {
    // 1. Chamadas do primeiro passo
    println(processaInteiros(10, 20, ::soma1))
    println(processaInteiros(10, 20, ::multiplica))
    println(processaInteiro1(16, ::raizQuadrada))

    // 2. Chamadas do primeiro passo
    println(processaInteiros(10, 20) { i, j -> i + j})
    println(processaInteiros(10, 20) { i, j -> i * j})
    println(processaInteiro1(10, i -> i {

    })
}