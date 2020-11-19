fun testaComportamentoConta() {

    // Labels, uma forma de identificar os paramentos
    val contaIrlan = Conta(titular = "Irlan", numero = 100)
//    contaIrlan.titular = "Irlan"
//    contaIrlan.numero = 1000
//    contaIrlan.saldo = 0.0
    println(contaIrlan)

    //Labels ou Named Arguments, não precisam ser na ordem
    val contaFran = Conta(numero = 1001, titular = "Fran")
//    contaFran.titular = "Fran"
//    contaFran.numero = 1001
//    contaFran.saldo = 0.0
    println(contaFran)

    // Depositando
    contaIrlan.depositar(100.0)
    println(contaIrlan)

    // Sacando
    contaIrlan.sacar(50.0)
    println("Sacando 50 reais")
    println(contaIrlan)

    // Transferindo
    println("Foi transferido com sucesso? ${if (contaIrlan.transferir(contaFran, 50.0)) "Sim" else "Não"} ")
    println(contaFran)
    println(contaIrlan)
}