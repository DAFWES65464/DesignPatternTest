package state.after;

public class Context {
    public final static OpeningState OPENINGSTATE = new OpeningState();
    public final static ClosingState CLOSINGSTATE = new ClosingState();
    public final static RunningState RUNNINGSTATE = new RunningState();
    public final static StoppingState STOPPINGSTATE = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }
}
