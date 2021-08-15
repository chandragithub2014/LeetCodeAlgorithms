package colruyt.android.techgig
fun main(args: Array<String>) {


    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val consecutiveOnes = DuplicateZeros()
    consecutiveOnes.duplicateZeros(arr.toIntArray())
   // println("Result is $result")
}
class DuplicateZeros {
    fun duplicateZeros(arr: IntArray): Unit {
        var index = 0
        while(index < arr.size){
            if(arr[index] == 0){
                for(j in arr.size -1 downTo index+1){

                    arr[j] = arr[j-1]
                }

                index += 2
            }else{
                index += 1
            }

        }

     //   println("Modified Array is ${arr.contentToString()}")
    }
}
/*
Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

 */