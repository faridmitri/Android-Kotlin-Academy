fun main(args: Array<String>) {
    println("Welcome, What do you want to buy?")
    start()
    }

fun start() {
    var iphone = Mobile("Iphone", "X Pro", 1000f, 10f)
    var samsung = Mobile("Sumsung", "Node 4", 900f, 7.5f)
    var onePlus = Mobile("OnePlus", "5", 650f, 15f)

    println("1-Iphone \n2-Samsung \n3-OnePlus")
    var userChoice: Int = readLine()!!.toInt()
    when (userChoice) {
        1 -> iphone.printDetails()
        2 -> samsung.printDetails()
        3 -> onePlus.printDetails()
        else -> {
            println("Choose a number from the list")
            start()
        }
    }
}
