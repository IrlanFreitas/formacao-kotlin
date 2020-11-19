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