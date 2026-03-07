package decorator;

public class Egg extends Garnish{
    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice()+this.getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
