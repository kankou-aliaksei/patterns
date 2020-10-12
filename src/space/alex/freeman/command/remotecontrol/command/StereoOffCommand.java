package space.alex.freeman.command.remotecontrol.command;

import space.alex.freeman.command.remotecontrol.device.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.setCd();
        stereo.setVolume(7);
        stereo.on();
    }
}
