fun main(){
    var obj=calculator()
    println(obj.add(3,4))

    val p1=person("djfasdfa",34)
    println(p1.age)  //value get

    println(p1.name)

}

class calculator{

    lateinit var message:String           //lateinit use karke baad me initilize kar skte hai for property declaration

    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
}

class person(nameparam:String,ageParam:Int){
    var name:String=nameparam
        get() {
            return field.uppercase()
        }
    var age:Int=ageParam
        set(value) {
            if (value>0){
                field=value
            }
            else{
                println("age cant be negative")
            }
        }
}