package br.edu.scl.sdm.trykotlin.aula20180215

fun main() {
    // Declação de lista mutável
    val listaCursos: MutableList<String> = mutableListOf("Sistemas para Dispositivos Móveis",
            "Análise e Desenvolvimento de Sistemas")

    // Adicionando itens na lista
    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    // RESOLUÇÃO 1
    val listaCursosSistemas: MutableList<String> = mutableListOf()
    for (curso in listaCursos) {
        if (curso.contains("Sistemas")) {
            listaCursosSistemas.add(curso)
        }
    }

    for (i in 0..listaCursosSistemas.size - 1) {
        println("${i} - ${listaCursosSistemas[i]}")
    }


    var funcao = fun(ci: IndexedValue<String>){
        println("${ci.index} - ${ci.value}")
    }

    var g: (IndexedValue<String>) -> Unit
    g = funcao

    val listaCursosSistemasLambda = listaCursos.filter { it.contains("Sistemas") }
    listaCursosSistemasLambda.withIndex().forEach{g}

}