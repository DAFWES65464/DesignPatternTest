package combination;

public abstract class MenuComponent {
    protected String name;
    protected int level;

    public abstract void add(MenuComponent menuComponent);
    public abstract void remove(MenuComponent menuComponent);
    public abstract MenuComponent getchild(int index);
    public abstract void print();
    public String getName(){
        return name;
    }

}
