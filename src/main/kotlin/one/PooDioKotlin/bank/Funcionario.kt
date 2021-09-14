package one.PooDioKotlin.bank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
): Pessoa(nome, cpf) {
    protected abstract fun cauculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${cauculoAuxilio()}
    """.trimIndent()

}

