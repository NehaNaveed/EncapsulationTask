class Student(private var name:String,private var grade:String) {
    init
    {
        if (grade != "A" && grade != "B" && grade != "C" && grade != "D" && grade != "F") {
            throw IllegalArgumentException("Invalid Grade Initialization")
        }
    }
    fun setName(stName:String){
        name = stName
    }

    fun getName():String{
        return name
    }
    fun setGrade(gr:String){
        when(gr){
            "A", "B", "C", "D", "F" -> grade = gr
            else -> println("Invalid grade")
        }
    }
    fun getGrade():String{
        return grade
    }

}

fun main(){
    val st1 : Student = Student("Ali","B")
    val st2 : Student = Student("Neha","A")
    println("Student 1 has name: ${st1.getName()} and grade: ${st1.getGrade()}")
    println("Student 2 has name: ${st2.getName()} and grade: ${st2.getGrade()}")
    st1.setGrade("F")
    st2.setGrade("C")
    println("Updated grade for ${st1.getName()}: ${st1.getGrade()}")
    println("Updated grade for ${st2.getName()}: ${st2.getGrade()}")
}