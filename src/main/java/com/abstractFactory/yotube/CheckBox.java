package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:20 오후
 * \* Description:
 * \
 */

public abstract class CheckBox {
    protected boolean bChecked;

    public CheckBox(boolean bChecked) {
        this.bChecked = bChecked;
        render();
    }


    abstract void render();
}
