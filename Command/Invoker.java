package Command;

public class Invoker {
    // This is not necessarily specific to the pattern, but
    // more specific to the example of a smart home remote for lights 

    public ICommand on;
    public ICommand off;
    public ICommand up;
    public ICommand down;

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
        this.down = down;
        this.off = off;
        this.on = on;
        this.up = up;
    }
}
