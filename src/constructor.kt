fun main(){
    var car=automobile("mustang",4,4)
    println(car.name)
    println(car.tyres)

    var per=perso("prateek",22)
    println(per.age)
    println(per.name)

    var carr=autom("car2","petrol")
    println(carr.engine)
    println(carr.maxseat)
    println(carr.tyres)
    println(carr.name)
}

class automobile(val name:String, val tyres:Int,val maxseat:Int ){ //property constructor when type is defined ex-val,var
                                                                //also called as primary constructor coz property is defined in constructor
    init { //initializer block, executes everytime the function is called
        println("$name is created")
    }
    init {
        println("second initializer block is created")
    }
}

class autom(val name: String,val tyres: Int,val maxseat: Int,val engine:String){
    constructor(nameParam: String,engineParam:String): //secondary constructor
            this(nameParam,4,4,engineParam) //used to reduce the line of code by providing default values
}

class perso(nameParam:String,ageParam:Int){ //parameter constructor
                                            //since property is not defined so we will have to define the type then it will work
    val name:String=nameParam        //we will have to initialize the parameter with something
    var age:Int=ageParam                //parameter ke basis pe property bnane pe hi kaam krega
}