package prototype.test2;

import java.io.Serializable;

public class Citation implements Serializable {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return student.getName()+"被评为三好学生";
    }
}
