// Criando uma classe em Kotlin, até agora tudo igual, isso já mudou no set e get
// O construtor primario fica na assinatura da classe
// É necessária a avaliação dos campos/atributos/properties para saber
// se a precisão de mudança de valor, quando não, colocar como  val
class Conta(
    var titular: String,
    val numero: Int = 0
) {

//    No proprio construtor primário, o dá assinatura da classe, eu vou indicar
//    que os campos são atributos(properties) da classe.
//    var titular: String = titular
//    var numero: Int = numero

    //    private var saldo: Double = 0.0
    // O nome dado a utilização das palavras-chave(keywords) set e get
    // é propriedade(property)
    var saldo: Double = 0.0
        // o set pode ser privado. Brabo demais
        private set
//            if (valor > 0) { //Lógica utilizada no set para a property
//                // field é o valor interno, o valor do campo
//                field = valor
//            }

    // O construtor abaixo é considerado o construtor secundário
//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }

    // Fazendo de forma orientada a objetos.
    // Método ou comportamento da classe.
    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) saldo -= valor
    }

    fun transferir(destino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            this.sacar(valor)
            destino.depositar(valor)
            return true
        }
        return false
    }

    // Não é a melhor forma de se fazer encapsulamento no Kotlin
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    // Não é a melhor forma de se fazer encapsulamento no Kotlin
//    fun setSaldo(saldo: Double) {
//        if (saldo > 0) {
//            this.saldo = saldo
//        }
//    }

    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }
}

fun main() {

    println("\nBem-vindo ao Bytebank!\n")
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

// Código feito de forma procedural
fun depositar(conta: Conta, valor: Double) {
    conta.depositar(valor)
}

fun copiaEReferencia() {
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

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    //when é equivalente ao if, else if, else e ao switch/case
    when {
        saldo > 0.0 -> println("Conta é positiva.")
        saldo == 0.0 -> println("Conta é neutra.")
        else -> println("Conta é negativa.")
    }
}

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