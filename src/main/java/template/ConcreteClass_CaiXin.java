package template;

public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    protected void pourVegetable() {
        System.out.println("放菜心");
    }

    @Override
    protected void pourSauce() {
        System.out.println("放蒜蓉");
    }
}
