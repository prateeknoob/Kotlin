fun main(){
    val arr= arrayOf(1,2,3)
    try {
        println(arr[5])
    }
    catch (e:ArrayIndexOutOfBoundsException){
        println("enter valid array index")
    }
    finally {
        println("end point")
    }
    createuserlist(5)
    createuserlist(-9)
}

fun createuserlist(count:Int){
    if(count<0){
        throw IllegalArgumentException("count must be greater than zero")
    }
    else{
        println("your number is $count")
    }
}