import kotlin.math.pow

fun main(){
    println(sum(4.5,4.8))
    println(power(4.0,3.0))

    var fn:(a:Double,b:Double)->Double=::sum         //function in variable
    println(fn(2.5,9.0))

    calculator(5.0,5.0,::sum)


    var lambda1={x:Int,y:Int->x+y}      //single line lambda
    println(lambda1(1,4))

    var multilinelambda={                           //multi line lambda
        println("hello lambda")
        val a=23
        "hello"
        2
    }

    val singleparamlambda={x:Int->x*x}
    val simplyfy:(Int)->Int={it*it}
    val lambda2:(Int)->(Int)={x->x*x}
    val sayHi={msg:String-> println("hello $msg")}
}

fun sum(a:Double,b:Double):Double{
    return a+b
}

fun power(a:Double,b:Double):Double{
    return a.pow(b)
}

fun calculator(a:Double,b:Double,gn:(Double,Double)->Double){  //function as input
    val result=gn(a,b)                                       //higher order function
    println(result)
}