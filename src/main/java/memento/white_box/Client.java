package memento.white_box;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();

        gameRole.initState();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());
        System.out.println(gameRole);

        gameRole.fight();
        System.out.println(gameRole);

        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        System.out.println(gameRole);
    }
}
