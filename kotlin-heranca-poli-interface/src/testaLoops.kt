fun testaLoops() {

    // esse @ aí eu não sei direito se pode ser utilizado
    // em outro lugar, mas aqui deu nome ao loop
    loopzada@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loopzada
        }
    }

    var i = 0
    while (i < 5) {
        println("\nBem-vindo ao Bytebank!\n")

        val titular: String = "Irlan $i"
        val numeroConta: Int = 1000 + 1
        var saldo: Double = i + 10.0

        println("Titular: $titular ")
        println("Número da conta: $numeroConta ")
        println("Saldo da conta: $saldo ")

        i++
    }

    // Com esse for, não é possível fazer de forma decrescente 1..5
    // Para fazer de forma decrescente é necessário usar o downTo
    // com o downTo dá pra controtar os passos, indo de dois em dois,
    // com o step
    // for (i in 1..5) {
    for (i in 5 downTo 1) {

        //val para variáveis imutáveis
        //var para variáveis mutáveis
        //Variáveis devem ser inicializadas sempre.

        //Implicitamente (Pois não precisa do tipo) e
        //Estaticamente (Não muda o valor recebendo um novo tipo) tipado,
        //O valor define o tipo da variável
        //O nome disso é inferência de tipo

        val titular: String = "Irlan $i"
        val numeroConta: Int = 1000 + 1 //:Tipo indica o tipo da variável
        var saldo: Double = i + 10.0

//        saldo = 100.0
//        saldo += 200

        //val teste = {"nome": "irlan"}

        println("Titular: $titular ") //String template do Koltin
        println("Número da conta: $numeroConta ")
        println("Saldo da conta: $saldo ")
    }
}