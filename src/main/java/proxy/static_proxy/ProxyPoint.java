package proxy.static_proxy;

public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取服务费");
        trainStation.sell();
    }
}
