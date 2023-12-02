package Command;

public class LightDownCommand implements ICommand {

    private Light lightReceiver = null;

    public LightDownCommand(Light light) {
        lightReceiver = light;
    }

    @Override
    public void execute() {
        lightReceiver.down();
    }

    @Override
    public void unexecute() {
        lightReceiver.up();
    }
    
}
