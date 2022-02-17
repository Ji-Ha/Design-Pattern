package command

class RemoteControl {
    private var onCommands: Array<Command> = Array(7) { NoCommand() }
    private var offCommands: Array<Command> = Array(7) { NoCommand() }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("컨트롤할 수 있는 것들 모음\n")
        for(i in onCommands.indices)
            sb.append("번호: $i ${onCommands[i].javaClass.name} ${offCommands[i].javaClass.name}\n")
        return sb.toString()
    }
}