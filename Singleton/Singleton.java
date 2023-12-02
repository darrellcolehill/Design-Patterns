package Singleton; 

class Singleton {

    static private Singleton singleton = null;
    private String message = "THERE CAN ONLY BE ONE!!!!!!!!!";

    private Singleton() {}

    public static Singleton getSingletonInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        } 
        
        return singleton;
    }

    public void printMessage() {
        System.out.println(message);
    }
}