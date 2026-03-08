package template;

public abstract class AbstractClass {

    public void cookProcess(){
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fty();
    }

    private void pourOil(){
        System.out.println("倒油");
    }
    private void heatOil(){
        System.out.println("热油");
    }
    protected abstract void pourVegetable();
    protected abstract void pourSauce();
    private void fty(){
        System.out.println("炒菜");
    }


}
