
fun main() {
    val WeekDays = mapOf<Int,String>(1 to "Saturday", 2 to "Sunday", 3 to "Monday"
    ,4 to "Tuesday", 5 to "Wednesday", 6 to "Thursday", 7 to "Friday")

    for (i in WeekDays)
        println("${i.key}: ${i.value}")

}