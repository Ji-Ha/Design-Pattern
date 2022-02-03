package decorator

fun main() {
    val starbuzzStore = StarbuzzStore()
    val beverage = starbuzzStore.createBeverage("Espresso")
    println(beverage.description)

    var beverage2 = starbuzzStore.createBeverage("HouseBlend")
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println(beverage2.getDes())
}