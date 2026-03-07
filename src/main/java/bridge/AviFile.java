package bridge;

public class AviFile implements VideoFile{
    @Override
    public void decode(String Filename) {
        System.out.println("avi解码"+Filename);
    }
}
