package factory.factory_method;

//抽象工厂、具体工厂、抽象产品、具体产品
public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new AmercianCoffeeFactory();
        CoffeeStore store = new CoffeeStore();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
