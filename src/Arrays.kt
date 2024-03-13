fun main(args: Array<String>) {
    // data structure
    var arr = arrayOf(10, 23.4, "John", 'w')
    var arr1 = arrayOf<Int>(12, 24, 36, 48, 60, 72, 96)
    var arr2 = arrayOf<String>("Peter", "John", "Macaw")
    // Modifying value within an array using indexes
    var fruits = arrayOf<String>("Oranges", "Pineapple", "Mango")
    println(fruits[2])
    fruits[2] = "Apples"
    println(fruits[2])

    // Modifying values within array using set function
    var names = arrayOf<String>("Mascot", "Carson", "Hogwarts")
    println(names[1])
    names.set(1, "Ben")
    println(names[1])
    println(names[2])
    names.set(2, "Harry Potter")
    println(names[2])

    //fetching a value using get function
    var browsers = arrayOf<String>("Chrome", "Microsoft Edge", "Safari", "Mozilla Firefox", "Brave")
    println(browsers.get(1)) // retrive or print out specific value in an array
    println(browsers[1])
    println(browsers.get(4))
}
