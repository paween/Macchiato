package org.macchiatofw.ansi;

/**
 * @author paween
 */
public enum TextAttribute {
    NORMAL(0),
    BOLD(1),
    FAINT(2),
    ITALIC(3),
    UNDERLINE(4),
    BLINK_SLOW(5),
    BLINK_FAST(6),
    CROSSED_OUT(9),
    UNDERLINE_DOUBLE(21),
    NORMAL_INTENSITY(22),
    FRAMED(51),
    ENCIRCLED(52),
    OVERLINED(53);

    private int mAnsiCode;

    TextAttribute(int ansiCode) {
        mAnsiCode = ansiCode;
    }

    public int getAnsiCode() {
        return mAnsiCode;
    }

    @Override
    public String toString() {
        return Integer.toString(mAnsiCode);
    }
}
