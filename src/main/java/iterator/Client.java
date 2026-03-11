package iterator;

public class Client {
    public static void main(String[] args) {

        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三","001"));
        studentAggregate.addStudent(new Student("李四","002"));
        studentAggregate.addStudent(new Student("王五","003"));
        studentAggregate.addStudent(new Student("赵六","004"));

        StudentIterator studentIterator = studentAggregate.getStudentIterator();

        Student student = null;

        while(studentIterator.hasNext()){
            student = studentIterator.next();
            System.out.println(student);
        }
    }
}
