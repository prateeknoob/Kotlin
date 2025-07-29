fun main(){
    var name1=Child()
    println(name1.naam)
    println(name1.name)

    val one=Oneplus()
    one.display()

    val generalmobile=Mobile()
    generalmobile.display()

}

open class Parent{
    val name:String="sdfasd"
}

open class Child:Parent(){
    val naam:String="hehehe"
}


open class Mobile(){
    open val name:String=" "
    open val size:Int=4
    open fun display()=println("simple mobile display")
}

class Oneplus:Mobile(){
    override val size:Int=6
    override val name:String="one plus phone"
    override fun display(){
        super.display()
        println("One plus phone")
    }
}