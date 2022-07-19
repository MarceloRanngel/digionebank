package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    val cliente = Cliente("Jose", "123.123.123-12", clienteTipo = ClienteTipo.PF, "123456")

    println(cliente.toString())
    AutenticacaoTeste().autentica(cliente)

}

