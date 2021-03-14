package testes

import classesHerdadas.Analista
import java.time.LocalDate

fun main() {
    val analista = Analista(
        nome = "David",
        dataNasc = LocalDate.of(2000, 2, 7),
        salario = 2900.0
    );
    ImprimeFuncionario.imprime(analista);
}
