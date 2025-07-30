fun main() {
    val circle = Circles(4.0)
    println(circle.area())
    circle.display()
}

abstract class Shapes {
    var name: String = ""
    abstract fun area(): Double
    abstract fun display()    // MUST BE EXACT
}

class Circles(val radius: Double) : Shapes() {
    override fun area(): Double {
        return Math.PI*radius*radius
    }

    override fun display() {
        println("Circle is getting Displayed")
    }
}
