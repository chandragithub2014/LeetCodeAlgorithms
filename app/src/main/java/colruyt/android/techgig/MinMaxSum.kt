package colruyt.android.techgig

import java.math.BigInteger

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
   var size = arr.size -1
    var sumOfFour :Long = 0L
    var minMaxSumList = mutableListOf<Long>()
       for(i in 0..size){
           sumOfFour = 0L
            for(j in 0..size){
                if(i == j)
                     continue
                sumOfFour += arr[j]
            }
           minMaxSumList.add(sumOfFour)
       }

   // println("MinmaxSumList is $minMaxSumList")
    println("${minMaxSumList.sorted()[0]} ${minMaxSumList.sorted()[minMaxSumList.size - 1]}")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}