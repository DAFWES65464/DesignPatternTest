package Signton;

import java.io.File;

public class demon4 {
    public static void main(String[] args) {
        new demon4().getpath();
    }
    public void getpath() {
        //当前获取的项目是当前的java文件所在编译后的位置
        File f = new File(this.getClass().getResource("").getPath());
        System.out.println(f);
    }
}
