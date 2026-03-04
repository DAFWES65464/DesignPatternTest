package Signton;

import java.io.Serial;
import java.io.Serializable;

//单例设计模式-懒汉式
public class demon2 implements Serializable {
    private static boolean flag = false;
    private demon2(){
        synchronized (demon2.class) {
            if (flag) {
                throw new RuntimeException("创建多个对象");
            }
            flag = true;
        }
    }
    //方式一 双重检查锁方式
//    private static volatile demon2 instance;//JVM指令重排
//    public static demon2 getInstance() {
//        if (instance == null) {
//            synchronized (demon2.class) {
//                if (instance == null) {
//                    instance = new demon2();
//                }
//            }
//        }
//        return instance;
//    }
      //方式二 静态内部类
    public static class sington{//内部类属性方法被调用才加载
        private static final demon2 instance = new demon2();
    }

    public static demon2 getInstance(){
        return sington.instance;
    }

//    @Serial
//    public Object readResolve(){
//        return sington.instance;
//    }

}
