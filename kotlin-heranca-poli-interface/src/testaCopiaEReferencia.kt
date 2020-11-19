fun testaCopiaEReferencia() {
    val numeroX = 10
    //Desse jeito, por sem tipo primitivo é enviado uma cópia do valor e não uma referência
    var numeroY = numeroX
    numeroY++

    println("numeroX: $numeroX")
    println("numeroY: $numeroY")


    val contaJoao =
        Conta("João", 1003) //É criado um espaço de memória para guardar os valores, e contaJoao aponta para lá
//    contaJoao.titular = "João"
    var contaMaria = contaJoao  //Aqui é enviado uma referencia e não uma cópia
    contaMaria.titular = "Maria"

    // Os dois ficaram com o nome do titular Maria
    println("Conta João: $contaJoao")
    println("Conta Maria: $contaMaria")
}