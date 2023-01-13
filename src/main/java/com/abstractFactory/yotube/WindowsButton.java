package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:27 오후
 * \* Description:
 * \
 */

public class WindowsButton extends Button{
    public WindowsButton(String caption) {
        super(caption);
    }

    @Override
    void render() {
        System.out.println(
                "Windows 렌더링 "+this.caption

        );
    }
}
