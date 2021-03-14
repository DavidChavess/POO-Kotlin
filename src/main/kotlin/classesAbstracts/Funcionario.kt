package classesAbstracts

import java.time.LocalDate

abstract class Funcionario (
    nome: String, // atributo herdado da classe abstrada pessoa
    dataNasc: LocalDate, // atributo herdado da classe abstrada pessoa

    val salario: Double,

) : Pessoa(nome, dataNasc) {

    abstract fun auxilio() : Double;

    override fun toString(): String = """
        nome = ${nome}
        dataNasc = ${dataNasc}
        salario = ${salario}
        auxilio = ${auxilio()}
    """.trimIndent();

}