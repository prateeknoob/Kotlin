fun main(){
    dragobj(arrayOf(Mycircle(5.0),Mysquare(4.5),Myplayer("prateek")))
}

fun dragobj(objects:Array<Draggable>){
    for (obj in objects){
        obj.drag()
    }
}

interface Draggable{
    fun drag()
}

abstract class Shapess:Draggable{
    abstract fun area():Double
}

class Mycircle(val radius:Double):Shapess(){
    override fun drag() {
        println("Circle is draggable")
    }
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}

class Mysquare(val side:Double):Shapess(){
    override fun area():Double= side*side
    override fun drag()= println("Square is draggable")
}

class Myplayer(val name:String):Draggable{
    override fun drag()= println("$name is dragging")
}
