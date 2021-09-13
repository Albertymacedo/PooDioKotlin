package one.PooDioKotlin.bank.testes

import one.PooDioKotlin.bank.Funcionario
import one.PooDioKotlin.bank.Pessoa
import java.math.BigDecimal

fun main() {
    val eu = Pessoa(nome = "Alberty Macedo", cpf = "1234567890")
    println(eu.nome)
    println(eu.cpf)

    val joao = Funcionario("Alberty Macedo", "1234567890", BigDecimal.valueOf(5000.0))
    println(joao.nome)
    println(joao.cpf)
    println(eu.nome)
    println(joao.salario)
}