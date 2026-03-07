package bridge;

import java.io.File;

public class Windows extends OperationSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String Filename) {
        System.out.println("Windows系统");
        super.videoFile.decode(Filename);
    }
}
