package factory.simple_factory;

import factory.before.Coffee;
import factory.before.CoffeeStore;

//简单工厂
//抽象产品、具体产品、具体工厂
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("拿铁咖啡");
        System.out.println(coffee.getName());

    }
}
