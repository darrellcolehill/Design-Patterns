package Command;

public class Main {
    public static void main(String args[]) {

        Light mainLight = new Light(1);

        Invoker remote = new Invoker(
            new LightOnCommand(mainLight), 
            new LightOffCommand(mainLight), 
            new LightUpCommand(mainLight), 
            new LightDownCommand(mainLight)
        );

        remote.on.execute();
        remote.on.unexecute();
        remote.on.execute();
        remote.down.execute();
        remote.down.unexecute();
    }
}
