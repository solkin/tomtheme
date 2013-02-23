package tcuithemesmaker;

import com.tomclaw.tcuilite.Theme;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author isolkin
 */
public class ThemeMaker {

  public static void defaultTheme( DataOutputStream dos ) throws IOException {
    writeChar( dos, 1 );
    writeUTF( dos, "Default" );
    writeUTF( dos, "TomClaw Software" );
    /** Blocks count **/
    writeChar( dos, 15 );
    /** Button **/
    int[] button = new int[] { 0xBDBABD,
      0xADAAAD,
      0xE7E3E7,
      0xD6D3D6,
      0xD6D3D6,
      0xADAEAD,
      0x424142,
      0xDEDFDE,
      0xB5B2E7,
      0xA59ECE,
      0xC6BEF7,
      0xDEDBF7,
      0xB5AAEF,
      0xA59EEF,
      0xADA6EF,
      0xBDC7FF,
      0x8C9AFF,
      0xB5AAEF,
      0xDEDBF7 };
    writeIntArray( dos, button, Theme.BLOCK_BUTTON );
    /** Chat item **/
    int[] chatItem = new int[] { 0x555555,
      0x424142,
      0xFFFFFF,
      0x7B86DA,
      0xBDC7FF,
      0x8C9AFF };
    writeIntArray( dos, chatItem, Theme.BLOCK_CHAT_ITEM );
    /** Check **/
    int[] check = new int[] { 0x555555,
      0xFFFFFF,
      0xB08BF0,
      0xD3D1FF,
      0xBDC7FF,
      0x8C9AFF };
    writeIntArray( dos, check, Theme.BLOCK_CHECK );
    /** Dialog **/
    int[] dialog = new int[] { 0xDEDFDE,
      0xFFFFFF,
      0xDC0A0A0A,
      0xFF292C29,
      0x000000,
      0x393839,
      0x80,
      0x10 };
    writeIntArray( dos, dialog, Theme.BLOCK_DIALOG );
    /** Field **/
    int[] field = new int[] { 0x555555,
      0xFFFFFF,
      0xD4C5ED,
      0xF5F5FF,
      0xBDC7FF,
      0x8C9AFF };
    writeIntArray( dos, field, Theme.BLOCK_FIELD );
    /** Gauge **/
    int[] gauge = new int[] { 0xFFF7FF,
      0xFFFEFF,
      0xBDBABD,
      0xADAAAD,
      0xE7E3E7,
      0xD6D3D6,
      0xD6D3D6,
      0xADAEAD,
      0x424142,
      0xDEDFDE,
      0xB5B2E7,
      0xA59ECE,
      0xC6BEF7,
      0xDEDBF7,
      0xB5AAEF,
      0xA59EEF,
      0xADA6EF,
      0xBDC7FF,
      0x8C9AFF };
    writeIntArray( dos, gauge, Theme.BLOCK_GAUGE );
    /** Group **/
    int[] group = new int[] { 0x555555,
      0xFFFFFF,
      0xDDDDDD,
      0xDDDDFF,
      0xBBAAEE,
      0xCCCCEE,
      0xAAAACC,
      0xFFFFFF,
      0xF7F3F7,
      0xFFFFFF,
      0xDDDDDD,
      0xAAAAAA,
      0xAAAAAA,
      0x888888,
      0xDDDDDD };
    writeIntArray( dos, group, Theme.BLOCK_GROUP );
    /** Header **/
    int[] header = new int[] { 0xDEDFDE,
      0xB5B2B5,
      0xCECFCE,
      0x9C9A9C,
      0x000000,
      0xE7E7E7 };
    writeIntArray( dos, header, Theme.BLOCK_HEADER );
    /** Label **/
    int[] label = new int[] { 0x555555,
      0xFFFFFF,
      0xB08BF0,
      0xD3D1FF,
      0xBDC7FF,
      0x8C9AFF };
    writeIntArray( dos, label, Theme.BLOCK_LABEL );
    /** List **/
    int[] list = new int[] { 0x555555,
      0xFFFFFF,
      0xDDDDDD,
      0xDDDDFF,
      0xBBAAEE,
      0xCCCCEE,
      0xAAAACC,
      0xFFFFFF,
      0xF7F3F7,
      0xFFFFFF,
      0xDDDDDD,
      0xAAAAAA,
      0xAAAAAA,
      0x888888,
      0xDDDDDD };
    writeIntArray( dos, list, Theme.BLOCK_LIST );
    /** Pane **/
    int[] pane = new int[] { 0x555555,
      0xFFFFFF,
      0xDDDDDD,
      0xDDDDFF,
      0xBBAAEE,
      0xCCCCEE,
      0xAAAACC,
      0xFFFFFF,
      0xF7F3F7,
      0xFFFFFF,
      0xDDDDDD,
      0xAAAAAA,
      0xAAAAAA,
      0x888888,
      0xDDDDDD };
    writeIntArray( dos, pane, Theme.BLOCK_PANE );
    /** Popup **/
    int[] popup = new int[] { 0xFFFFFF,
      0x000000,
      0xEFEFEF,
      0xCECFCE,
      0xDDDDFF,
      0xBBAAEE,
      0xCCCCEE,
      0xAAAACC,
      0xFFFFFF,
      0xF7F3F7,
      0xFFFFFF,
      0xDDDDDD,
      0xAAAAAA,
      0xAAAAAA,
      0x888888,
      0xDDDDDD,
      0x80,
      0x10,
      0xDC0A0A0A,
      0xFF292C29,
      0x000000,
      0x000000,
      0x393839 };
    writeIntArray( dos, popup, Theme.BLOCK_POPUP );
    /** Radio **/
    int[] radio = new int[] { 0x555555,
      0xFFFFFF,
      0xB08BF0,
      0xD3D1FF,
      0xBDC7FF,
      0x8C9AFF };
    writeIntArray( dos, radio, Theme.BLOCK_RADIO );
    /** Soft **/
    int[] soft = new int[] { 0xA575BD,
      0xEFDBFF,
      0xD69EEF,
      0x5A2C6B,
      0xFFFFFF,
      0x424542 };
    writeIntArray( dos, soft, Theme.BLOCK_SOFT );
    /** Tab **/
    int[] tab = new int[] { 0x555555,
      0xFFFFFF,
      0xDDDDDD,
      0xDDDDFF,
      0xBBAAEE,
      0xCCCCEE,
      0xAAAACC,
      0xDDDDDD,
      0xAAAAAA };
    writeIntArray( dos, tab, Theme.BLOCK_TAB );
  }

  private static void writeIntArray( DataOutputStream dos, int[] array, int type ) throws IOException {
    writeChar( dos, type );
    writeChar( dos, array.length );
    for ( int c = 0; c < array.length; c++ ) {
      dos.writeInt( array[c] );
    }
  }

  private static void writeChar( DataOutputStream dos, int data ) throws IOException {
    dos.writeChar( data );
  }

  private static void writeUTF( DataOutputStream dos, String data ) throws IOException {
    dos.writeUTF( data );
  }
}
