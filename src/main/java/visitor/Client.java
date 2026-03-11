package visitor;

public class Client {
    public static void main(String[] args) {
        Person owner = new Owner();
        Person someone = new Someone();

        Animal cat = new Cat();
        Animal dog = new Dog();

        Home home = new Home();
        home.add(cat);
        home.add(dog);

        home.action(owner);
        home.action(someone);
    }
}
