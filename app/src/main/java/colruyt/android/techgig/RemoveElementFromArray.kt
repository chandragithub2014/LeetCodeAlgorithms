package colruyt.android.techgig
fun main(args: Array<String>) {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val m = readLine()!!.trim().toInt()
    val removeArray = RemoveElementFromArray()
    removeArray.removeElement(arr.toIntArray(),m)
}
class RemoveElementFromArray {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var size = nums.size
        var pointer1 = 0
        while(pointer1 < size){
               if(nums[pointer1] == `val`){

                    for(j in pointer1 until size){

                          if(j+1 < size) {
                              nums[j] = nums[j + 1]
                          }
                    }
                   size -= 1
                   pointer1 = 0
               }else{
                   pointer1 += 1
               }
        }
        for(i in 0 until size){
            println(nums[i])
        }

        return size
    }
}

/*
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */