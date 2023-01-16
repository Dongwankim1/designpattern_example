package com.strategypattern.youtube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/16
 * \* Time: 10:50 오전
 * \* Description:
 * \
 */

public class SimpleSumStrategy implements SumStragtegy {
    @Override
    public int get(int N) {
        int sum = N;

        for(long i=1;i<N;i++){
            sum +=i;
        }

        return sum;
    }
}
