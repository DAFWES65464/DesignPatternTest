package command;

public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDic("青椒炒肉丝",1);
        order1.setFoodDic("可乐",2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDic("兰州拉面",1);
        order2.setFoodDic("雪碧",2);

        SeniorChef seniorChef = new SeniorChef();
        Command command1 = new OrderCommand(order1,seniorChef);
        Command command2 = new OrderCommand(order2,seniorChef);

        Waitor waitor = new Waitor();
        waitor.setCommands(command1);
        waitor.setCommands(command2);

        waitor.OrderUp();
    }
}
