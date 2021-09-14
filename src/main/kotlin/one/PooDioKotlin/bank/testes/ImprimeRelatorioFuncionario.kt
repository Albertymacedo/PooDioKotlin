package one.PooDioKotlin.bank.testes

import one.PooDioKotlin.bank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }

}