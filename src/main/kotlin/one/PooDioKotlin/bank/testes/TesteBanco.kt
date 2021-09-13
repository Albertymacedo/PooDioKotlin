package one.PooDioKotlin.bank.testes

import one.PooDioKotlin.bank.Banco

fun main() {
    val digioneBank = Banco(nome = "Digione", numero = 12)

    println(digioneBank.nome)
    println(digioneBank.numero)

    val banco2 = digioneBank.copy(nome = "strats")
    println(banco2.info())
}