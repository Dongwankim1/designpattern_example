package com.templatemethod.head;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/15
 * \* Time: 10:04 오후
 * \* Description:
 * \
 */

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}
