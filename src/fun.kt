fun main(){
    println("hello world".extension())
    println(3+(4).lala())
}


fun String.extension():String{
    return "-------\n$this\n-------"
}
fun Int.lala():Int{
    return 5
}