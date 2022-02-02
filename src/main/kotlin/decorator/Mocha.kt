package decorator

class Mocha(
    private var beverage: Beverage
    ): CondimentDecorator() {

    override fun cost(): Double {
        return beverage.cost() + .20
    }

    override fun getDes(): String {
        return beverage.getDes() + ", 모카"
    }
}