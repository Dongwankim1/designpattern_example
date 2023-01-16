package com.templatemethod.head;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/15
 * \* Time: 10:14 오후
 * \* Description:
 * \
 */

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("물 끓이는 중");
    }
    void pourInCup(){
        System.out.println("컵에 따르는 중");
    }


}
