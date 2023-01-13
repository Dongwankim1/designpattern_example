package com.commandpattern.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 11:53 오전
 * \* Description:
 * \
 */

public class PrintCommand implements Command{
    private String content;
    public PrintCommand(String content){
        this.content = content;
    }
    @Override
    public void run() {
        System.out.print(content);
    }
}
