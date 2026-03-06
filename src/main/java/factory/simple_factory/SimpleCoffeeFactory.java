package factory.simple_factory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if(type.equals("美式咖啡")){
            coffee = new AmercianCoffee();
        }
        else if(type.equals("拿铁咖啡")){
            coffee = new LatteCoffee();
        }
        else {
            throw  new RuntimeException("对不起，您点的咖啡没有");
        }
        return coffee;
    }
}
