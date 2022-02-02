package decorator

abstract class CondimentDecorator: Beverage() {
    abstract override fun getDes(): String
}