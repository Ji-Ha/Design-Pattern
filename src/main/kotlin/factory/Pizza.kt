package factory

abstract class Pizza {
    abstract var name: String
    abstract var dough: String
    abstract var sauce: String
    abstract var toppings: ArrayList<String>

    abstract fun prepare()

    open fun bake() {
        println("bake 25분 걸려요.")
    }

    open fun cut() {
        println("pizza를 잘라서 드릴게요~")
    }

    open fun box() {
        println("박스 포장을 합니다.")
    }
}