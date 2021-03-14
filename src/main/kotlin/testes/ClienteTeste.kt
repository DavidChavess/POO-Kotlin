package testes

import classesHerdadas.Cliente
import services.LoginService
import enums.ClienteTipo
import java.time.LocalDate

fun main() {
    val cliente = Cliente(
        nome = "Fulano",
        dataNasc = LocalDate.of(1950, 1, 1),
        tipo = ClienteTipo.PF,
        senha = "123456"
    );

    println(cliente);

    LoginService().fazerLogin(cliente);
}