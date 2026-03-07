package bridge;

public class Cilent {
    public static void main(String[] args) {
        VideoFile aviFile = new AviFile();
        OperationSystem system = new Windows(aviFile);
        system.play("战狼3");
    }
}
