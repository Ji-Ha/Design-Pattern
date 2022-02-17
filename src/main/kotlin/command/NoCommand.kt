package command

class NoCommand : Command {
    override fun execute() {
        println("비어있는 커맨드 입니다!")
    }
}