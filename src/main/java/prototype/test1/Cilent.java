package prototype.test1;

public class Cilent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);
        Citation citation1 = citation.clone();
        citation1.getStudent().setName("李四");
        System.out.println(citation);
        System.out.println(citation1);
        System.out.println(citation==citation1);
    }
}
