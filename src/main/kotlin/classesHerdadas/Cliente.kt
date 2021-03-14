package classesHerdadas

import interfaces.Logavel
import classesAbstracts.Pessoa
import enums.ClienteTipo
import java.time.LocalDate

class Cliente(
    nome: String, // atributo herdado da classe abstrada pessoa
    dataNasc: LocalDate, // atributo herdado da classe abstrada pessoa

    val tipo: ClienteTipo,
    val senha: String

): Pessoa(nome, dataNasc), Logavel {

    // método implementado da interface logavel
    override fun login(): Boolean = "123456" == senha;

    override fun toString(): String = """
        nome = $nome
        dataNasc = $dataNasc
        tipo = ${tipo.descricao}
    """.trimIndent()


}