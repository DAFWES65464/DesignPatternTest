package visitor;

public class Someone implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("别人喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("别人喂狗");
    }
}
