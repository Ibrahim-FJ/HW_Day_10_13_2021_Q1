fun main (){

    println("Welcome to the simple calculator")
    println("Please enter the first number")
    val num1 = readLine()!!.toInt()
    println("Enter the operator")
    val operator = readLine()
    println("Enter the second number")
    val num2 = readLine()!!.toInt()

        when(operator){
            "+" -> println(num1 + num2)
            "-" -> println(num1 - num2)
            "*" -> println(num1 * num2)
            "/" -> println(num1 / num2)
            "%" -> println(num1 % num2)


            else ->
                println("The input operator is wrong")
        }
}