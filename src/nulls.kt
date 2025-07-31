fun main(){
    var gender:String="male"
    var gender2: String?=null
    var isadult: Boolean? =null

    println(gender2?.uppercase())

    gender2?.let {
        println("line 1")
        println("$gender2")
    }

    var selectedvalue=gender2?:"NA"
    println(selectedvalue)

    var value=gender2!!.uppercase()     //throws null pointer exception
}