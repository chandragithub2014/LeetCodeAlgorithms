package colruyt.android.techgig
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val replaceElements = ReplaceElements()
    val result =  replaceElements.replaceElements(arr.toIntArray())
    println("Result is ${result.contentToString()}")
}
class ReplaceElements {
    fun replaceElements(arr: IntArray): IntArray {
        var size = arr.size
        var count = 0
        var greatestRight  = -1
        if(arr.size == 1) {
            arr[0] = -1
            return arr
        }
       while(count < size-1) {
            if(count+1 < size){
                greatestRight = arr[count+1]

                for(i in count+1 until size){
                    if(arr[i]>greatestRight){
                        greatestRight = arr[i]
                    }
                }
                arr[count] = greatestRight
                count += 1
               println("Greatest Right is $greatestRight and count is $count")
            }
       }
        arr[count] = -1
       /* for(i in 0 until size){
            println("Formatted Array is ${arr[i]}")
        }*/
        return arr
    }
}

/*
 while(count < size) {
         loop@ for (i in 0 until size) {
             count += 1
             for (j in 1 until size) {
                 if (j + 1 < size) {
                     if (arr[i] < arr[j]) {
                         arr[i] = arr[j]
                         for (k in j until size) {
                             if (k + 1 < size) {
                                 arr[k] = arr[k + 1]
                             } else {
                                 arr[k] = -1
                             }
                         }
                         break@loop
                     }
                 }
             }
         }
     }
 */

/*
 var size = arr.size
        if(arr.size == 1) {
          arr[0] = -1
          return arr
          }

        for(i in size-1 downTo 0){

            if(i-1 >= 0){
                a[i-1] = a[i]
            }
        }

        for(i in 0 untils size){
            println("Formatted Array is $a[i]")
        }
 */