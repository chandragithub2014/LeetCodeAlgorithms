package colruyt.android.techgig
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val mountainArray = MountainArray()
    val result =  mountainArray.validMountainArray(arr.toIntArray())
    println("Result is $result")
}
class MountainArray {
    fun validMountainArray(arr: IntArray): Boolean {
        var size = arr.size
        var ascending = 0
        var descending = size - 1
       if(arr.size < 3) {
           return false
       }
        while(ascending+1 < size-1 && arr[ascending] < arr[ascending+1]){
             ascending += 1
        }

        while(descending > 0 && descending - 1 > 0 && arr[descending] < arr[descending-1]){
            descending -= 1
        }


   println("Ascending and descending is $ascending and $descending")

    return ascending == descending
    }
}
/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
 */
/*
var ascendingCount = 0
        var descendingCount = 0

        var size = arr.size
        if(size > 1) {
            if(arr[0] > arr[1]){
                return false
            }
            if(arr[size-1] > arr[size-2]){
                return false
            }
        }
        for(i in 0 until size){
            if(i+1 < size) {
                if (arr[i + 1] > arr[i]) {
                    ascendingCount += 1
                }else if(arr[i+1] < arr[i]){
                    descendingCount += 1
                }
                else{
                    descendingCount = 0
                    ascendingCount = 0
                }
            }
        }
        println("AscendingCount $ascendingCount and descendingCount $descendingCount")
        if(ascendingCount>0 && descendingCount >0  && ascendingCount+descendingCount >=2){
            return true
        }

        return false
 */
/*
      var mountainCount = 1
        var size = arr.size
        for(i in 0 until size){
            if(i+1 < size) {
                if (arr[i + 1] > arr[i] || arr[i+1] < arr[i]) {
                    mountainCount += 1
                }
                else{
                    mountainCount = 1
                }
            }
        }

        if(mountainCount>=3){
            return true
        }
        return false
 */



/*
       var ascendingCount = 0
        var descendingCount = 0

        var size = arr.size
        for(i in 0 until size){
            if(i+1 < size) {
                if (arr[i + 1] > arr[i]) {
                    ascendingCount += 1
                }else if(arr[i+1] < arr[i]){
                    descendingCount += 1
                }
                else{
                    descendingCount = 0
                    ascendingCount = 0
                }
            }
        }
        if(ascendingCount>=2){
            return true
        }else if(descendingCount >=2){
            return true
        }else if(ascendingCount > descendingCount && ascendingCount + descendingCount >= 2){
            return true
        }
        return false
 */