package responsibility;

public class Client {
    public static void main(String[] args) {
        LevelRequest levelRequest = new LevelRequest("张三",5,"身体不适");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(levelRequest);
    }
}
