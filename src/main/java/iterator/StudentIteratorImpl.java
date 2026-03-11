package iterator;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;
    private int postiton=0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return postiton < list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(postiton);
        postiton++;
        return student;
    }
}
