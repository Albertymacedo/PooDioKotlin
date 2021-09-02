package one.PooDioKotlin.bank

enum class ClienteTipo(val descricao: String){ //propriedade dos objetos criados no enum
    PF("Pessoa Física"), //os objetos são instâncias do próprio tipo da Enum que ja declaram como singleton
    PJ("Pessoa Jurídica");

}
