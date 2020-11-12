fun main() {
    println("\nOlá!")

    //val para variáveis imutáveis
    //var para variáveis mutáveis
    //Variáveis devem ser inicializadas sempre.

    //Implicitamente (Pois não precisa do tipo) e Estaticamente (Não muda o valor recebendo um novo tipo) tipado,
    // o valor define o tipo da variável
    //O nome disso é inferência de tipo

    val titular: String =
        "Irlan"
    val numeroConta: Int = 1000 //:Tipo indica o tipo da variável
    var saldo: Double = 0.0

    saldo = 100.0
    saldo += 200

//    val teste = {"nome": "irlan"}

    println("Titular: $titular ") //String template do Koltin
    println("Número da conta: $numeroConta")
    println("Saldo da conta: $saldo")

}
