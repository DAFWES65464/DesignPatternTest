package state.after;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.OPENINGSTATE);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
