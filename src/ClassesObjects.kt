fun main() {
    val car1 = Car("Ford", "Mustang", 1960)  // object of class Car
    // accessing the properties in class using the dot notation.
//    car1.model = "Ford"
//    car1.brand = "Mustang"
//    car1.year = 1960
    println(car1.model)
    println(car1.brand)
    println(car1.year)


    val car2 = Car("Toyota", "Fielder", 2001)
//    car2.model = "Toyota"
//    car2.brand = "Fielder"
//    car2.year = 2001
    println(car2.model)
    println(car2.brand)
    println(car2.year)

    val question1 = Question()
    question1.asked()
    question1.displayStatus()


    val bulb1 = Bulb()
    bulb1.tOn()
    bulb1.displayLightStatus("bulb1")
    bulb1.tOff()
    bulb1.displayLightStatus("bulb1")

    val bulb2 = Bulb()
    bulb2.tOn()
    bulb2.displayLightStatus("bulb2")
    bulb2.tOff()
    bulb2.displayLightStatus("bulb2")
    bulb2.option()

    val status1 = Status()
    status1.tOn()
    status1.displayStatus()
    status1.tOff()

    val person1 = Person()
    person1.vote("Ben Carson", 25)
    person1.vote("Mathew Sydney", 16)
    person1.vote("Ryan Campbell", 30)
}

class Car(var model: String, var brand: String, var year: Int){  // these() are for constructors. This is a primary constructor.
    // body components
        // data variables
        // functions -> methods(name for fx in class)- since they perform a specific task for that class.
//    var model = "" // value will be of type String
//    var brand = ""
//    var year = ""
//    // these properties for creation of objects.
}
class Bulb{
    private var isOn: Boolean = false
    fun tOn(){
        isOn=true
    }
    fun tOff(){
        isOn=false  // (=)assigning left to right
    }
    fun displayLightStatus(bulb: String) {
        if (isOn) {  //(==) checking whether
            println("The $bulb is ON")
        } else {
            println("The $bulb is OFF")
        }
    }
    fun option() {
        val qn = "Would you like to turn it off? y/n: "
        print(qn)
        val entry = readlnOrNull()
        if (entry=="y") {
            println("The bulb is OFF")
        }else{
            println("The bulb is still ON")
        }
    }
}
class Person{
    fun vote(name: String, age: Int){
        if (age>=18){
            println("$name, You can Vote")
        }else{
            println("$name, You are Underage")
        }
    }
}
class Status{
    private var isViewed: Boolean = false
    fun tOn(){
        isViewed=true
    }
    fun tOff(){
        isViewed=false
    }
    fun displayStatus() {
        if (isViewed) {
            println("The Status is deleted")
        } else {
            println("The Status is available")
        }
    }
}
class Question(){
    private var asked: Boolean = false
    fun asked(){
        asked=true
    }
    fun notasked(){
        asked=false
    }
    fun displayStatus() {
        if (asked) {
            println("\uD83D\uDE02\uD83D\uDC80")
        } else {
            println(" ")
        }
    }

}