import javax.swing.InputMap

fun main(args: Array<String>) {
    var a = 18
    var b = 14
    if (a>b)
        println("a is greater than b")
    else
        println("a is less than b")

    var num = -100
    if (num<0){
        println("$num is a negative number")
    }else{
        println("$num is a positive number")
    }

    var age1 = 18
    if (age1<=0) {
        println("Invalid Input")
    }else {
        if (age1< 18) {
            println("You are underage")
        }else {
            println("You are an adult")
        }
    }

    var age = 17
    if (age<=0) {
        println("Invalid age")
    }else if (age<10){
        println("Primary school category")
    }else if (age>=10&&age<=14) {
        println("Junior Secondary school category")
    }else if(age<=18&&age>=15) {
        println("Senior secondary school category")
    }else if (age>19&&age<=25) {
        println("Campus category")
    }else {
        println("Out of school category")
    }
// WHEN STATEMENT
    var letter = 'a'
    when(letter){
        'a'-> println("a is a vowel")
        'e'-> println("b is a vowel")
        'i'-> println("d is a vowel")
        'o'-> println("d is a vowel")
        'u'-> println("u is a vowel")

        else -> println("$letter is a consonant")
    }
    var number = 0
    when(number){
        1-> println("Too bad, you failed the game")
        2-> println("You almost had it right")
        3-> println("Congratulations, you are the winner")

        else -> println("$number is invalid. Retry")
    }
    var weight =72.0
    var height = 1.82
    var BMI = (weight/(height*height))
    if (BMI>0&&BMI<18){
        println("You are Underweight")
    }else if (BMI<25) {
        println("You are normal")
    }else if (BMI<30){
        println("You are overweight")
    }else if (BMI>=30){
        println("You are obese")
    }else{
        println("Invalid height or weight")
    }
    var rank = 0
    when (rank){
        1-> println("Winner")
        2-> println("First Runners Up")
        3-> println("Second Runners Up")

        else -> println("$rank is invalid")
    }
}