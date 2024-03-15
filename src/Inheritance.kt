import java.awt.Color

fun main(args: Array<String>) {
    val child1 = Child()
    child1.myFunction()

    val dog1 = Dog("Gray", 4)
    dog1.sound()

    val cow1 = Cow("Brown", 7)
    cow1.sound()

    val cat1 = Cat("Maroon", 3)
    cat1.sound()

    val bird1 = Bird("white", 4)
    bird1.sound()
}
open  class Parent{ // open means making a class a super class
    val x = 5
}
class Child: Parent(){
    fun myFunction(){
        println(x)
    }
}
open class Animal(color: String, age: Int){
    init {
        println("Color is: $color")
        println("Age is: $age")
    }
}
class Dog(color: String, age: Int): Animal(color, age){
    fun sound(){
        println("A dog barks")
    }
}
class Cow(color: String, age: Int): Animal(color, age){
    fun sound(){
        println("A cow moos")
    }
}
class Cat(color: String, age: Int): Animal(color, age){
    fun sound(){
        println("A cat meows")
    }
}
class Bird(color: String, age: Int): Animal(color, age){
    fun sound(){
        println("A bird chirps")
    }
}
