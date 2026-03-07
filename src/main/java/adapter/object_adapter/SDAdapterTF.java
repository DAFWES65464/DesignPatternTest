package adapter.object_adapter;

public class SDAdapterTF extends SDCardImpl {
    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard){
        this.tfCard=tfCard;
    }

    @Override
    public String readSD() {
        return this.tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {

    }
}
