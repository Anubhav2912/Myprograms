package TestProject.src.com.anu.learning.oops.DesignPattern.Singleton;

import java.io.Serializable;

import java.io.*;
import java.lang.reflect.Constructor;
public class TestSingleton implements Serializable {
    public static void main(String[] args) throws Exception {
        Singleton sobj1 = Singleton.getInstance();
        System.out.println(sobj1.hashCode());
        Singleton sobj2 = Singleton.getInstance();
        System.out.println(sobj2.hashCode());

        //Using Reflection violating the singleton property
        try {
            //loading the class dynamically
            Class clazz = Class.forName("TestProject.src.com.anu.learning.oops.DesignPattern.Singleton.Singleton");

            //fetching all the constructor present in that particular class that you have loaded
            Constructor[] declaredConstructors = clazz.getDeclaredConstructors();

            //setting the accessibility of all the constructor to be used even if the constructor is private
            declaredConstructors[0].setAccessible(true);

            //constructor object allow to call newInstance to make object and typecasting to your object
            Singleton sobj3 = (Singleton) declaredConstructors[0].newInstance();
            System.out.println(sobj3.hashCode());
        } catch (Exception e) {
            System.out.println("please get rid of using other way to create object");
        }

        File file = new File("abc.txt");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(sobj1);


            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Singleton sobj4 = (Singleton)ois.readObject();
            System.out.println(sobj4.hashCode());
        } catch (Exception e){
        }

    }
}
