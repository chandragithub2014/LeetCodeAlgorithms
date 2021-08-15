package colruyt.android.techgig
fun main(args: Array<String>) {


    val nums1 = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val nums2 = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val m = readLine()!!.trim().toInt()
    val n = readLine()!!.trim().toInt()
    val mergeArray = MergeArray()
    mergeArray.merge(nums1.toIntArray(),m,nums2.toIntArray(),n)
}
class MergeArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var num2Index = 0
       nums1.forEachIndexed {  index, i ->
                if(index >= m){
                  if(num2Index < nums2.size) {
                      nums1[index] = nums2[num2Index]
                      num2Index += 1
                  }
              }
       }
        nums1.sorted().toTypedArray().toIntArray().contentToString()
        println("Final Nums1 is ${nums1.sorted().toTypedArray().toIntArray().contentToString()}")

    }
}

/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */