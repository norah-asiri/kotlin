fun main(){
    var minimum_age = 18

    try {
        print("Enter your age :")
        var User_Age = readLine()!!.toInt()
        if (User_Age> minimum_age )
            println("Welcome!")
        else
            println("Your are not old enough")

    } catch (e: NumberFormatException) {
        println("Please enter a number")
    }
}