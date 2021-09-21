fun main()
{
    var countries = arrayListOf<ArrayList<String>>()
    var country=""
    var capital=""
    for (i in 0..2){
        println("Enter The country: " )
        country=readLine()!!
        println("Enter The capital: " )
        capital =readLine()!!
        countries.add(arrayListOf(country,capital))
    }
    for(i in 0..2)
        {
                println("Capital of " + countries[i][0] + " is " + countries[i][1])
        }
}
