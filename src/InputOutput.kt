import javax.xml.stream.events.Characters
import java.util.Scanner

fun main(args: Array<String>) {

    print("Please enter your name: ")
    var enteredString = readLine()
    println("You have entered the string $enteredString")

    print("Please enter a number: ")
    var enteredNumber = Integer.valueOf(readLine())
    println("You have entered a number $enteredNumber")

    var read = Scanner(System.`in`)
    println("Please enter an Integer ")
    var enteredInteger = read.nextInt()
    println("The Integer entered is $enteredInteger")

    println("Please enter a float ")
    var enteredFloat = read.nextFloat()
    println("The Float entered is $enteredFloat")

    print("Enter a number a: ")
    var a = read.nextInt()

    print("Enter a number b: ")
    var b = read.nextInt()

    var product = (a*b)
    println("The product of a and b is: $product")

}