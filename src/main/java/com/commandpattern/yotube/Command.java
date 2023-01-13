package com.commandpattern.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 11:51 오전
 * \* Description:
 * \
 */

/**
 * 오직 명령에 대한 메소드만 실행한다.
 * undo method가 필요할경우 사용
 */
public interface Command {
    public void run();
}
