import java.math.BigDecimal

class Conta(
    val nome: String,
    val numero: String,
    var saldo: BigDecimal
) {
    fun depositar(valor: BigDecimal) {
        saldo = saldo.plus(valor)
    }

    fun sacar(valor: BigDecimal) = saldo.minus(valor);



}