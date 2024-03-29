fun main() {
    // integer
    // string
    // double
    // Char
    // Boolean
    val a = 777
    val b ="This is my first Kotlin"
    val c = 12.65
    val d = 's'
    val e = true

    println(b)
    println(d)
    println(e)

//    a = 777
//    b = "This is my First Kotlin"
//    c = 12.65
//    d = 's'
//    e = true

    val z = 13

    val division = a/c
    val difference = a-c

    println(a+c)
    println(difference)
    println(a*c)
    println(division)

    val y = 24

    val x= "Hello"

    val sum = x+y

    println(sum)

    val age = 18

    val height = 45

    println("Your age is $age and height is $height")
    println("Your age is $age and height is $height")

    val t = 33

    val u = 0.77

    val v = 47
    val score = t+u+z

    println("Your score is $score out of 100%")
    println("$t out of $v counties have had rapid developments for the last one decade")

    val myNumLong = 1500000000L
    println(myNumLong)
    // A whole number is an Int as long as it is up to 2147483647. If it goes beyond that, it is defined as Long.
//    Byte data type can store whole numbers from -128 to 127.
//    Short data type can store whole numbers from -32768 to 32767
    // The Int data type can store whole numbers from -2147483648 to 2147483647
    // Long data type can store whole numbers from -9223372036854775807 to 9223372036854775807. This is used when Int is not large enough to store the value. Optionally, you can end the value with an "L"

    val myNum1 = 35E4
    println(myNum1)

    val myNum2 = 35E3F // the 'F' means float
    println(myNum2)

    var num1 = 21
    val num2 = 3

    println(num1+num2)
    println(num1/num2)
    println(num1*num2)
    println(num1-num2)
    println(num1%num2)
    println(++num1) // increment by one
    println(--num1) // decrement by one

    num1 +=2
    println(num1)
    println(num1 == num2)
    println(num1 != num2)
    println(num1 == num2 && num1 != num2)
    println(num1 == num2 || num1 != num2)
    println(!(num1 == num2))  // returns the opposite

    println(x[0])
    println("The length of the string is: " + x.length)
    println(x.toLowerCase())
    println(num1.compareTo(num2))  // 1 means not equal but 0 means equal -> 1

    val f = 3
    val j = 3
    println(f.compareTo(j))  // 0 output meaning equal

    val txt = "Please locate where 'locate' occurs!"
    println(txt.indexOf("locate"))

    val firstName = "John"
    val lastName = "Doe"
    println(firstName.plus(lastName))
    println("$firstName $lastName")
    println(firstName + lastName)

    val day = 5

    val result = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(result)

    print("Enter your score: ")
    val mark = readlnOrNull()?.toIntOrNull()

    val grade = when (mark){
        in 80..100 -> "A"
        in 60..80 -> "B"
        in 40..60 -> "C"
        in 20..40 -> "D"
        in 0..20 -> "E"
        else -> "Invalid mark"
    }
    println("Your Grade is: $grade")

    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    var s = 0
    do {
        println(s)
        s++
    }
    while (s < 5)

    var p = 0
    while (p < 10) {
        println(i)
        p++
        if (p == 4) {
            break
        }
    }

    var q = 0
    while (q < 10) {
        if (q == 4) {
            q++
            continue
        }
        println(q)
        q++
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    println(cars.size)

    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
    }

    for (nums in 5..15) {
        if (nums == 10) {
            continue
        }
        println(nums)
    }

    fun myFunction(myName: String, age: Int) {
        println("$myName Doe, $age years")
    }

    myFunction("Jane", 32)
    myFunction("Tom", 34)
    myFunction("Harry", 28)

    fun myFun(x: Int, y: Int): Int {
        return (x + y)
    }

    println( myFun(3,5))

    class Car {
        var brand = "Chevrolet"
        var model = "Camaro"
        var year = 2005
        fun drive(){
            println("Vroom!")
        }
        fun speed(maxSpeed: Int) {
            println("Max speed is: $maxSpeed km/h")
        }
    }

    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    val c2 = Car()
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999

    println(c1.brand)  // Ford
    println(c2.brand) // BMW
    c1.drive()
    c1.speed(200)

    class Fruits(var name: String, var colour: String, var price: Int)
    val f1 = Fruits("Apple", "Red", 79)
    println(f1.name)
    println(f1.colour)
    println(f1.price)
    val f2 = Fruits("Mango","Yellow", 20)
    println(f2.name)
    println(f2.colour)
    println(f2.price)




}