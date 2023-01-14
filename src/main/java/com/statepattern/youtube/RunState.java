package com.statepattern.youtube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 3:11 오후
 * \* Description:
 * \
 */

public class RunState extends State{
    public RunState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.talk("뒤다가 갑작이 서면 무릎 나가..");
        player.setSpeed(0);
        player.setState(new StandUpState(player));
    }

    @Override
    public void sitDown() {
        player.talk("뛰다가 안아? ㅂㅇ");
        player.setSpeed(0);
        player.setState(new StandUpState(player));
    }

    @Override
    public void walk() {
        player.talk("속도를 줄일께요~");
        player.setSpeed(8);
        player.setState(new WalkState(player));
    }

    @Override
    public void run() {
        player.talk("더 빨리 뛰라는 이야기지?");
        player.setSpeed(player.getSpeed()+2);
    }

    @Override
    public String getDescription() {
        return "뛰는중";
    }
}
