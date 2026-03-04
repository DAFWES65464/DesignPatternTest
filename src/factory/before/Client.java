package factory.before;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("拿铁咖啡");
        System.out.println(coffee.getName());
    }
}
