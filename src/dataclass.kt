fun main(){
    val p1=Persons(1,"John")
    val p2=Persons(1,"John")

    val p3=p1.copy(id=3)
    println(p3)

    val(id:Int)=p1  //destructing
    println(id)

    println(p1==p2)
    println(p1.hashCode())
}
data class Persons(val id:Int,val name:String){

}