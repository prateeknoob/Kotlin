fun main(){
    val nums= listOf(1,2,3,4,5)
    val list=nums.filter { it%2==0 }
    println(list)

    val userlist= listOf(
        User(1,"A"),
        User(2,"B"),
        User(3,"C")
    )
    println(userlist.filter{it.id==2})

    val sqr=nums.map { it*it }
    println(sqr)

    val paiduserlist=userlist.map {
        PaidUser(it.id,it.name,"abed")
    }
    println(paiduserlist)

    nums.forEach{ println(it) }
}

data class User(val id:Int,val name:String){
}

data class PaidUser(val id:Int,val name:String,val type:String){
}