package br.edu.scl.sdm.trykotlin.aula20190301

fun processaInteiro(i: Int, f: (j: Int) -> Int): Int {
    return f(i)
}

fun inverte(x: Int): Int = x * -1

infix fun Int.executa(f: (Int) -> Int): Int {
    return f(this)
}

fun main() {
    // passando uma função comum como parâmetro
    val n: Int = processaInteiro(10, ::inverte)
    println(n)

    // passando uma função lambda como parâmetro
    // o que há após a seta é o que a função irá executar
    // x antes da seta é o parametro passado para a função
    // o retorno da função é exatamente o esperado pelo q ela irá executar.
    val n2: Int = processaInteiro(11, {x -> -1 * x})
    println(n2)

    // passando uma função lambda como parâmetro com um parametro apenas.
    val n3: Int = processaInteiro(12, {-1 * it})
    println(n3)

    // passando uma função lambda como último parâmetro.
    // quando a função é o ultimo parametro podemos jogar a implentação para fora do parênteses.
    val n4: Int = processaInteiro(13) {-1 * it}
    println(n4)

    // Passando lambda para a função estendida
    // it = 14 neste caso
    val n5: Int = 14.executa { -1 * it }
    println(n5)

    // Passando lambda para a função estendida (para usar desta forma tem q colocar o infix no inicio da fan)
    val n6: Int = 15 executa { -1 * it }
    println(n6)

    // Atribuindo uma lambda a uma variável
    val funcaoLambda: (Int) -> Int = {x: Int -> -1 * x}
    val n7: Int = processaInteiro(16, funcaoLambda)
    println(n7)

    val funcaoLambda2 = {x: Int -> -1 * x}
    val n8: Int = processaInteiro(16, funcaoLambda)
    println(n8)
}