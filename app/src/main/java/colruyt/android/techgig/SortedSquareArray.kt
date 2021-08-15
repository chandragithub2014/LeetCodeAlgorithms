package colruyt.android.techgig
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val consecutiveOnes = SortedSquareArray()
    val result =  consecutiveOnes.sortedSquares(arr.toIntArray())
    println("Result is ${result.contentToString()}")
}
class SortedSquareArray {
    fun sortedSquares(nums: IntArray): IntArray {
        val list = mutableListOf<Int>()

      nums.forEach { numb ->
          list.add(numb*numb)
        }
        return list.sorted().toTypedArray().toIntArray()
    }
}