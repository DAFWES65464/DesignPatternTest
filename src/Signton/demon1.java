package Signton;
//单例设计模式-饿汉式(类加载浪费内存)
public class demon1 {
    private demon1(){}
    //方式一 静态变量方式
//    private static  demon1 instance = new demon1();
    //方式二 静态代码块
    private  static demon1 instance;
    static {
        instance=new demon1();
    }
    public static demon1 getInstance(){
        return instance;
    }
}
