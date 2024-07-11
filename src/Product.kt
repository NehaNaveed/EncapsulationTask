class Product (private var name:String,private var price:Double){
    init
    {
        if (price<0) {
            throw IllegalArgumentException("Invalid Price Initialization : Price cannot be negative")
        }
    }

    fun setName(pName:String){
        name = pName
    }

    fun getName():String{
        return name
    }
    fun setPrice(pr:Double){
        if (pr>0){
            price = pr
        }
        else
            println("Price value can not be negative")
    }
    fun getPrice():Double{
        return price
    }
}

fun main(){
    val prod1 : Product = Product("Lamp",5500.0)
    val prod2 : Product = Product("Juice",250.0)
    println("Product 1 has name: ${prod1.getName()} and price: ${prod1.getPrice()}Rs")
    println("Product 2 has name: ${prod2.getName()} and price: ${prod2.getPrice()}Rs")
    prod1.setName("Spotlights")
    prod2.setName("Fresh Juice")
    prod1.setPrice(7800.0)
    prod2.setPrice(300.0)
    println("Updated Name and Price for product 1 = ${prod1.getName()} - ${prod1.getPrice()}Rs")
    println("Updated Name and Price for product 2 = ${prod2.getName()} - ${prod2.getPrice()}Rs")
}