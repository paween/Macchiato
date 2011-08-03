package org.macchiatofw.ansi;

/**
 * @author paween
 */
public class Cursor {

    /*package*/ static final String e = "\u001B";    

    public static void moveUp(int n) {
        System.out.print(e + "[" + n + "A");
    }

    public static void moveDown(int n) {
        System.out.print(e + "[" + n + "B");
    }

    public static void moveForward(int n) {
        System.out.print(e + "[" + n + "C");
    }

    public static void moveBackward(int n) {
         System.out.print(e + "[" + n + "D");
    }

    public static void moveNextLine(int n) {
         System.out.print(e + "[" + n + "E");
    }

    public static void movePreviousLine(int n) {
         System.out.print(e + "[" + n + "F");
    }

    public static void moveToHorizontalAbsolute(int n) {
        System.out.print(e + "[" + n + "G");
    }

    public static void moveTo(int n, int m) {
        System.out.print(e + "[" + n + ";" + m + "H");
    }

    public static void clearScreenFromCursorToEnd() {
        System.out.print(e + "[0J");
    }

    public static void clearScreenFromCursorToBeginning() {
        System.out.print(e + "[1J");
    }

    public static void clearScreen() {
        System.out.print(e + "[2J");
    }

    public static void clearScreenAndMoveCursorToLeftTop() {
        clearScreen();
        moveTo(1, 1);
    }

    public static void eraseLineFromCursorToEnd() {
        System.out.print(e + "[0K");
    }

    public static void eraseLineFromCursorToBeginning() {
        System.out.print(e + "[1K");
    }

    public static void eraseLine() {
        System.out.print(e + "[2K");
    }

    public static void scrollUp(int n) {
        System.out.print(e + "[" + n + "S");
    }

    public static void scrollDown(int n) {
        System.out.print(e + "[" + n + "T");
    }

    public static void saveCursorPosition() {
        System.out.print(e + "[s");
    }

    public static void restoreCursorPosition() {
        System.out.print(e + "[u");
    }    
}
