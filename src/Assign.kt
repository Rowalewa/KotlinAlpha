fun main(args: Array<String>) {
    print("Enter marks: ")
    val marks: Int? = readlnOrNull()?.toIntOrNull()

    when (marks){
        in 80..100 -> {
            println("A")
        }
        in 70..80 -> {
            println("B")
        }
        in 60..70 -> {
            println("C")
        }
        in 50..60 -> {
            println("D")
        }
        else -> println("E")

    }

}
