package responsibility;

public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    private int numStart;
    private int numEnd;
    private Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void submit(LevelRequest levelRequest) {
        if (this.nextHandler != null && levelRequest.getNum() > this.numEnd) {
            this.nextHandler.submit(levelRequest);
        } else {
            this.handleLevel();
            System.out.println("流程结束");
        }
    }

    public abstract void handleLevel();
}
