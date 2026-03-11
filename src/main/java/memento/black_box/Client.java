package memento.black_box;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();

        gameRole.initState();
        System.out.println(gameRole);

        roleStateCaretaker.setMemento(gameRole.saveState());

        gameRole.fight();
        System.out.println(gameRole);

        gameRole.recoverMemento(roleStateCaretaker.getMemento());
        System.out.println(gameRole);
    }
}
