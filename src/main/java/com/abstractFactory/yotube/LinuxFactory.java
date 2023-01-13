package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:33 오후
 * \* Description:
 * \
 */

public class LinuxFactory extends ComponentFactory{
    @Override
    public Button createButton(String caption) {
        return new LinuxButton(caption);
    }

    @Override
    public CheckBox createCheckBox(boolean bChecked) {
        return new LinuxCheckBox(bChecked);
    }

    @Override
    public TextEdit createTextEdit(String value) {
        return new LinuxTextEdit(value);
    }
}
