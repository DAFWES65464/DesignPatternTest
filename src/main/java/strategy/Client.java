package strategy;

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.SalesManShow();
        salesMan.setStrategy(new StrategyB());
        salesMan.SalesManShow();
    }
}
