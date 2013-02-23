package javax.microedition.lcdui;

import java.util.Hashtable;

public final class Font {

    public static final int STYLE_PLAIN = 0;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_UNDERLINED = 4;
    public static final int SIZE_SMALL = 8;
    public static final int SIZE_MEDIUM = 0;
    public static final int SIZE_LARGE = 16;
    public static final int FACE_SYSTEM = 0;
    public static final int FACE_MONOSPACE = 32;
    public static final int FACE_PROPORTIONAL = 64;
    public static final int FONT_STATIC_TEXT = 0;
    public static final int FONT_INPUT_TEXT = 1;
    private int face;
    private int style;
    private int size;
    private int baseline;
    private int height;
    private static final Font DEFAULT_FONT = new Font(FACE_PROPORTIONAL, STYLE_PLAIN, SIZE_MEDIUM);
    private static Hashtable table;
    private java.awt.Font font;
    java.awt.image.BufferedImage bi = new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR);
    java.awt.Graphics g = bi.getGraphics();

    public static Font getFont(int fontSpecifier) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return null;
    }

    private Font(int face, int style, int size) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        font = new java.awt.Font("Dialog", style, size);
    }

    public static Font getDefaultFont() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return DEFAULT_FONT;
    }

    public static Font getFont(int face, int style, int size) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return new Font(face, style, size);
    }

    public int getStyle() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return style;
    }

    public int getSize() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return size;
    }

    public int getFace() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return face;
    }

    public boolean isPlain() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return true;
    }

    public boolean isBold() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return font.isBold();
    }

    public boolean isItalic() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return false;
    }

    public boolean isUnderlined() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return font.isItalic();
    }

    public int getHeight() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return g.getFontMetrics(font).getHeight()*3/2;
    }

    public int getBaselinePosition() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return g.getFontMetrics(font).getAscent()*3/2;
    }

    public int charWidth(char ch) {
        return g.getFontMetrics(font).charWidth(ch);
    }

    public int charsWidth(char[] ch, int offset, int length) {
        return g.getFontMetrics(font).charsWidth(ch, offset, length);
    }

    public int stringWidth(String str) {
        return g.getFontMetrics(font).stringWidth(str)*3/2;
    }

    public int substringWidth(String str, int offset, int len) {
        return stringWidth(str.substring(offset, offset + len));
    }

    private void init(int arg0, int arg1, int arg2) {
    }
}
