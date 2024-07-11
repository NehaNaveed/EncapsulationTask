class Car(private var make:String,private var model:String, private var mileage:Int) {
    init {
        if (mileage<0){
            throw IllegalArgumentException("Invalid Mileage Initialization : Mileage cannot be negative")
        }
    }

    fun setMake(cMake:String){
        make = cMake
    }

    fun getMake():String{
        return make
    }

    fun setModel(cModel:String){
        model = cModel
    }

    fun getModel():String{
        return model
    }

    fun setMileage(cMileage:Int){
        if (cMileage>0)
            mileage = cMileage
        else
            println("Mileage cannot be negative")
    }

    fun getMileage():Int{
        return mileage
    }
}

fun main(){
    val car : Car = Car("","",0)
    car.setMake("Toyota")
    car.setModel("Prius")
    car.setMileage(57)
    println("Make : ${car.getMake()} | Model : ${car.getModel()} | Mileage : ${car.getMileage()}mpg")
    car.setMake("Honda")
    car.setModel("Insight")
    car.setMileage(52)
    println("Updated =>  Make : ${car.getMake()} | Model : ${car.getModel()} | Mileage : ${car.getMileage()}mpg")
}