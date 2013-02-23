/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.tomclaw.images.Splitter;
import com.tomclaw.tcuilite.Button;
import com.tomclaw.tcuilite.Check;
import com.tomclaw.tcuilite.Field;
import com.tomclaw.tcuilite.Group;
import com.tomclaw.tcuilite.GroupChild;
import com.tomclaw.tcuilite.GroupHeader;
import com.tomclaw.tcuilite.Header;
import com.tomclaw.tcuilite.Label;
import com.tomclaw.tcuilite.List;
import com.tomclaw.tcuilite.ListItem;
import com.tomclaw.tcuilite.ListRmsRenderer;
import com.tomclaw.tcuilite.Pane;
import com.tomclaw.tcuilite.PopupItem;
import com.tomclaw.tcuilite.Radio;
import com.tomclaw.tcuilite.RadioGroup;
import com.tomclaw.tcuilite.Screen;
import com.tomclaw.tcuilite.Soft;
import com.tomclaw.tcuilite.Window;

/**
 *
 * @author Игорь
 */
public class ListFrame extends Window {

    public ListFrame(Screen screen) {
        super(screen);

        soft = new Soft(screen);
        soft.leftSoft = new PopupItem("Left");
        soft.rightSoft = new PopupItem("Back");
        soft.rightSoft.setActionPerformed(new Thread() {

            public void run() {
                // tcuithemesmaker.Logger.println("Main");
                Screen.screen.setActiveWindow(MidletMain.mainFrame);
            }
        });

        this.header = new Header("List frame");

        List list = new List(); //"list.dat"
        // list.listRmsRenderer = new ListRmsRenderer();

        list.addItem(new ListItem("To tree frame") {

            public void actionPerformed() {

                    Screen.screen.setActiveWindow(MidletMain.treeFrame);
                
            }
        });

        for (int c = 0; c < 50; c++) {
            list.addItem(new ListItem("List item " + c));
        }

        this.setGObject(list);

    }
}
