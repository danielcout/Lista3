fun main(args: Array<String>){

    println("Digite o primeiro número: ")
    val x: Int = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val y: Int = readLine()!!.toInt()

    val resultado = multiplica (x, y)

    println("O resultado da multiplicação é: $resultado")
}

fun multiplica(x: Int, y: Int): Int {
    return x * y
}