package testes

import classesHerdadas.Gerente
import services.LoginService
import java.time.LocalDate

fun main() {
    val gerente = Gerente(
        nome = "Maria",
        dataNasc = LocalDate.of(1970, 4, 20),
        salario = 3000.0,
        senha = "login123"
    );

    ImprimeFuncionario.imprime(gerente);

    LoginService().fazerLogin(gerente);
}