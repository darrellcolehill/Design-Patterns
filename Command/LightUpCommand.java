package Command;

public class LightUpCommand implements ICommand {

    private Light lightReceiver = null;

    public LightUpCommand(Light light) {
        lightReceiver = light;
    }

    @Override
    public void execute() {
        lightReceiver.up();
    }

    @Override
    public void unexecute() {
        lightReceiver.down();
    }
    
}

