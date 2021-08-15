package colruyt.android.techgig

import kotlin.math.ceil

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    var finalGrades = mutableListOf<Int>()
    grades.forEach {
   //  println("Result is ${calculateGrade(it)}")
        finalGrades.add(calculateGrade(it))
    }

   return  finalGrades.toTypedArray()
}
fun calculateGrade(grade : Int) : Int{

    var multipleFive = ceil((grade.toDouble()/5)) * 5
 // println("Multiple5 is $multipleFive")
    val difference = (multipleFive - grade).toInt()
    if(multipleFive >=40){
        if(difference < 3){
            return  multipleFive.toInt()
        }else {
            return  grade
        }
    }else {
        return  grade
    }
}
fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
