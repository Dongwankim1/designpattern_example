package com.strategypattern.youtube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/16
 * \* Time: 10:48 오전
 * \* Description:
 * \
 */

public class SumPrinter {
    void print(SumStrategy strategy,int N){
        System.out.printf("The Sum of 1- %d :",N);
        System.out.println(strategy.get(N));
    }
}
