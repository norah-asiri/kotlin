import java.lang.Exception
// import kotlin.random.Random

fun main(){
    var number= 8
    var user_answer=0

    print("Guess a number between 0 and 10: ")
    try {
        user_answer=readLine()!!.toInt()
        if(user_answer in 0..10 )
            if ( user_answer == number)
            println("You got it!")
            else
            println("Wrong guess. The answer was $number.\nGame Over" )
        else
            println("Your number not between 0 and 10")

    } catch (e: Exception) {
        println("Please enter numbers only.")
    }

}