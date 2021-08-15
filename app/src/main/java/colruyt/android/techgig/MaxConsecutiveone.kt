package colruyt.android.techgig
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val checkExists = MaxConsecutiveone()
    checkExists.findDisappearedNumbers(arr.toIntArray())
   // println("Result is $result")
}
class MaxConsecutiveone {
    fun findDisappearedNumbers(nums: IntArray) {
        val size = nums.size
        var initialPosition = 0
        var finalPosition = 0
        var oneCount = 0
        var count = 0
        var oneCountList = mutableListOf<Int>()
        var zeroPositionList = mutableListOf<Int>()
        for(i in 0 until  size){
               if(nums[i] == 1){
                   count += 1
               }else if(nums[i] == 0){

               }
        }
       /*   for(i in 0 until  size ){
             if(nums[i] == 0){
                 zeroPositionList.add(i)
             }
          }
        println("Zero Position Array is $zeroPositionList")

        while(count < zeroPositionList.size)
        {
            finalPosition = zeroPositionList[count]
            for(i in initialPosition until finalPosition){
                oneCount += 1
            }
            count += 1
            oneCountList.add(oneCount)
            initialPosition = finalPosition

        }*/

        println("Final Array is $oneCountList")
    }
}