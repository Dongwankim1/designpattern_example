package com.abstractFactory.yotube;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 1:31 오후
 * \* Description:
 * \
 */

public class WindowsFactory extends ComponentFactory{
    @Override
    public Button createButton(String caption) {
        return new WindowsButton(caption);
    }

    @Override
    public WindowsCheckBox createCheckBox(boolean bChecked) {
        return new WindowsCheckBox(bChecked);
    }

    @Override
    public TextEdit createTextEdit(String value) {
        return new WindowsTextEdit(value);
    }
}
