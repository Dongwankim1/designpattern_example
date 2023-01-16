package com.strategypattern.youtube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/16
 * \* Time: 10:51 오전
 * \* Description:
 * \
 */

public class GaussSumStrategy implements SumStragtegy {
    @Override
    public int get(int N) {
        return (N+1)*N/2;
    }
}
