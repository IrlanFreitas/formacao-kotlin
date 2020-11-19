class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

//    fun bonificacao(): Double {
//        when (tipo) {
//            0 -> return salario * 0.1
//            1 -> return salario * 0.2
//            else -> return salario * 0.3
//        }
//    }

    fun bonificacao(): Double {
        return salario * 0.1
    }

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }
}