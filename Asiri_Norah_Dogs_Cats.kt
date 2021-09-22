import kotlin.random.Random


fun main (){

 fun age () : Int{
 return Random.nextInt(0,11)}

 val dogs= listOf<Dog>(
  Dog("Rufus", age()),
  Dog("Fred",age()),
  Dog("Spot", age()),
  Dog("Max", age()),
  Dog("Cody", age()))

 val cats = listOf<Cat>(
  Cat("Lili",age()),
  Cat("Furball",age()),
  Cat("Snowball",age()),
  Cat("Meep",age()),
  Cat("Patchy",age()))

 for (i in cats) {
  i.talk()
  for (j in dogs) {
   if (j.age > i.age) j.talk()
  }
 }
 }

abstract class animals (var name: String, var age: Int) {
abstract fun talk()
}

 class Cat(name: String, age: Int):animals(name,age)  {
  override fun talk() {
   //println("$name: Meow , age is: $age") // to see the age
   println("$name: Meow")
  }
 }

 class Dog(name: String, age: Int):animals(name, age)  {
  override fun talk() {
  // println("$name: Woof , age is: $age" ) // to see the age
   println("$name: Woof")

  }
 }

