package factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        DessertFactory factory = new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
