package Singleton;

public class Main {
    public static void main(String args[]) {
        Singleton instance = Singleton.getSingletonInstance();

        instance.printMessage();
    }
}
