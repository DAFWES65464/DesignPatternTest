package state.after;

public class StoppingState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENINGSTATE);
        super.context.open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSINGSTATE);
        super.context.close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNINGSTATE);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}
