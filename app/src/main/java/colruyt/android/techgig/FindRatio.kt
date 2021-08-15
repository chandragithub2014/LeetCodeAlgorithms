package colruyt.android.techgig

import java.text.DecimalFormat
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var size = arr.size - 1
    var positiveCount = 0
    var negativeCount = 0
    var zeroCount  = 0
    val df = DecimalFormat("#.######")
    for( i in 0..size) {
        if(arr[i]<0){
            negativeCount += 1
        }else if(arr[i]>0){
            positiveCount += 1
        }else {
            zeroCount += 1
        }
    }
    println("Positive Count:: $positiveCount negative Count is $negativeCount and zero Count is $zeroCount")
    println( df.format((positiveCount.toDouble()/arr.size)) )
    println( df.format((negativeCount.toDouble()/arr.size)) )
    println( df.format((zeroCount.toDouble()/arr.size)) )
}