fun main(){
    println("hello world")
    println(1+3)

    var i=5
    println(i+3)
    println(i.toFloat()/2)

    var score=5
    println(score)

    var number: Int=12
    println(number)

    val numbera =10
    val result=numbera in 1 until 5
    println(result)

    var animal="dog"
    when(animal){
        "horse"-> println("animal is horse")
        "cat"-> println("animal is cat")
        "dog"-> println("animal is dog")
    }

    println("$score x $number = ${score*number}")
    val res=add(4,5)
    println(res)

    printmessage(5)
    printmessage()


    var arr= arrayOf("one","two","three")
    var arr1= arrayOf(1,2,3)
    var arr2= arrayOf<Int>(1,2,3)
    for (i in arr1.withIndex()){
        println(i)
    }
}

fun add(num1:Int,num2:Int):Int{
    val result=num1+num2
    return result
}

fun printmessage(count:Int=2){
    for(i in 1..count){
        println("Hello $i")
    }
}