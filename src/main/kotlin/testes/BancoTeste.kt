package testes

import Banco

fun main() {
    val b: Banco = Banco( nome = "Banco 1", numero = 12);

    val b2: Banco = b.copy(nome = "banco 2");

    println(" ${b.nome}, ${b.numero}");
    print(b2);

}