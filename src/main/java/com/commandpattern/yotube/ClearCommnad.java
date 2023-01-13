package com.commandpattern.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 11:52 오전
 * \* Description:
 * \
 */

public class ClearCommnad implements Command{

    @Override
    public void run() {
        System.out.print("\033[H\033[23");
        System.out.flush();
    }
}
