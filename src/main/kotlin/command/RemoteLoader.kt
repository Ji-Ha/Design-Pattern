package command

class RemoteLoader {
}

fun main() {
    val remoteControl = RemoteControl()

    val livingRoomLight = Light("Living Room")
    val basicStereo = Stereo("배고파")

    val livingRoomLightOffCommand = LightOffCommand(livingRoomLight)
    val livingRoomLightOnCommand = LightOnCommand(livingRoomLight)

    val basicStereoOnCommand = StereoOnWithCDCommand(basicStereo)
    val basicStereoOffCommand = StereoOffCommand(basicStereo)

    remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand)
    remoteControl.setCommand(1, basicStereoOnCommand, basicStereoOffCommand)

    println(remoteControl)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)

    remoteControl.onButtonWasPushed(1)
    remoteControl.offButtonWasPushed(1)
}