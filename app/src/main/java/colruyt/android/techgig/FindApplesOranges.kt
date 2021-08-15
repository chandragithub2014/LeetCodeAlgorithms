package colruyt.android.techgig

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // Write your code here
   val appleList = mutableListOf<Int>()
    apples.forEach {
        val result = a + it
        if(result in s..t) {
            appleList.add(result)
        }
    }

    val orangesList = mutableListOf<Int>()
    oranges.forEach {
        val result = b + it
        if(result in s..t) {
            orangesList.add(result)
        }
    }
   // println("AppleList $appleList")
    //println("OrangesList $orangesList")

    println(appleList.size)
    println(orangesList.size)

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
