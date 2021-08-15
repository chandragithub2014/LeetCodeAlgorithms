package colruyt.android.techgig

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    var birthDayCandleList  = mutableListOf<Long>()
   for(i in candles.indices){
       birthDayCandleList.add(candles[i].toLong())
   }
 var sortedList =    birthDayCandleList.sortedDescending()
  var tallestCandle = sortedList[0]
    println("TallestCandle is $tallestCandle")
  var tallestCandleCount = 0
    for(i in sortedList){
        if(i == tallestCandle){
            tallestCandleCount += 1
        }
    }
   return tallestCandleCount

}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}


/*

4
3 2 1 3

2
 */