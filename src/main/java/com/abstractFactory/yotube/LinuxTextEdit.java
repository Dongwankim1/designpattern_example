package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:30 오후
 * \* Description:
 * \
 */

public class LinuxTextEdit extends TextEdit{
    public LinuxTextEdit(String value) {
        super(value);
    }

    @Override
    public void redner() {
        System.out.println("Linux 렌더링 API"+this.value);
    }
}
