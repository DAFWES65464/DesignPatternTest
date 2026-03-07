package decorator;

public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(fastFood,2, "培根");
    }

    @Override
    public float cost() {
        return getPrice()+this.getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return getDesc()+getFastFood().getDesc();
    }
}
