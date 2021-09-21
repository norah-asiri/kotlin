fun main(){
    var Top_Movie= arrayListOf<String>()

    println("Hello in Top Movie program, Please enter at least 3 movie")
        while(true) {
            println("Pleas enter movie name :")
            Top_Movie.add(readLine()!!.toString())

            if (Top_Movie.contains(" ") || Top_Movie.contains("")) { // To check if user enter name not empty string
                println("Pleas enter movie name again:")
                Top_Movie[Top_Movie.size-1]= readLine()!!.toString()
            }

            if(Top_Movie.size>=3){
                print("Would you like to add more numbers? (Y/N) >> ")
                val addMore = readLine()
                if(addMore != "Y" && addMore != "y"){
                break }
        }
        }
    println("Your top moive is: ")
    for(i in Top_Movie){
        println(i)
    }
}