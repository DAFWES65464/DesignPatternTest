package command;

import java.util.ArrayList;
import java.util.List;

public class Waitor {
    private List<Command> commands = new ArrayList<Command>();

    public void setCommands(Command command) {
        commands.add(command);
    }

    public void OrderUp(){
        for(Command command:commands){
            command.execute();
        }
    }
}
