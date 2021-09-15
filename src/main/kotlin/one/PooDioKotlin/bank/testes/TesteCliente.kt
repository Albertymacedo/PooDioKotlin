package one.PooDioKotlin.bank.testes

import one.PooDioKotlin.bank.Cliente
import one.PooDioKotlin.bank.ClienteTipo

fun main()  {
    val jose = Cliente(
        nome =  "José Dirceu",
        cpf =   "7894561230",
        clienteTipo = ClienteTipo.PF,
        senha = "cliente123"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}