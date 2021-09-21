import java.lang.Exception

fun main(){
    var j =1
    var Top_5_Movie= arrayOf("","","","","")
    var movie=""
    println("Enter your top 5 movie :")

    try {
        for (i in 0..4) {
            println("Pleas enter $j movie name :")
            movie = readLine()!!.toString()

            if (movie==" " ||movie==""){
                println("Pleas enter $j movie name again:")
                movie = readLine()!!.toString()
                }

            Top_5_Movie[i] = movie
            j++
        }
    }catch (e: Exception){
        println("Error")
    }
    j=1 // counter to print movie number from 1 to 5
    for (i in 0..4){
        println("Your Top movie name is : $j " + Top_5_Movie[i])
        j++
    }
}