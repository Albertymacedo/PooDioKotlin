package one.PooDioKotlin.bank.testes

import one.PooDioKotlin.bank.Gerente

fun main(){
    val maria = Gerente("Maria das Dores", "7894561230", 4500.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}