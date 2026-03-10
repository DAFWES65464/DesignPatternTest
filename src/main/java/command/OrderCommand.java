package command;

public class OrderCommand implements Command{
    private Order order;
    private SeniorChef seniorChef;

    public OrderCommand(Order order, SeniorChef seniorChef) {
        this.order = order;
        this.seniorChef = seniorChef;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"订单:");
        for(String key : order.getFoodDic().keySet()){
            seniorChef.makeFood(key,order.getFoodDic().get(key));
        }
        System.out.println(order.getDiningTable()+"准备完毕");
    }
}
