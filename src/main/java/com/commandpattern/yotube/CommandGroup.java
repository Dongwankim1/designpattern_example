package com.commandpattern.yotube;

import java.util.ArrayList;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 12:02 오후
 * \* Description:
 * \
 */

public class CommandGroup implements Command {
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void add(Command command){
        commands.add(command);
    }

    @Override
    public void run() {
        int cntCommands = commands.size();
        for(int i=0;i<cntCommands;i++){
            Command command = commands.get(i);
            command.run();
        }
    }
}
