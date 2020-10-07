import java.util.*

fun main() {

    fun countCommission(amount: Long): Long {
        val basicCommission: Long = 3500
        val finalCommission = amount * 75 / 10_000
        return if (amount * finalCommission < 3500) basicCommission else finalCommission
    }

    println("Ввведите сумму перевода")
    val scanner = Scanner(System.`in`)
    val amount: Long = scanner.nextLong()
    println("Сумма комиссии составит:")
    println(countCommission(amount))
}
