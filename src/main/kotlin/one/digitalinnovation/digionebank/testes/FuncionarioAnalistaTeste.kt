package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario


fun main(){
    val daniel = Analista("Daniel", "123.123.123-22", 4000.0)

    ImprimeRelatorioFuncionario.imprime(daniel)


}

