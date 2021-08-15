package colruyt.android.techgig

import java.text.ParseException
import java.text.SimpleDateFormat

fun timeConversion(s: String): String {
    val inputFormat  = SimpleDateFormat("hh:mm:ssaa")
    val outputFormat = SimpleDateFormat("HH:mm:ss")
    var target = ""
   try {
     var sourceTime = inputFormat.parse(s)
        target =outputFormat.format(sourceTime)
   }catch (e:ParseException){
       e.printStackTrace()
   }
    return  target
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}