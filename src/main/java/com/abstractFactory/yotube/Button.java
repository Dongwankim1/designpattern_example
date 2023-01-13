package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:18 오후
 * \* Description:
 * \
 */

public abstract class Button {
    protected String caption;

    public Button(String caption) {
        this.caption = caption;
    }

    public void clickEvent(){
        System.out.println(caption+ " 버튼을 클릭했습니다.");
    }

    abstract void render();
}
