package decorator

abstract class Beverage(
    var description: String = "제목 없음"
) {
    open fun getDes() = description

    abstract fun cost(): Double
}