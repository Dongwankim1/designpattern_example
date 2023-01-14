package com.statepattern.youtube;

import java.util.Scanner;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 3:14 오후
 * \* Description:
 * \
 */

public class MainEntry {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        while(true){

            String input = scanner.next();
            if(input.equals("1")){
                player.getState().standUp();
            }else if(true){

            }else if(true){

            }else if(true){

            }
        }
    }
}
