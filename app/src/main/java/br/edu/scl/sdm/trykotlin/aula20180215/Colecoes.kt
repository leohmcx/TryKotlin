package br.edu.scl.sdm.trykotlin.aula20180215

fun main() {
    listOf<String>() // retorna lista nova de string imutável
    mutableListOf<String>() // retorna uma lista nova de string mutável

    // List (you can't add and remove) e MutableList (you can add and remove)
    var familia: List<String> = listOf<String>("Leonardo", "Lucas", "Jair", "Albani")

    // familia.add("paçoca") // erro pois a lista é imutavel

    // percorrendo usando FOR
    for (individuo in familia) {
        println(individuo)
    }

    /**
     * Formas de declaração e iteração de listas
     */

    val listaInteiros: List<Int> = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Percorrer usando FOR usando IntRange
    for (i in 0..9) {
        print(listaInteiros[i])
    }

    val listaInteiros2: List<Int> = (1..11).toList()
    // Percorrer usando FOR usando IntRange
    println("val listaInteiros2: List<Int> = (1..10).toList()")
    println("for(i in 0..9){")
    for (i in 0..9) {
        print(listaInteiros2[i])
    }

    val listaInteiros3: List<Int> = (1..20 step 2).toList()
    // Percorrer usando FOR usando IntRange
    println("val listaInteiros3: List<Int> = (1..10 step 2).toList()")
    println("for(i in 0..9){")
    for (i in 0..9) {
        print(listaInteiros3[i])
    }

    val listaInteiros4: List<Int> = (1..10 step 2).toList()
    // Percorrer usando FOR usando IntRange
    println("val listaInteiros4: List<Int> = (1..10 step 2).toList()")
    println("for(i in 0..listaInteiros4.size - 1){")
    for (i in 0..listaInteiros4.size - 1) {
        print(listaInteiros4[i])
    }

    // Lista Mutavel
    val listaCursos: MutableList<String> = mutableListOf<String>("Sistemas para dispositivos moveis")
    // Adicionando intem
    listaCursos.add("Técnico em informática para internet")
    //foreach usando LAMBDA
    listaCursos.forEach { println(it) }
}