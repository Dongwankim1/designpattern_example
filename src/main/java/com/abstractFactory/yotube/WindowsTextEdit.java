package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:30 오후
 * \* Description:
 * \
 */

public class WindowsTextEdit extends TextEdit{
    public WindowsTextEdit(String value) {
        super(value);
    }

    @Override
    public void redner() {
        System.out.println("windows 렌더링 API"+this.value);
    }
}
