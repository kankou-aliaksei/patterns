package space.alex.freeman.command.remotecontrol;

import space.alex.freeman.command.remotecontrol.command.*;
import space.alex.freeman.command.remotecontrol.device.CeilingFan;
import space.alex.freeman.command.remotecontrol.device.GarageDoor;
import space.alex.freeman.command.remotecontrol.device.Light;
import space.alex.freeman.command.remotecontrol.device.Stereo;

import java.util.LinkedList;
import java.util.List;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan();
        Stereo stereo = new Stereo();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorClose = new GarageDoorCloseCommand(garageDoor);
        Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        Command stereoOn = new StereoOnCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);
        List<Command> partyOnCommands = new LinkedList<>();
        partyOnCommands.add(lightOnCommand);
        partyOnCommands.add(stereoOn);
        Command partyOn = new MacroCommand(partyOnCommands);
        List<Command> partyOffCommands = new LinkedList<>();
        partyOnCommands.add(lightOffCommand);
        partyOnCommands.add(stereoOff);
        Command partyOff = new MacroCommand(partyOffCommands);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(4, partyOn, partyOff);

/*        remoteControl.pressOnButton(0);
        remoteControl.pressOffButton(0);
        remoteControl.undo();
        remoteControl.pressOnButton(1);
        remoteControl.pressOffButton(1);
        remoteControl.undo();
        remoteControl.pressOnButton(2);
        remoteControl.pressOffButton(2);
        remoteControl.undo();
        remoteControl.pressOnButton(3);
        remoteControl.undo();*/

        remoteControl.pressOnButton(4);
        remoteControl.pressOffButton(4);

    }
}
