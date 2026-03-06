package proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){

        SellTickets proxyObject =  (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收取服务费");
                        Object obj = method.invoke(station,args);
                        return obj;
                    }
                }
        );

        return proxyObject;
    }
}
