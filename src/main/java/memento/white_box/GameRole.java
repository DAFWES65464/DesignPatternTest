package memento.white_box;

public class GameRole {
    private int vit;
    private int atk;
    private int def;

    public void initState(){
        this.vit=100;
        this.atk=100;
        this.def=100;
    }

    public void fight(){
        this.vit=0;
        this.atk=0;
        this.def=0;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(this.vit,this.def,this.def);
    }

    public void recoverState(RoleStateMemento roleStateMemento){
        this.atk=roleStateMemento.getAtk();
        this.def=roleStateMemento.getDef();
        this.vit=roleStateMemento.getVit();
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                '}';
    }
}
