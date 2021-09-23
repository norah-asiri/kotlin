import java.lang.Exception
import kotlin.random.Random


fun main() {

    var number = Random.nextInt(0, 11)
    var user_answer: Int
    println("Welcome to Numbers Game \nto quit the game please typing 'quit' \n")
    var i =0
    while (i<3) {

        print("Guess a number between 0 and 10: ")
        var user_answer2 = readLine()!!
        if (user_answer2 == "quit") {
            println("Goodbay")
            break
        } else {
            try {
                user_answer = Integer.parseInt(user_answer2)
                when {
                    user_answer in 0..10 -> when {
                        user_answer == number -> {
                            println("You got it!")
                            break }
                        user_answer != number && i !=2 -> println("Wrong guess. try again")
                        i==2 -> println("Wrong guess, The answer was $number")
                    }
                    user_answer < 0 || user_answer > 10 -> println("Your number not between 0 and 10")
                }
                i++
            } catch (e: Exception) {
                println("Please enter numbers only.")
            }
        }
    }
    println("Finished")
}
