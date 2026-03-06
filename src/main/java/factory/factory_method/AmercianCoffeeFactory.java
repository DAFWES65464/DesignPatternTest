package factory.factory_method;

public class AmercianCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmercianCoffee();
    }
}
