package bridge;

public class Mac extends OperationSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String Filename) {
        System.out.println("Mac系统");
        super.videoFile.decode(Filename);
    }
}
