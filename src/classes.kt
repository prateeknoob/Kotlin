fun main(){
    val mustang=Car("Mustang", "Petrol", 1000)
    val beetle=Car("Beetle", "Diesal", 500)
    println(mustang.name)
    println(beetle.type)
    mustang.drivecar()
    beetle.applybrake()
}

class Car(val name: String, val type:String, var kmran:Int){
    fun drivecar(){
        println("$name car is running")
    }
    fun applybrake(){
        println("$name brakes are applied")
    }
}