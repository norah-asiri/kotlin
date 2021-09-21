fun main(){
    var i = 1
    fun sumFun(num1:Int,num2:Int):Int {
        return num1 + num2 }

    fun ReadLine() {
        while (i == 1) {
            var num1 = 0
            var num2 = 0
            var sum = 0

            try {
                println("Enter your first number:")
                num1 = readLine()!!.toInt()
                println("Enter your second number:")
                num2 = readLine()!!.toInt()
                sum = sumFun(num1, num2)
                println("$num1 + $num2 = $sum")
                println("Would you like to add more numbers? y/n")
                var loop = readLine()
                if (loop == "n" || loop == "N")
                    i = 0

            } catch (e: NumberFormatException) {
                println("Please enter a number")
                ReadLine()
            }
        }
    }
    ReadLine()
}