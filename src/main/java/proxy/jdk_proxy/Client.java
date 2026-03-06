package proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxy = proxyFactory.getProxyObject();
        proxy.sell();
    }
}
