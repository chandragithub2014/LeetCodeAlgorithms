package colruyt.android.techgig

fun staircase(n: Int): Unit {
  val size = n-1
    val spaceLoopSize = size -1
    for (i in 0..size) {
        for (j in 1..size - i) {
            print(" ")
        }
        for (k in 0..i) {
            print("#")
        }
        println("")
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}



/*

     #
    ##
   ###
  ####
 #####
######

 */