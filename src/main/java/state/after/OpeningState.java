package state.after;

public class OpeningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯开门");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSINGSTATE);
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPINGSTATE);
        super.context.stop();
    }
}
