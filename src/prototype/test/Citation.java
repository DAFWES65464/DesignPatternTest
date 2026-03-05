package prototype.test;

public class Citation implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    @Override
    public String toString() {
        return name+"被评为三好学生";
    }
}
