package classesHerdadas

import classesAbstracts.Funcionario
import interfaces.Logavel
import java.time.LocalDate

class Gerente(
    nome: String, // atributo herdado da classe abstrada funcionario
    dataNasc: LocalDate, // atributo herdado da classe abstrada funcionario
    salario: Double, // atributo herdado da classe abstrada funcionario

    val senha: String

) : Funcionario(nome, dataNasc, salario), Logavel {

    // método implementado da classe abstrada funcionario
    override fun auxilio(): Double = salario * 40 / 100;

    // método implementado da interface logavel
    override fun login(): Boolean = "login123" == senha;
}