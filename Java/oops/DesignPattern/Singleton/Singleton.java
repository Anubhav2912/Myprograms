package TestProject.src.com.anu.learning.oops.DesignPattern.Singleton;

public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton() {

        //To protect creation of singleton object by using Reflection.
        if(INSTANCE != null){
            throw new RuntimeException("please call getInstance method and do not try to make object from any other way..");
        }
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
