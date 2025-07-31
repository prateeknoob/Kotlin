fun main(){
    val obj=Outer()
    obj.i

    val inner=Outer().Nested()
    inner.test()
}

class Outer{
    var i=0

    inner class Nested{
        fun test(){
            println("i am in nested class $i")
        }
    }
}