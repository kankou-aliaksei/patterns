package space.alex.freeman.command.remotecontrol;

import space.alex.freeman.command.remotecontrol.command.Command;
import space.alex.freeman.command.remotecontrol.command.NoCommand;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> onCommands;
    private List<Command> offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void pressOnButton(int slot) {
        onCommands.get(slot).execute();
        undoCommand = onCommands.get(slot);
    }

    public void pressOffButton(int slot) {
        offCommands.get(slot).execute();
        undoCommand = offCommands.get(slot);
    }

    public void undo() {
        undoCommand.undo();
    }
}
