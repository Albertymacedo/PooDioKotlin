package one.PooDioKotlin.bank.testes

import one.PooDioKotlin.bank.Analista

fun main() {
    val joao = Analista("Joao Carlos", "1234567890", 3000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}

