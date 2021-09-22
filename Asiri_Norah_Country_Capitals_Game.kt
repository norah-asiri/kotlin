import kotlin.random.Random

fun main() {

    val CountryCapital = listOf<Countries>(
        Countries("Saudi Arabia", "riyadh"),
        Countries("China", "beijing"),
        Countries("Egypt", "cairo"),
        Countries("Japan", "tokyo"),
        Countries("Kuwait", "kuwait"),
        Countries("Pakistan", "islamabad"),
        Countries("United States", "washington"),
        Countries("Yemen", "sanaa"),
        Countries("India", "delhi"),
        Countries("France", "paris"))
    while (true) {
        games(CountryCapital)
        println("Would you like to play again? >> y/n")
        var loop = readLine()
        if (loop == "n" || loop == "N") {
            println("Finish game")
            break
        }
    }
}
fun games ( CountryCapital : List<Countries>)
{
    var score = 0
    var capital = ""
    for (i in 0..2) {
        var country=CountryCapital[Random.nextInt(1, 10)-i] /* -->
         for get always ask 3 unique questions:
          the range start from 1 until 10
         then subtract i from the random number
         (to keep index in range must be start from 1 if the random 1 then subtract 1 the final index will be 0 )
         */
        println("What is capital city of ${country.name}? >>")
        capital = readLine()!!.lowercase()
        if (capital == country.capital) {
            println("Great")
            score++
        } else
            country.information() }
    println("Score $score/3")
}

class Countries (var name: String, var capital: String) {

  fun information(){
    println("The Capital of $name is $capital ")
  }

}



