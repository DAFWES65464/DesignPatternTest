package fltweight;

public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        AbstractBox iBox1 = factory.getBox("I");
        iBox1.display("黑色");
        AbstractBox iBox2 = factory.getBox("I");
        iBox2.display("红色");
        System.out.println(iBox1==iBox2);

    }
}
