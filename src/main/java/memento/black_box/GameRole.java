package memento.black_box;

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

    public Memento saveState(){
        return new RoleStateMemento(this.vit,this.def,this.def);
    }

    public void recoverMemento(Memento memento){
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.atk=roleStateMemento.getAtk();
        this.def=roleStateMemento.getDef();
        this.vit=roleStateMemento.getVit();
    }

    private class RoleStateMemento implements Memento{
        private int vit;
        private int atk;
        private int def;

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public int getVit() {
            return vit;
        }

        public void setVit(int vit) {
            this.vit = vit;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }
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
