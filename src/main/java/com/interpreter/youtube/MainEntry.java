package com.interpreter.youtube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 4:12 오후
 * \* Description:
 * \
 */

public class MainEntry {
    public static void main(String[] args) {
        String script = "BEGIN FRONT LOOP 2 BACK RIGHT END BACK END";

        Context context =new Context(script);

        while(true){
            String keyword = context.getCurrentKeyword();
            if(keyword == null) break;

            System.out.println(keyword);
            context.readNextKeyword();
        }
    }
}
