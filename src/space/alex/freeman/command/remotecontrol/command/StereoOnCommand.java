package space.alex.freeman.command.remotecontrol.command;

import space.alex.freeman.command.remotecontrol.device.Stereo;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setCd();
        stereo.setVolume(7);
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
