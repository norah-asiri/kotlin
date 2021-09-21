fun main()
{
    var countries = listOf("Saudi", "Emirates","India")
    var capitals = arrayListOf<String>()

    for(i in countries){
        println("Enter Capital city of $i :")
        capitals.add(readLine()!!)
    }
    for(i in 0..2){
        println( "Capital of " + countries[i] + " is " + capitals[i])
    }
}
