import java.lang.Exception

fun main(){
    //var i = 1
    fun sumFun(num1:Float,num2:Float):Float{
        return num1 + num2 }

    fun mulFun(num1:Float,num2:Float):Float{
        return num1 * num2 }

    fun defFun(num1:Float,num2:Float):Float{
        return num1 / num2 }

    fun subFun(num1:Float,num2:Float):Float{
        return num1 - num2 }

    fun printResulet(n1: Float, n2:Float,opr:String , n3:Float){
        println("$n1 $opr $n2 = $n3")
    }

    fun ReadLine() {
        var num1 = 0.0f
        var num2 = 0.0f
        var result = 0.0f
        var math_operation=""

        //while (i == 1) {
            try {
                print("Enter your first number:")
                num1 = readLine()!!.toFloat()
                print("Enter operator:")
                math_operation = readLine()!!.toString()

                if(math_operation=="+"||math_operation=="-"||math_operation=="*"||math_operation=="/") {
                    println("$num1$math_operation ")
                    print("Enter your second number:")
                    num2 = readLine()!!.toFloat()

                    if (math_operation == "+") {
                        result = sumFun(num1, num2)
                        printResulet(num1, num2, math_operation, result)


                    } else if (math_operation == "-") {
                        result = subFun(num1, num2)
                        printResulet(num1, num2, math_operation, result)

                    } else if (math_operation == "/") {
                        if (num2 == 0f) {
                            println("You cannot divide by 0")
                            ReadLine()
                        } else {
                            result = defFun(num1, num2)
                            printResulet(num1, num2, math_operation, result)
                        }

                    } else{
                        // (math_operation == "*")
                        result = mulFun(num1, num2)
                        printResulet(num1, num2, math_operation, result)
                    }
                }else{
                println("please enter one of math operation:( + , - , / , * ) just without space")
                ReadLine()
                }
/*
                println("Would you like to do more calculation? y/n")
                var loop = readLine()
                if (loop == "n" || loop == "N")
                    i = 0

 */

            } catch (e: Exception) {
                println("Please enter numbers only")
                ReadLine()
            }
        }

    ReadLine()
}