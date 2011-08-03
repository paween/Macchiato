package org.macchiatofw.test;

import org.macchiatofw.ansi.BackgroundColor;
import org.macchiatofw.ansi.Screen;
import org.macchiatofw.ansi.TextAttribute;
import org.macchiatofw.ansi.TextColor;

/**
 * @author frank
 */
public class Driver {

    public static void main(String[] args) {
        Screen scr = new Screen();
        scr.addAttribute(TextAttribute.UNDERLINE);
        scr.addAttribute(TextAttribute.BOLD);
        scr.addAttribute(TextColor.RED);
        scr.addAttribute(TextAttribute.BLINK_SLOW);
        scr.addAttribute(BackgroundColor.BRIGHT_YELLOW);
        scr.addAttribute(TextAttribute.FRAMED);
        scr.print("Hello Underline Bold Magenta\n");

        Screen scr2 = new Screen();
        scr2.addAttribute(TextAttribute.UNDERLINE_DOUBLE);
        scr2.addAttribute(TextColor.BLUE);
        scr2.addAttribute(TextAttribute.BOLD);
        scr2.print("Double Underline Blue Faint\n");

    }

}
