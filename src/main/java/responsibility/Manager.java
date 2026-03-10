package responsibility;

public class Manager extends Handler{

    public Manager() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    public void handleLevel() {
        System.out.println("部长批准");
    }
}
