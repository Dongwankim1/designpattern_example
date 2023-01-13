package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:29 오후
 * \* Description:
 * \
 */

public class LinuxCheckBox extends CheckBox{
    public LinuxCheckBox(boolean bChecked) {
        super(bChecked);
    }

    @Override
    void render() {
        System.out.println("Linux api checkbox"+this.bChecked);
    }
}
