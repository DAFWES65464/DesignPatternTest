package adapter.class_adapter;

public class Computer {

    public String readSD(SDCard sdCard){
        if(sdCard==null){
            throw new NullPointerException("不能为空");
        }
        return sdCard.readSD();
    }

}
