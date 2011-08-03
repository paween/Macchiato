package org.macchiatofw.ansi;

import java.io.Console;
import java.util.ArrayList;

/**
 * @author paween
 */
public class Screen {

    private Console mConsole;
    private ArrayList<Enum> mAttributes;

    public Screen() {
        mConsole = System.console();
        mAttributes = new ArrayList<Enum>();
    }

    public void addAttribute(TextAttribute attribute) {
        mAttributes.add(attribute);
    }

    public void addAttribute(TextColor attribute) {
        mAttributes.add(attribute);
    }

    public void addAttribute(BackgroundColor attribute) {
        mAttributes.add(attribute);
    }

    public void clearAttributes() {
        mAttributes.clear();
    }

    public void print(String format, Object... args) {
        applyAttributes();
        mConsole.printf(format, args);
        restoreDefault();
    }

    private void applyAttributes() {
        StringBuffer ansiString = new StringBuffer(Cursor.e + "[");

        for (int i = 0; i < mAttributes.size(); i++) {
            if (i != 0) {
                ansiString.append(";");
            }
            Enum attr = mAttributes.get(i);
            if (attr instanceof TextAttribute) {
                ansiString.append(((TextAttribute) attr).getAnsiCode());
            } else if (attr instanceof TextColor) {
                ansiString.append(((TextColor) attr).getAnsiCode());
            } else if (attr instanceof BackgroundColor) {
                ansiString.append(((BackgroundColor) attr).getAnsiCode());
            }

        }
        ansiString.append("m");
        System.out.print(ansiString);
    }

    private void restoreDefault() {
        System.out.print(Cursor.e + "[0m");
    }

}
