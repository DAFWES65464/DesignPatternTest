package state.before;

public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.OPENING_STATE);

        lift.open();
        lift.colse();
        lift.run();
        lift.stop();
    }
}
