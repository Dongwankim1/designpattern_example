package com.statepattern.youtube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 3:08 오후
 * \* Description:
 * \
 */

public class WalkState extends State{
    public WalkState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.setSpeed(0);
        player.talk("멈춰 ...");
        player.setState(new StandUpState(player));
    }

    @Override
    public void sitDown() {
        player.setSpeed(0);
        player.talk("걷가 앉으면 넘어질수 이써요.");
        player.setState(new SitDownState(player));
    }

    @Override
    public void walk() {
        player.talk("난 걷는걸 좋아하자ㅣ...");
    }

    @Override
    public void run() {
        player.setSpeed(20);
        player.talk("걷다가 뒤면 열라 빨뤼뛰지");
        player.setState(new RunState(player));
    }

    @Override
    public String getDescription() {
        return "걷는중";
    }
}
