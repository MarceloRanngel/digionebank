package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Rangel"
    var cpf : String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"


}

fun main() {
    val rangel = Pessoa()

    println(rangel.pessoaInfo())
}