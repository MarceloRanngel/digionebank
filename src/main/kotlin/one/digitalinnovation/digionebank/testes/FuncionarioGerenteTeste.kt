package one.digitalinnovation.digionebank.testes


import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario


fun main(){
    val daniel = Gerente("Daniel", "123.123.123-22", 4000.0)

    ImprimeRelatorioFuncionario.imprime(daniel)


}

