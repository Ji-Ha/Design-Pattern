package command

class StereoOnWithCDCommand(
    private val stereo: Stereo
): Command {

    override fun execute() {
        stereo.on()
        stereo.setCd()
        stereo.setVolume()
    }
}