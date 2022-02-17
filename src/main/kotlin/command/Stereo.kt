package command

class Stereo(
    private val name: String
) {
    fun on() {
        println("$name 시작!")
    }

    fun off() {
        println("$name 꺼짐")
    }
    fun setCd() {
        println("$name cd 추가")
    }

    fun setVolume() {
        println("$name 볼륨 업")
    }
}