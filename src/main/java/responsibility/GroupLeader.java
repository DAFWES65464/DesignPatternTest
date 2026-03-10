package responsibility;

public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0, NUM_ONE);
    }

    @Override
    public void handleLevel() {
        System.out.println("小组组长批准");
    }
}
