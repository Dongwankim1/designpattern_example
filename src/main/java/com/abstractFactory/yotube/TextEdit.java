package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:23 오후
 * \* Description:
 * \
 */

public abstract class TextEdit {
    protected String value;

    public TextEdit(String value) {
        this.value = value;
    }

    public void setValue(String value){
        this.value = value;
        redner();
    }

    public abstract void redner();


}
