package com.statepattern.youtube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 2:54 오후
 * \* Description:
 * \
 */

public class Player {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private State state = new StandUpState(this);

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void talk(String msg){
        System.out.println("플레이어의 말 :  \""+msg+"\"");
    }
}
