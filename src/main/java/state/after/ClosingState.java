package state.after;

public class ClosingState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENINGSTATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关门");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNINGSTATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPINGSTATE);
        super.context.stop();
    }
}
