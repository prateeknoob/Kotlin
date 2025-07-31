fun main(){
    println("hello world".extension())
    println(3+(4).lala())

    val emp=Employee()
    emp.apply {
        name="noob"
        age=21
    }
    println(emp)

    emp.let {
        println(it.name)
        println(it.age)
    }
    println(emp)

    with(emp){          //emp is externally called
        age=40
        name="lallala"
    }
    println(emp)

    emp.run {
        age=35
        name="adfa"
    }
    println(emp)


}


fun String.extension():String{
    return "-------\n$this\n-------"
}
fun Int.lala():Int{
    return 5
}

data class Employee(var name:String="",var age:Int=19){

}