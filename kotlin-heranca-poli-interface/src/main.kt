fun main() {

    println("\nBem-vindo ao Bytebank!\n")

    val Irlan = Funcionario(
        nome = "Irlan",
        cpf = "111.111.111-11",
        salario = 10000.0
    )

    println("$Irlan \nBonificação: ${Irlan.bonificacao()}")

}