package bridge;

public class RmvbFile implements VideoFile{
    @Override
    public void decode(String Filename) {
        System.out.println("rmvb解码"+Filename);
    }
}
