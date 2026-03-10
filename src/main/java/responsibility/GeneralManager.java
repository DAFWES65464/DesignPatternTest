package responsibility;

public class GeneralManager extends Handler{

    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    public void handleLevel() {
        System.out.println("总经理批准");
    }
}
