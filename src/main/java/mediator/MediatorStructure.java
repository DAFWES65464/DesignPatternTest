package mediator;

public class MediatorStructure extends Mediator{

    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if(person.name.equals(tenant.name)){
            houseOwner.getMessage(message);
        }
        else tenant.getMessage(message);
    }
}
