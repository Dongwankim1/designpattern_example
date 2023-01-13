package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:28 오후
 * \* Description:
 * \
 */

public class WindowsCheckBox extends CheckBox{
    public WindowsCheckBox(boolean bChecked) {
        super(bChecked);
    }

    @Override
    void render() {
            System.out.println("windws checkbox"+this.bChecked);
    }
}
