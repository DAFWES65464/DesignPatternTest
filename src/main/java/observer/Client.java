package observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new SubscriptionSubject();

        Observer observer1 = new WeixinUser("张三");
        Observer observer2 = new WeixinUser("李四");
        Observer observer3 = new WeixinUser("王五");

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.notify("动画片更新了");
    }
}
