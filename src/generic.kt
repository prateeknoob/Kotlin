fun main(){
    val icontainer=Container<Int>(3)
    val scontainer=Container<String>("dododo")
    println(icontainer)
    println(scontainer)

    add(1,2,23,3,4)
    add(1,1,1,1,1,1,1)
}

class Container<T>(var data:T){
    fun setval(value:T){
        data=value
    }
    fun getval():T{
        return data
    }
}

fun add(vararg values:Int){
    var sum=0;
    for (i in values){
        sum+=i
    }
    println(sum)
}