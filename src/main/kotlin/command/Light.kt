package command

class Light(
    private val name: String
) {
    fun off() {
        println("turn off $name")
    }

    fun on() {
        println("turn on $name")
    }
}