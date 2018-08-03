package creational.singleton;

public class Singleton {
    private static Singleton mInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (mInstance == null) {
            synchronized (Singleton.class){
                mInstance = new Singleton();
            }
        }
        return mInstance;
    }

    public void sayHello(){
        System.out.println("I'm creational.singleton.");
    }
}
