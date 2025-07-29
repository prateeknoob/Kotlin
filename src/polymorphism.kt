fun main(){
    val circle:Shape=Circle(4.0)
    val square:Shape=Square(5.0)

    println(circle.area())
    println(square.area())

    val shapes= arrayOf(Circle(6.5),Square(9.1),triangle(5.5,6.1))
    calculatearea(shapes)
}

fun calculatearea(shapes: Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }
}


open class Shape{
    open fun area():Double{
        return 0.0
    }
}

class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}

class Square(val side:Double):Shape(){
    override fun area(): Double {
        return side*side
    }
}
class triangle(val base:Double,val height:Double):Shape(){
    override fun area(): Double {
        return 0.5*(base*height)
    }
}