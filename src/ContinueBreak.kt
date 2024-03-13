fun main(args: Array<String>) {
    // continue after condition
    for (n in 1..5){
        println("before continue, loop $n")
        if (n == 2||n == 4) // the two pipes mean or
            continue
        println("after continue, loop $n")
    }

    // break an algorithm
    for (m in 1..10) {
        println("before break, loop $m")
        if (m == 5) {
            println("Terminating the loop...")
            break // breaks algorithm here -> used probably when thereafter it may give a bug
        }
    }

    for (x in 'a'..'z'){
        println("before break, loop $x")
        if (x == 'q'){
            println("Terminating loop...")
            break
        }
    }
}