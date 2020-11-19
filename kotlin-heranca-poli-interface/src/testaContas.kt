fun testandoContas() {
    val contaIrlan = Conta("Irlan", 1000)
//    contaIrlan.titular = "Irlan"
//    contaIrlan.numero = 1000
    contaIrlan.depositar(10000000.0)
    println(contaIrlan)

    val contaFran = Conta("Fran", 1001)
//    contaFran.titular = "Fran"
//    contaFran.numero = 1001
    contaFran.depositar(31321.1)
    println(contaFran)
}