
fun main() {

    var CountryCapital = mutableMapOf<String,String>("" to "")
    var country=""
    var capital=""
    for (i in 0..2){
        println("Enter The country: " )
        country=readLine()!!
        println("Enter The capital: " )
        capital =readLine()!!
        CountryCapital.put(country , capital)
    }
    for(i in CountryCapital)
    {
        println("${i.key}: ${i.value}")
    }

}