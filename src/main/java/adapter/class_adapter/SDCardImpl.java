package adapter.class_adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard";
        return msg;
    }

    @Override
    public void writeSD(String msg) {

    }
}
