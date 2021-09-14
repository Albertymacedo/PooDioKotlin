package one.PooDioKotlin.bank

class Analista(nome: String,
               cpf: String,
               salario: Double
): Funcionario(nome, cpf, salario) {
    override fun cauculoAuxilio() = salario * 0.1

}