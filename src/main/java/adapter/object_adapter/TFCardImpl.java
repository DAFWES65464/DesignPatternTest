package adapter.object_adapter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {

    }
}
