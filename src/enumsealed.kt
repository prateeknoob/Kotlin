fun main(){
    val day=Days.MONDAY
    println(day)
    println(day.number)
    for (i in Days.values()){
        println(i)
    }
    day.printformatted()


    val tile:tiles=red("mushroom",3)
    val points:Int=when(tile){
        is red->tile.points*4
        is blue->tile.points*5
    }
    println(points)
}

enum class Days(val number:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printformatted(){
        println("Day is $this")
    }
}

sealed class tiles
class red(val type:String,val points:Int):tiles()
class blue(val points:Int):tiles()