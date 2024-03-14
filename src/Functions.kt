fun main() {
    println(circleArea(radius = 7.0))
    println(bmi())
//    println(birthdayRegards("Andrew", 18, "Felix"))
//    println(birthdayRegards("Esther", 19, "Tom"))
//    println(birthdayRegards("Mathew", 54, "Cruise"))
//    println(birthdayRegards(age = 45, wisher = "Greg"))
//    println(birthdayRegards(wisher = "Harry"))
    println(birthdayRegards())
    println(greetings())
    println(welcomeUser("Peter"))
}
// functions are/should be created outside the main function
// fun -> function in Kotlin
fun birthdayRegards(name: String="George", age: Int = 18, wisher: String = "Gary"):  String{  // declaration of the output data type
    val m = "Happy Birthday $name" // using the parameter, the user will be required to input the name.
    val n = "You are $age years old"
    val p = "Regards from $wisher"
    return ("$m\n$n\n$p") // the backslash shows move to the next line to print that next variable lest all displayed in a single line.
}
// parameters for a function are declared in function's brackets with a data type needed for parameter.
fun greetings(): String{
    print("Please enter your name: ")
    val enteredString = readlnOrNull()
    val hello = "Welcome $enteredString"
    return (hello)
}
fun welcomeUser (name: String): String{
    val news = "Hello $name, welcome"
    return (news)
}
fun circleArea (pi: Double = 3.14, radius: Double): String {
    val area = pi*radius*radius
    val y = "The area is: "
    return ("$y$area")
}
fun bmi (height: Double = 1.7, weight: Double = 54.3): String{
    val bodyMassIndex = weight/(height*height)
    val a = "Your Body Mass Index is: "
    return ("$a$bodyMassIndex")
}