fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun main(args: Array<String>) {
    println("Welcome to Calculator Apps!")
    println("Please select the number of menu to use this calculator Apps!")
    println("1. Multiply Operation")
    println("2. Division Operation")
    println("3. Plus Operation")
    println("4. Minus Operation")
    println("5. Close Application")
    var operation = readLine()
    while (operation != "5") {
        print("Input first number : ")
        var first = readLine()
        print("Input second number : ")
        var second = readLine()
        when (operation) {
            "1" -> {
                // print first and second number and call the function
            }
            "2" -> {
                // print first and second number and call the function
            }
            "3" -> {
                // print first and second number and call the function
            }
            else -> {
                // print first and second number and call the function
            }
        }
        println("Want to calculate again ? Please select the number of menu to use this calculator Apps!")
        println("1. Multiply Operation")
        println("2. Division Operation")
        println("3. Plus Operation")
        println("4. Minus Operation")
        println("5. Close Application")
        operation = readLine()
    }
    println("Thank you for using this calculator Apps")
}
