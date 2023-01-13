package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:22 오후
 * \* Description:
 * \
 */

public class MainEntry {
    public static void main(String[] args) {
        ComponentFactory factory = new WindowsFactory();

        Button button = factory.createButton("확인");
        CheckBox checkBox = factory.createCheckBox(false);
        TextEdit textEdit = factory.createTextEdit("디자인패턴");

    }
}
