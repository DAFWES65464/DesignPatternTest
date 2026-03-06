package prototype.test1;

public class Citation implements Cloneable{
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    @Override
    public String toString() {
        return student.getName()+"被评为三好学生";
    }
}
