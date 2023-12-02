package Command;

public class LightOffCommand implements ICommand {

    private Light lightReceiver = null;

    public LightOffCommand(Light light) {
        lightReceiver = light;
    }

    @Override
    public void execute() {
        lightReceiver.turnOff();
    }

    @Override
    public void unexecute() {
        lightReceiver.turnOn();
    }
    
}
