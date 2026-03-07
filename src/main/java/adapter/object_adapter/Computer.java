package adapter.object_adapter;

public class Computer {

    public String readSD(SDCardImpl sdCard){
        if(sdCard==null){
            throw new NullPointerException("不能为空");
        }
        return sdCard.readSD();
    }

}
