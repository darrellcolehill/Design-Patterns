package Command;

public class LightOnCommand implements ICommand {

    private Light lightReceiver = null;

    public LightOnCommand(Light light) {
        lightReceiver = light;
    }

    @Override
    public void execute() {
        lightReceiver.turnOn();
    }

    @Override
    public void unexecute() {
        lightReceiver.turnOff();
    }
    
}
