package Signton;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        //writeclass();
//        demon2 Instance1 = readclass();
//        demon2 Instance2 = readclass();
//        System.out.println(Instance1);
//        System.out.println(Instance2);
        makeClass();
        makeClass();

    }
//    //序列化与反序列化
//    //写出txt
//    public static void writeclass() throws IOException {
//        demon2 Instance = demon2.getInstance();
//        ObjectOutputStream wc = new ObjectOutputStream(new FileOutputStream("demon.txt"));
//        wc.writeObject(Instance);
//        wc.close();
//    }
//    //写入idea
//    public static demon2 readclass() throws IOException, ClassNotFoundException {
//        ObjectInput rc = new ObjectInputStream(new FileInputStream("demon.txt"));
//        demon2 Instance = (demon2) rc.readObject();
//        rc.close();
//        return Instance;
//    }



        //反射
    public static void makeClass() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = demon2.class;
        Constructor con = clazz.getDeclaredConstructor();
        con.setAccessible(true);
        demon2 instance = (demon2) con.newInstance();
        System.out.println(instance);
    }

}
