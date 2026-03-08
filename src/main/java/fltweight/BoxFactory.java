package fltweight;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.util.HashMap;

public class BoxFactory {

    private HashMap<String,AbstractBox> map;
    private static BoxFactory factory = new BoxFactory();

    private BoxFactory(){
        map = new HashMap<String,AbstractBox>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    public static BoxFactory getInstance(){
        return factory;
    }


    public AbstractBox getBox(String key){
        return map.get(key);
    }
}
