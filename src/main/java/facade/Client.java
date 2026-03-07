package facade;

public class Client {
    public static void main(String[] args) {
        SmartApplicancesFacade facade = new SmartApplicancesFacade();
        facade.say("打开家电");
    }
}
