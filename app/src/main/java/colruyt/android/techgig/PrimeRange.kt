package colruyt.android.techgig
import java.util.*
var mySet = mutableSetOf<String>()
var myList = mutableListOf<String>()
var resultList = mutableListOf<String>()
var virusSet = mutableSetOf<String>()
   fun main(args: Array<String>) {
        // Write code here
     //  handlePrimeNumberRange()
    //   val input = generateSequence(::readLine)
  //     val lines = input.toList()

      // val inputFromCommand = Scanner(System.`in`)
       val virus = readLine()!! //inputFromCommand.next()

       val numberOfPeople = readLine()!!.toInt() //inputFromCommand.nextInt()
       for(k in 0 until numberOfPeople){
           var input =  readLine()!!//inputFromCommand.next()
           myList.add(input)
       }
       //displaySubsequence(virus,isVirus = true)
       processToSet(0,virus.length-1,virus,isVirus = true)
       for(m in myList) {
           mySet =  mutableSetOf<String>()
           if(m.isNotEmpty()){
               processToSet(0,m.length-1,m,isVirus = false)
           }
          // displaySubsequence(m)
       }

    //   handleSubsequence(input)
   }

fun displaySubsequence(myString: String,isVirus:Boolean = false){
    //  var myStringBuffer = StringBuffer(myString)

    var stringLength = myString.length
    var pointer1 = 0
    var pointer2 = stringLength -1
     if(stringLength > 0 ) {
          processToSet(pointer1,pointer2,myString,isVirus)
      }

}

private fun processToSet(initialPointer:Int, upperLimit:Int, myStringBuffer:String,isVirus:Boolean = false){

    var pointer2 = upperLimit
    var pointer1 = initialPointer

    mySet.add(myStringBuffer[pointer1].toString())
   // mySet.add(myStringBuffer.substring(pointer1,myStringBuffer.length))
   // while (pointer2 != pointer1) {
        for(i in pointer2 downTo pointer1) {
        mySet.add(myStringBuffer[pointer1].toString() + myStringBuffer[i].toString())
        var temp = pointer1
     //   while(temp > 0){
            for(k in temp downTo 0){
     //       temp -= 1
            mySet.add(myStringBuffer[k].toString()+myStringBuffer[pointer1].toString() + myStringBuffer[pointer2].toString())
        }
   //     pointer2 -= 1
    }
   // println("Pointer1 $pointer1 and pointer2 $pointer2")
    pointer2 = upperLimit
    pointer1 += 1
    if(pointer1<=myStringBuffer.length-1){
        processToSet(pointer1,pointer2,myStringBuffer,isVirus)
    }else{
     //   println("myset is $mySet")
        if(isVirus){
            virusSet = mySet
            mySet =  mutableSetOf<String>()
         //   println("virusSet is $virusSet")
        }
        if(virusSet.size>0 && mySet.size>0) {
            if (virusSet.containsAll(mySet)) {
                println("POSITIVE")
            } else {
                println("NEGATIVE")
            }
        }
      /* if(virusSet.toMutableList().size>0 && mySet.toMutableList().size >0) {
           if (virusSet.toMutableList().containsAll(mySet.toMutableList())) {
              // resultList.add("POSITIVE")
               println("POSITIVE")
           }else{
               println("NEGATIVE")
            //   resultList.add("NEGATIVE")
           }
       }*/
    }
}



fun handlePrimeNumberRange(){
    var primeNumberDifference = 0

    var primeNumberList = mutableListOf<Int>()
    val input = Scanner(System.`in`)
    val testCaseCount = input.nextInt()
    for(count in 0 until testCaseCount) {
        var lowerRange = input.nextInt()
        val upperRange = input.nextInt()
        primeNumberList = mutableListOf()
        if(lowerRange != upperRange) {
            while (lowerRange <= upperRange) {
                if (checkPrimeNumber(lowerRange)) {
                    print("$lowerRange ")
                    primeNumberList.add(lowerRange)
                }

                ++lowerRange
            }
            println("List of PrimeNumber is $primeNumberList")
            if(primeNumberList.size > 0) {
                primeNumberDifference =
                    primeNumberList[primeNumberList.size - 1] - primeNumberList[0]
                println("Difference is   $primeNumberDifference")
            }else{
                primeNumberDifference = -1
                println("Difference is   $primeNumberDifference")
            }
        }else{
            println("Result is $primeNumberDifference")
        }
    }
}
fun checkPrimeNumber(num: Int): Boolean {
    var flag = true

    for (i in 2..num / 2) {

        if (num % i == 0) {
            flag = false
            break
        }
    }

    return flag
}



