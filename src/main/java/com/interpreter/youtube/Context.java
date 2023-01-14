package com.interpreter.youtube;

import java.util.StringTokenizer;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 4:03 오후
 * \* Description:
 * \
 */

public class Context {
    private StringTokenizer tokeninzer;
    private String currentKeyword;

    public Context(String script){
        tokeninzer = new StringTokenizer(script);
        readNextKeyword();
    }

    public String readNextKeyword(){
        if(tokeninzer.hasMoreTokens()){
            currentKeyword = tokeninzer.nextToken();
        }else{
            currentKeyword = null;
        }
        return currentKeyword;
    }

    public String getCurrentKeyword(){
        return currentKeyword;
    }
}
