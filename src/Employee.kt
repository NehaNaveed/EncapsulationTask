class Employee (private var name:String,private var position:String, private var salary:Double){
    init {
        if (salary<0){
            throw IllegalArgumentException("Invalid Salary Initialization : Salary cannot be negative")
        }
    }
    fun setName(eName:String){
        name = eName
    }

    fun getName():String{
        return name
    }

    fun setPosition(empPos:String){
        position = empPos
    }

    fun getPosition():String{
        return position
    }

    fun setSalary(empSal:Double){
        if (empSal>0)
            salary = empSal
        else
            println("Salary cannot be negative")
    }

    fun getSalary():Double{
        return salary
    }
}

fun main(){
    val emp : Employee = Employee("","",0.0)
    emp.setName("Carl")
    emp.setPosition("Lead Android Developer")
    emp.setSalary(150000.0)
    println("Name : ${emp.getName()} | Position : ${emp.getPosition()} | Salary : ${emp.getSalary()} Rs")
    emp.setName("Sarah")
    emp.setPosition("Human Resources")
    emp.setSalary(190000.0)
    println("Updated => Name : ${emp.getName()} | Position : ${emp.getPosition()} | Salary : ${emp.getSalary()} Rs")

}