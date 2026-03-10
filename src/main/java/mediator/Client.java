package mediator;

public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("房主",mediator);
        Tenant tenant = new Tenant("租房",mediator);

        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);
        mediator.constact("出租三室一厅",houseOwner);
        mediator.constact("我想要租三室一厅",tenant);


    }
}
