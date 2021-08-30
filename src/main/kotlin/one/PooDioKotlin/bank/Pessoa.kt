package one.PooDioKotlin.bank

class Pessoa {
    var nome: String = "Alberty"
    var cpf: String = "123.456.789.00"
    private set //não consigo alterar os valores das variáveis em outras classes (apenas get)

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

 fun main(){
     val eu = Pessoa()
         println(eu.pessoaInfo())


 }