package one.PooDioKotlin.bank

class Gerente(nome: String,
              cpf: String,
              salario: Double
    ) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun cauculoAuxilio(): Double = salario * 0.4
}