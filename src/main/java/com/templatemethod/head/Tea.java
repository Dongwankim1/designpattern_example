package com.templatemethod.head;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/15
 * \* Time: 10:07 오후
 * \* Description:
 * \
 */

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
