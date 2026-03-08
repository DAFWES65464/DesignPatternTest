package combination;

public class Client {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理",2);
        menu1.add(new Menu("页面访问",3));
        menu1.add(new Menu("展开菜单",3));
        menu1.add(new Menu("编辑菜单",3));
        menu1.add(new Menu("删除菜单",3));
        menu1.add(new Menu("新增菜单",3));
        menu1.add(new MenuItem("a.txt",3));

        MenuComponent menuComponent = new Menu("系统管理",1);
        menuComponent.add(menu1);

        menuComponent.print();

    }
}
