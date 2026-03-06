package proxy.jdk_proxy;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("售卖火车票");
    }
}
