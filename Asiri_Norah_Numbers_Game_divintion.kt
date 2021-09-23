import java.lang.Exception
import kotlin.random.Random

fun main() {
    var x = Random.nextInt(0, 11)
    var Math_exception : Int
    var first_number: Int
    var second_number: Int

    println("Welcome to Numbers Game\n")
    print("Enter your first number: ")
    first_number  = readLine()!!.toInt()
    print("Enter your second number: ")
    second_number= readLine()!!.toInt()
    try {
        when {
            first_number in 0..10 -> when {
                second_number in 0..10 ->  {
                    Math_exception= first_number * x - second_number
                    try {
                        print("$first_number * X - $second_number = $Math_exception ")
                        print("What is X? >>")
                        var user_answer2 = readLine()!!.toInt()
                        if(user_answer2== x){
                            println("You got it!")
                        }else
                            println("Ooh That is Wrong, The answer is $x.")
                    }catch (e: Exception){
                        println("Please enter numbers only.")
                    }
                }
                second_number < 0 || second_number > 10 -> println("Your second number not between 0 and 10")
            }
            first_number < 0 || first_number > 10 -> println("Your first number not between 0 and 10")
        }
    } catch (e: Exception) {
        println("Please enter numbers only.")
    }
    println("Finished")
}
