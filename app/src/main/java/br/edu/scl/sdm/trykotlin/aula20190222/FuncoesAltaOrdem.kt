package br.edu.scl.sdm.trykotlin.aula20190222

/* PASSANDO 1 FUNÇÃO POR PARÂMETRO */
    fun processaTexto(str1: String, str2: String, processa: (s1: String, s2: String) -> String): String {
        return processa(str1, str2)
    }
    fun concatena(a: String, b: String): String {
        return "${a}${b}"
    }
    fun inverte(a: String, b: String): String {
        return a.reversed() + b.reversed()
    }

/* ESTENDENDO LIST<STRING> */
    fun List<String>.paraCadaString(funcao: (s: String) -> String): List<String> {
        val listaStrings: MutableList<String> = mutableListOf()
        /*for (s in this) {
            listaStrings.add(funcao(s))
        }*/
        this.forEach{listaStrings.add(funcao(it))}
        return listaStrings
    }
    fun primeiraLetra(str: String): String {
        return str.first().toString()
    }
    fun ultimaLetra(str: String): String {
        return str.last().toString()
    }
    // tipo Genérico..
    fun <T> List<T>.paraCada(funcao: (s: T) -> T): List<T> {
        val lista: MutableList<T> = mutableListOf()
        this.forEach{lista.add(funcao(it))}
        return lista
    }

fun incrementa(a: Int): Int {
    return a + 1
}

fun main() {
    /** --> Exemplo 1
     * Estou passando para a função processaTexto uma outra função que recebe duas strings e retorna uma string
     * dentro da função processaTexto vou utilizar a função passada como parametro nomeada "processa".
    */
    println(processaTexto("Olá", "Mundo!", ::concatena))
    println(processaTexto("Olá", "Mundo!", ::inverte))
    println(processaTexto("Olá", "Mundo!", { x, y -> x.toUpperCase() + y.toUpperCase() }))

    // Exemplo 2
    val listaNomes: List<String> = listOf("Leonardo", "Lucas", "Jair", "Albani")
    var listaPrimeiraLetra: List<String> = listaNomes.paraCadaString(::primeiraLetra)
    var listaUltimaLetra: List<String> = listaNomes.paraCadaString(::ultimaLetra)

    listaPrimeiraLetra.forEach { println(it) }
    // ou
    //listaPrimeiraLetra.forEach(::println) // passando função como parametro

    listaUltimaLetra.forEach { println(it) }

    // Exemplo 3 -> Lista tipo genérico
    val listaInteiros: List<Int> = (1..10).toList()
    val listaIncrementos: List<Int> = listaInteiros.paraCada (::incrementa)
    listaIncrementos.forEach { println(it) }
}