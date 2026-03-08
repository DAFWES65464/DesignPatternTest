package combination;

public class MenuItem extends MenuComponent{

    public MenuItem(String name,int level){
        this.name=name;
        this.level=level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuComponent getchild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        for (int i = 0;i<level;i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
