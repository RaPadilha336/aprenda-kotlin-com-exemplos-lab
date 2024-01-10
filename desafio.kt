// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} matriculado com sucesso em $nome.")
    }
    
    fun totalDuracao(): Int {
        return conteudos.sumBy { it.duracao }
    }
}

fun main() {
    val usuario = Usuario("Rafaela")
    val conteudo = ConteudoEducacional("Programação em Kotlin", 120, Nivel.BASICO)
    val formacao = Formacao("Formação Kotlin", listOf(conteudo))
    
    formacao.matricular(usuario)
    println("Duração total da formação: ${formacao.totalDuracao()} minutos")
}
