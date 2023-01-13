package com.commandpattern.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 11:56 오전
 * \* Description:
 * \
 */

public class MoveCommand implements Command{
    private int x;
    private int y;

    public MoveCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.print(String.format("%c[%d;%df",0x1B,y,x));
    }
}
