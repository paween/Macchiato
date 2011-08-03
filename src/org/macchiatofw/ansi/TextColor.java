package org.macchiatofw.ansi;

/**
 * @author paween
 */
public enum TextColor {

    BLACK(30 + 0),
    RED(30 + 1),
    GREEN(30 + 2),
    YELLOW(30 + 3),
    BLUE(30 + 4),
    MAGENTA(30 + 5),
    CYAN(30 + 6),
    WHITE(30 + 7),

    BRIGHT_BLACK(90 + 0),
    BRIGHT_RED(90 + 1),
    BRIGHT_GREEN(90 + 2),
    BRIGHT_YELLOW(90 + 3),
    BRIGHT_BLUE(90 + 4),
    BRIGHT_MAGENTA(90 + 5),
    BRIGHT_CYAN(90 + 6),
    BRIGHT_WHITE(90 + 7);


    private int mAnsiCode;

    TextColor(int ansiCode) {
        mAnsiCode = ansiCode;
    }

    public int getAnsiCode() {
        return mAnsiCode;
    }

    @Override
    public String toString() {
        return Integer.toString(getAnsiCode());
    }

}
