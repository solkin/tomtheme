/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.tomclaw.images.Splitter;
import com.tomclaw.tcuilite.GroupChild;
import com.tomclaw.tcuilite.GroupHeader;
import com.tomclaw.tcuilite.GroupRmsRenderer;
import com.tomclaw.tcuilite.ListItem;
import com.tomclaw.tcuilite.ListRmsRenderer;
import com.tomclaw.tcuilite.Screen;
import com.tomclaw.tcuilite.Settings;
import com.tomclaw.tcuilite.smiles.Smiles;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.microedition.midlet.*;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/**
 * @author solkin
 */
public class MidletMain extends MIDlet {

  public static Screen screen = null;
  public static TreeFrame treeFrame;
  public static MainFrame mainFrame;
  public static ListFrame listFrame = null;
  public static String chatImagesFile = "/res/groups/img_chat.png";

  public void startApp() {
    try {
      // prepareListRecordStore();
      // prepareGroupRecordStore();
      Smiles.readSmileData( true );
    } catch ( Throwable ex ) {
      Logger.getLogger( MidletMain.class.getName() ).log( Level.SEVERE, null, ex );
    }
    tcuithemesmaker.Logger.println( "images count = "
            + Splitter.splitImage( chatImagesFile ).size );
    // Settings.MENU_DRAW_DIRECTSHADOWS = false;
    // Settings.DIALOG_DRAW_ALPHABACK = false;
    // Settings.DIALOG_DRAW_SHADOWS = false;
    screen = new Screen( this );
    screen.show();
    mainFrame = new MainFrame( screen );
    treeFrame = new TreeFrame( screen );
    listFrame = new ListFrame( screen );
    /**
     * Chains
     */
    mainFrame.s_prevWindow = listFrame;
    mainFrame.s_nextWindow = treeFrame;

    /*        treeFrame.s_prevWindow = mainFrame;
     treeFrame.s_nextWindow = listFrame;

     listFrame.s_prevWindow = treeFrame;
     listFrame.s_nextWindow = mainFrame;

     mainFrame.header = new Header("Pane frame");
     */    screen.activeWindow = ( mainFrame );
  }

  public void pauseApp() {
  }

  public void destroyApp( boolean unconditional ) {
  }

  public void prepareListRecordStore() {
    try {
      RecordStore.deleteRecordStore( "list.dat" );
    } catch ( RecordStoreException ex ) {
    }
    try {
      ListRmsRenderer listRmsRenderer = new ListRmsRenderer();
      RecordStore recordStore = RecordStore.openRecordStore( "list.dat", true );
      byte[] abyte0;
      for ( int c = 0; c < 50; c++ ) {
        abyte0 = listRmsRenderer.getRmsData( new ListItem( "Строка " + c, chatImagesFile.hashCode(), c % 10 ) );
        recordStore.addRecord( abyte0, 0, abyte0.length );
      }
    } catch ( RecordStoreException ex ) {
    }
  }

  public void prepareGroupRecordStore() {
    try {
      RecordStore.deleteRecordStore( "group.dat" );
    } catch ( RecordStoreException ex ) {
    }
    try {
      GroupRmsRenderer groupRmsRenderer = new GroupRmsRenderer();
      RecordStore recordStore = RecordStore.openRecordStore( "group.dat", true );
      for ( int i = 0; i < 10; i++ ) {
        GroupHeader groupHeader = new GroupHeader( "Группа " + i );
        byte[] abyte0;
        for ( int c = 0; c < 50; c++ ) {
          GroupChild groupChild = new GroupChild( "Ребёнок " + c );
          groupChild.imageLeftIndex = new int[] { 1 };
          groupHeader.addChild( groupChild );
        }
        abyte0 = groupRmsRenderer.getRmsData( groupHeader );
        // tcuithemesmaker.Logger.println(new String(abyte0));
        recordStore.addRecord( abyte0, 0, abyte0.length );
      }
    } catch ( RecordStoreException ex ) {
    }
  }
}
