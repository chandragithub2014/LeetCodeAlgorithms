package colruyt.android.techgig
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val checkExists = CheckExists()
    val result =  checkExists.checkIfExist(arr.toIntArray())
    println("Result is $result")
}
class CheckExists {
    fun checkIfExist(arr: IntArray): Boolean {
        var result : Boolean = false
        val size = arr.size
        for(i in 0 until size){
            for(j in 0 until size){
                if(i!=j && arr[i] == 2 * arr[j])
                     return true
            }
        }
        return false
    }
}




/*
Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.



Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.


Input: arr = [3,1,7,11]
Output: false
Explanation: In this case does not exist N and M, such that N = 2 * M.
 */