package colruyt.android.techgig
fun main(args: Array<String>) {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
 //   val m = readLine()!!.trim().toInt()
    val removeArray = RemoveDuplicates()
    val result = removeArray.removeDuplicates(arr.toIntArray())
    println("Result is $result")
}
class RemoveDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size === 0) return 0
        var i = 0
        for (j in 1 until nums.size) {
            if (nums[j] != nums[i]) {
                i++
                nums[i] = nums[j]
            }
        }
        return i + 1
     }
}


//Solution1
/*

fun removeDuplicates(nums: IntArray): Int {
        var size = nums.size
        var pointer1 = 0

       while(pointer1 < size) {

           loop@ for (i in 0 until size) {
               pointer1 += 1
             if(i+1 < size) {
                 for (j in (i + 1) until size) {
                     if (nums[i] == nums[j]) {
                         for (k in j until size) {
                             if (k + 1 < size) {

                                 nums[k] = nums[k + 1]
                             }
                         }
                         size -= 1
                         pointer1 = 0
                         break@loop
                     }
                 }
             }
           }
       }

        for(i in 0 until  size){
            println("Formatted List is ${nums[i]}")
        }
        return size

     }


 */



//End

