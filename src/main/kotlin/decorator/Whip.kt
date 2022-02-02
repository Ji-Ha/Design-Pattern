package decorator

class Whip(
    private var beverage: Beverage
    ) : CondimentDecorator() {

    override fun cost(): Double {
        return beverage.cost() + .59
    }

    override fun getDes(): String {
        return beverage.getDes() + ", 휘핑 크림"
    }
}