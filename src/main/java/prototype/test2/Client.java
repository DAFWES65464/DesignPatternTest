package prototype.test2;

import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("prototype.txt"));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prototype.txt"));
        Citation citation1 = (Citation) ois.readObject();
        ois.close();
        citation1.getStudent().setName("李四");
        System.out.println(citation);
        System.out.println(citation1);
    }
}
