package state.before;

public class Lift implements ILift{

    private int state;

    @Override
    public void setState(int state) {
        this.state=state;
    }

    @Override
    public void open() {
        switch (state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯开门");
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                System.out.println("电梯开门");
                this.setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void colse() {
        switch (state){
            case OPENING_STATE:
                System.out.println("电梯关门");
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                System.out.println("电梯关门");
                this.setState(CLOSING_STATE);
                break;
        }
    }

    @Override
    public void run() {
        switch (state){
            case OPENING_STATE:
                System.out.println("电梯运行");
                break;
            case CLOSING_STATE:
                System.out.println("电梯运行");
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                System.out.println("电梯运行");
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (state){
            case OPENING_STATE:
                System.out.println("电梯停止");
                this.setState(STOPPING_STATE);
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止");
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }
}
