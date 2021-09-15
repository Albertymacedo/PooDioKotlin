package one.PooDioKotlin.bank

class Gerente(nome: String,
              cpf: String,
              salario: Double,
              val senha: String
    ) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {

    override fun cauculoAuxilio(): Double = salario * 0.4
    override fun login(): Boolean = "teste123" == senha
}