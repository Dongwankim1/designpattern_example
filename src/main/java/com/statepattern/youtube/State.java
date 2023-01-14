package com.statepattern.youtube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 2:56 오후
 * \* Description:
 * \
 */

public abstract class State {
    protected Player player;

    public State(Player player){
        this.player = player;
    }

    public abstract void standUp();
    public abstract void sitDown();
    public abstract void walk();
    public abstract void run();
    public abstract String getDescription();

}
