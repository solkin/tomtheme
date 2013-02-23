package tcuithemesmaker;

/**
 * Solkin Igor Viktorovich, TomClaw Software, 2003-2010
 * http://www.tomclaw.com/
 * @author Игорь
 */
public class ByteString {

    public byte[] byteString = new byte[]{};

    public ByteString() {
        this.byteString = new byte[]{};
    }

    public ByteString(byte[] byteString) {
        this.byteString = byteString;
    }

    public byte[] append(byte aByte) {
        byte[] subByte = new byte[byteString.length + 1];
        System.arraycopy(byteString, 0, subByte, 0, byteString.length);
        subByte[subByte.length - 1] = aByte;
        byteString = subByte;
        return byteString;
    }

    public byte[] substring(int startPos, int endPos) {
        byte[] subByte = new byte[endPos - startPos];
        System.arraycopy(byteString, startPos, subByte, 0, endPos - startPos);
        return subByte;
    }

    public byte[] append(byte[] append) {

        /*byte[] subByte = new byte[byteString.length + toAdd.length];
        System.arraycopy(byteString, 0, subByte, 0, byteString.length);
        System.arraycopy(toAdd, 0, subByte, byteString.length, toAdd.length);
        byteString = subByte;*/
        return append(append, 0, append.length);
    }

    public byte[] append(byte[] append, int offset, int length) {
        byte[] subByte = new byte[byteString.length + length];
        System.arraycopy(byteString, 0, subByte, 0, byteString.length);
        System.arraycopy(append, offset, subByte, byteString.length, length);
        byteString = subByte;
        return byteString;
    }

    public int length() {
        return byteString.length;
    }

    public String getString() {
        return new String(byteString);
    }

    public int indexOf(byte[] data) {
        for (int c = 0; c < byteString.length; c++) {
            boolean notEqualsFlag = false;
            for (int i = 0; i < data.length; i++) {
                if (byteString[c + i] != data[i]) {
                    notEqualsFlag = true;
                    break;
                }
            }
            if (!notEqualsFlag) {
                return c;
            }
        }
        return -1;
    }

    public int indexOf(char ch) {
        for (int c = 0; c < byteString.length; c++) {
            if (byteString[c] == ch) {
                return c;
            }
        }
        return -1;
    }

    public int lastIndexOf(char ch) {
        int index = -1;
        for (int c = 0; c < byteString.length; c++) {
            if (byteString[c] == ch) {
                index = c;
            }
        }
        return index;
    }

    public void clear() {
        byteString = new byte[0];
    }
}
