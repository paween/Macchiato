package org.macchiatofw.ansi;

/**
 * @author paween
 */
public enum BackgroundColor {
    BLACK(40 + 0),
    RED(40 + 1),
    GREEN(40 + 2),
    YELLOW(40 + 3),
    BLUE(40 + 4),
    MAGENTA(40 + 5),
    CYAN(40 + 6),
    WHITE(40 + 7),

    BRIGHT_BLACK(100 + 0),
    BRIGHT_RED(100 + 1),
    BRIGHT_GREEN(100 + 2),
    BRIGHT_YELLOW(100 + 3),
    BRIGHT_BLUE(100 + 4),
    BRIGHT_MAGENTA(100 + 5),
    BRIGHT_CYAN(100 + 6),
    BRIGHT_WHITE(100 + 7);

    private int mAnsiCode;

    BackgroundColor(int ansiCode) {
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
