package br.edu.scl.sdm.trykotlin.aula20190222

/**
 * Dado o código
 */
fun main() {

    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Jair")
            , Pair("Mãe", "Albani")
            , Pair("Filho", "Leonardo")
            , Pair("Caçula", "Lucas")
            , Pair("Pet", "Paçoca"))
    println("########### Minha solução ###########")
    familiaMap.forEach { println("${it.key} : ${it.value}") }


    println("\n########### Solução 1 ###########")
                for (chave in familiaMap.keys) {
                    println("${chave} - ${familiaMap.get(chave)}")
                }

    println("\n########### Solução 2 ###########")
                familiaMap.keys.forEach { println("${it} - ${familiaMap.get(it)}") }

    println("\n########### Solução 3 -> forEach que passa uma função como parametro ###########")
                fun percorreMap(par: Map.Entry<String, String>) {
                    println("${par.key} : ${par.value}")
                }
                familiaMap.forEach(::percorreMap)

    println("\n########### Solução 4 -> forEach que passa uma variável como parametro. ###########")
                val percorreMap: (String, String) -> Unit = fun(k: String, v: String) {
                    println("$k - $v")
                }
                familiaMap.forEach(percorreMap)

                // ainda na solução 4, como minha variavel é do tipo (String, String)
                // não preciso informar o tipo da variável da função.
                val percorreMap1: (String, String) -> Unit = fun(k, v) {
                    println("$k - $v")
                }
                familiaMap.forEach(percorreMap1)

                // ainda na solução 4, como minha função tem apenas 1 linha (ação) dentro dela
                // podemos trabalhar com single line func, desta forma:
                val percorreMap2: (String, String) -> Unit = { k, v -> println("$k - $v") }
                familiaMap.forEach(percorreMap2)

    println("\n########### Solução 5 ###########")
                familiaMap.forEach { t, u -> println("$t - $u") }
}