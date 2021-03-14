package testes

import enums.ClienteTipo

fun main() {
    val brinca = ClienteTipo.values().map { x -> x.name + " OLa" };

    print(brinca)
}