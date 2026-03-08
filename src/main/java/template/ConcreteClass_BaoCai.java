package template;

public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    protected void pourVegetable() {
        System.out.println("放包菜");
    }

    @Override
    protected void pourSauce() {
        System.out.println("放辣椒");
    }
}
