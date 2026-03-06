package proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxy = proxyFactory.getProxyObject();
        proxy.sell();
    }
}
