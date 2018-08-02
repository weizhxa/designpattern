package Behavioral.Command;

import java.util.ArrayList;

public class Invoker {
    /**
     * 持有command引用
     */
    private Command attackCommand;
    private Command defendCommand;

    public Invoker(Command attackCommand, Command defendCommand) {
        this.attackCommand = attackCommand;
        this.defendCommand = defendCommand;
    }

    /**
     * 执行命令
     */
    public void execute(){
        attackCommand.execute();
        defendCommand.execute();
    }

    /**
     * 命令对象引用池
     */
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    /**
     * 执行所有命令
     */
    public void executeAll()
    {
        for (Command cmd : commands){
            cmd.execute();
        }
    }

    /**
     * 移除命令
     * @param command
     */
    public void removeCommand(Command command){
        commands.remove(command);
    }
}
