package bridge;

public abstract class OperationSystem {
    protected VideoFile videoFile;

    public OperationSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String Filename);
}
