package com.commandpattern.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 12:03 오후
 * \* Description:
 * \
 */

public class CoomandMainEntryYoutube {
    public static void main(String[] args) {
        CommandGroup cmdGroup = new CommandGroup();

        Command clearCmd = new ClearCommnad();
        cmdGroup.add(clearCmd);

        Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
        cmdGroup.add(yellowColorCmd);

    }
}
