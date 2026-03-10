package state.before;

public interface ILift {
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void open();
    void colse();
    void run();
    void stop();


}
