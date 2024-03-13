fun main(args: Array<String>) {
    var number = 1..9
    for (num in number) {
        println(num)
    }

    var Alphabet = 'A'..'Z'
    for (char in Alphabet) {
        println(char)
    }

    // Using range to instead of '..'
    var num1 = 1.rangeTo(5)
    for (num in num1){
        println(num)
    }

    var num2 = 5.downTo(0)
    for (x in num2){
        println(x)
    }

    var alpha = 'Z'.downTo('A')
    for (x in alpha) {
        println(x)
    }

    var OneToTen = 1..50
    var odd = OneToTen.step(2)
    for (x in odd){
        println(x)
    }

}