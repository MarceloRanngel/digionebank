package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Rangel"
    var cpf : String = "123.123.123-12"
    private set


}

fun main() {
    val rangel = Pessoa()

    println(rangel.nome)
    println(rangel.cpf)
}