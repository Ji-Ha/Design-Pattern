package decorator

fun main() {
    val beverage = Espresso()
    println(beverage.description)

    var beverage2: Beverage = HouseBlend()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println(beverage2.getDes())
}