package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:28 오후
 * \* Description:
 * \
 */

public class LinuxButton extends Button{

    public LinuxButton(String caption) {
        super(caption);
    }

    @Override
    void render() {
        System.out.println("Linux 렌더링 API"+this.cation);
    }
}
