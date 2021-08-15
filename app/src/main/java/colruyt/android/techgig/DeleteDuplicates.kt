package colruyt.android.techgig
fun main(args: Array<String>) {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    //   val m = readLine()!!.trim().toInt()
    val removeArray = DeleteDuplicates()
    val result = removeArray.removeDuplicates(arr.toIntArray())
    println("Result is $result")
}
class DeleteDuplicates {

    fun removeDuplicates(nums: IntArray): Int {
      var size = nums.size
        var i = 0
          while(i < size) {

              loop@ for(j in 0 until size) {
                  if(i != j) {
                      if (nums[i] == nums[j]) {
                          nums[i] = nums[j]
                          size -= 1
                          i = 0
                          for (k in j until size) {
                              nums[k] = nums[k + 1]
                          }
                          break@loop

                      }
                  }
              }
              i += 1
          }

          for(l in 0 until size){
              println("Final Result is ${nums[l]}")
          }
        return i + 1
    }
}