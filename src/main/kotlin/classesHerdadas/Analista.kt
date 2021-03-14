package classesHerdadas

import classesAbstracts.Funcionario
import java.time.LocalDate

class Analista(

    nome: String, // atributo herdado da classe abstrada funcionario
    dataNasc: LocalDate, // atributo herdado da classe abstrada funcionario
    salario: Double, // atributo herdado da classe abstrada funcionario

) : Funcionario( nome, dataNasc, salario ) {

    // método implementado da classe abstrada funcionario
    override fun auxilio(): Double = salario * 10 / 100;

}