import java.math.BigDecimal
import java.time.LocalDate.now

fun main() {
    val conta: Conta = Conta("conta1", "123", BigDecimal("50.4"));
    conta.depositar(BigDecimal("50"));

}
