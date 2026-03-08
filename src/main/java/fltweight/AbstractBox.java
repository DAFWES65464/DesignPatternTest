package fltweight;

public abstract class AbstractBox {
    public abstract String getShape();
    public void display(String color){
        System.out.println(getShape()+"形:"+color);;
    }
}
