/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.tomclaw.tcuilite.Button;
import com.tomclaw.tcuilite.Check;
import com.tomclaw.tcuilite.Field;
import com.tomclaw.tcuilite.Group;
import com.tomclaw.tcuilite.GroupChild;
import com.tomclaw.tcuilite.GroupHeader;
import com.tomclaw.tcuilite.GroupRmsRenderer;
import com.tomclaw.tcuilite.Header;
import com.tomclaw.tcuilite.Label;
import com.tomclaw.tcuilite.List;
import com.tomclaw.tcuilite.ListItem;
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
public class TreeFrame extends Window {

    public TreeFrame(Screen screen) {
        super(screen);

        soft = new Soft(screen);
        soft.leftSoft = new PopupItem("Left");
        soft.rightSoft = new PopupItem("Back");
        soft.rightSoft.setActionPerformed(new Thread() {

            public void run() {
                tcuithemesmaker.Logger.println("Main");
                Screen.screen.setActiveWindow(MidletMain.mainFrame);
            }
        });

        this.header = new Header("Tree frame");

        Group group = new Group(); //"group.dat"
        //group.imageLeftFileHash = new int[]{MidletMain.chatImagesFile.hashCode()};
        //group.groupRmsRenderer = new GroupRmsRenderer();
        GroupHeader groupHeader1 = new GroupHeader("Header1");
        groupHeader1.isCollapsed = false;
        groupHeader1.addChild(new GroupChild("Child1"));
        groupHeader1.addChild(new GroupChild("Child2"));
        groupHeader1.addChild(new GroupChild("To list frame") {

            public void actionPerformed() {
                Screen.screen.setActiveWindow(MidletMain.listFrame);
            }
        });
        groupHeader1.addChild(new GroupChild("Child4"));
        groupHeader1.addChild(new GroupChild("Child5"));
        groupHeader1.addChild(new GroupChild("Child6"));
        groupHeader1.addChild(new GroupChild("Child7"));
        GroupHeader groupHeader2 = new GroupHeader("Header2");
        groupHeader2.isCollapsed = true;
        groupHeader2.addChild(new GroupChild("Child1"));
        groupHeader2.addChild(new GroupChild("Child2"));
        groupHeader2.addChild(new GroupChild("Child3"));
        groupHeader2.addChild(new GroupChild("Child4"));
        GroupHeader groupHeader3 = new GroupHeader("Header3");
        GroupHeader groupHeader4 = new GroupHeader("Header4");
        groupHeader4.addChild(new GroupChild("Child1"));
        groupHeader4.addChild(new GroupChild("Child2"));
        groupHeader4.addChild(new GroupChild("Child3"));
        groupHeader4.addChild(new GroupChild("Child4"));
        groupHeader4.addChild(new GroupChild("Child5"));
        GroupHeader groupHeader5 = new GroupHeader("Header5");
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));
        groupHeader5.addChild(new GroupChild("ChildUncounted"));

        group.addHeader(groupHeader1);
        group.addHeader(groupHeader2);
        group.addHeader(groupHeader3);
        group.addHeader(groupHeader4);
        group.addHeader(groupHeader5);

        this.setGObject(group);

    }
}
