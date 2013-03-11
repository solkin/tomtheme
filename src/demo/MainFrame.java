package demo;

import com.tomclaw.tcuilite.Button;
import com.tomclaw.tcuilite.ChatItem;
import com.tomclaw.tcuilite.Check;
import com.tomclaw.tcuilite.Dialog;
import com.tomclaw.tcuilite.DirectDraw;
import com.tomclaw.tcuilite.Field;
import com.tomclaw.tcuilite.Gauge;
import com.tomclaw.tcuilite.Group;
import com.tomclaw.tcuilite.GroupChild;
import com.tomclaw.tcuilite.GroupHeader;
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
import com.tomclaw.tcuilite.Tab;
import com.tomclaw.tcuilite.TabEvent;
import com.tomclaw.tcuilite.TabItem;
import com.tomclaw.tcuilite.Window;
import javax.microedition.lcdui.Graphics;

/**
 *
 * @author Игорь
 */
public class MainFrame extends Window {

  public MainFrame( final Screen screen ) {
    super( screen );

    /*directDraw_afterAll = new DirectDraw() {

     public void paint(Graphics g) {
     g.setColor(0xDDDDDD);
     g.drawLine(0, 0, 100, 100);
     }
     };*/
    header = new Header( "Header" );
    soft = new Soft( screen );
    soft.leftSoft = new PopupItem( "Left" );
    soft.rightSoft = new PopupItem( "Right" );
    /**
     * Soft submenus
     */
    soft.leftSoft.addSubItem( new PopupItem( "Sub1" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub2" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub3" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub1" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub2" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub3" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub1" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub2" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub3" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub1" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub2" ) );
    soft.leftSoft.addSubItem( new PopupItem( "Sub3" ) );
    PopupItem popupItem = new PopupItem( "Sub_with Sub1" );
    popupItem.addSubItem( new PopupItem( "SubSub3" ) );
    popupItem.addSubItem( new PopupItem( "SubSub3" ) );
    popupItem.addSubItem( new PopupItem( "SubSub3" ) );
    PopupItem popupItem1 = new PopupItem( "Sub_Sub_with Sub1" );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );

    PopupItem popupItem2 = new PopupItem( "Sub_with Sub2" );
    popupItem2.addSubItem( new PopupItem( "SubSub3" ) );
    popupItem2.addSubItem( new PopupItem( "SubSub3" ) );
    popupItem2.addSubItem( new PopupItem( "SubSub3" ) );
    popupItem1.addSubItem( popupItem2 );

    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem1.addSubItem( new PopupItem( "SubSub4" ) );
    popupItem.addSubItem( popupItem1 );

    popupItem.addSubItem( new PopupItem( "SubSub3" ) );
    popupItem.addSubItem( new PopupItem( "SubSub3" ) );
    soft.leftSoft.addSubItem( popupItem );
    /*
     soft.leftSoft.addSubItem(new PopupItem("Sub2"));
     soft.leftSoft.addSubItem(new PopupItem("Sub3"));
     soft.leftSoft.addSubItem(new PopupItem("Sub1"));
     soft.leftSoft.addSubItem(new PopupItem("Sub2"));
     soft.leftSoft.addSubItem(new PopupItem("Sub3"));
     soft.leftSoft.addSubItem(new PopupItem("Sub1"));
     soft.leftSoft.addSubItem(new PopupItem("Sub2"));
     soft.leftSoft.addSubItem(new PopupItem("Sub3"));*/
    /**
     * Soft submenus
     */
    /*PopupItem treePopupItem = new PopupItem("Tree frame");
     treePopupItem.setActionPerformed(
     new Thread() {

     public void run() {
     Screen.screen.setActiveWindow(MidletMain.treeFrame);
     }
     });
     soft.rightSoft.addSubItem(treePopupItem);
     PopupItem listPopupItem = new PopupItem("List frame");
     listPopupItem.setActionPerformed(
     new Thread() {

     public void run() {
     Screen.screen.setActiveWindow(MidletMain.listFrame);
     }
     });
     soft.rightSoft.addSubItem(listPopupItem);
     soft.rightSoft.addSubItem(new PopupItem("Sub2"));
     soft.rightSoft.addSubItem(new PopupItem("Sub3"));
     soft.rightSoft.addSubItem(new PopupItem("Sub1"));
     PopupItem popupItem4 = new PopupItem("Subber");
     PopupItem popupItem3 = new PopupItem("Sub_with Sub1");
     popupItem3.addSubItem(new PopupItem("SubSub3"));
     popupItem3.addSubItem(new PopupItem("SubSub3"));
     popupItem3.addSubItem(new PopupItem("SubSub3"));
     popupItem4.addSubItem(popupItem3);
     soft.rightSoft.addSubItem(popupItem4);

     this.soft = soft;*/

    /*Pane pane = new Pane();
     pane.items.addElement(new Label("Label string1"));
     pane.items.addElement(new Label("Label string2"));
     Gauge gauge = new Gauge("Gauge");
     gauge.setFocusable(true);
     pane.items.addElement(gauge);
     Field field = new Field("TextField");
     field.setFocusable(true);
     field.setTitle("Title");
     field.setMaxSize(2048);
     field.setConstraints(javax.microedition.lcdui.TextField.ANY);
     pane.items.addElement(field);
     pane.items.addElement(new Label("Label string3"));
     Button button0 = new Button("Button 0");
     button0.setFocusable(true);
     button0.setActionPerformed(new Thread() {

     public void run() {
     Dialog dialog = new Dialog("Title",
     "Ушат Помоев, Улов Налимов, Букет Левкоев, Рекорд Надоев, Отряд Ковбоев, Подрыв Устоев, Погром Евреев, Поджог Сараев, Захват Покоев, Исход Изгоев, Побег Злодеев, Обвал Забоев, Угон Харлеев, Удел Плебеев, Камаз Отходов, Ушат Помоев, Улов Налимов, Букет Левкоев, Рекорд Надоев, Отряд Ковбоев, Подрыв Устоев, Погром Евреев, Поджог Сараев, Захват Покоев, Исход Изгоев, Побег Злодеев, Обвал Забоев, Угон Харлеев, Удел Плебеев, Камаз Отходов, Погром Евреев, Поджог Сараев, Захват Покоев, Исход Изгоев, Побег Злодеев, Обвал Забоев, Угон Харлеев, Удел Плебеев, Камаз Отходов, Ушат Помоев, Улов Налимов, Букет Левкоев, Рекорд Надоев, Отряд Ковбоев, Подрыв Устоев, Погром Евреев, Поджог Сараев, Захват Покоев, Исход Изгоев, Побег Злодеев, Обвал Забоев, Угон Харлеев, Удел Плебеев, Камаз Отходов",
     MainFrame.this.screen.getWidth(), MainFrame.this.screen.getHeight());
     dialog.leftButton = new Button("Button");
     MainFrame.this.showDialog(dialog);
     new Thread() {

     public void run() {
     try {
     Thread.sleep(7000);
     } catch (InterruptedException ex) {
     ex.printStackTrace();
     }
     MainFrame.this.closeDialog();
     Screen.screen.repaint();
     }
     }.start();

     }
     });
     pane.items.addElement(button0);
     final Label label0 = new Label("1");
     label0.isTitle = true;
     label0.setFocusable(true);
     label0.setFocused(true);
     pane.items.addElement(label0);
     Button button1 = new Button("Increment label");
     button1.setFocusable(true);
     button1.setActionPerformed(new Thread() {

     public void run() {
     label0.setCaption(String.valueOf(Integer.parseInt(label0.caption) + 1));
     }
     });
     pane.items.addElement(button1);
     Button button2 = new Button("Button");
     button2.setFocusable(true);
     pane.items.addElement(button2);
     Label label5 = new Label("Focusable");
     label5.setFocusable(true);
     label5.setFocused(true);
     RadioGroup radioGroup = new RadioGroup();
     Radio radio1 = new Radio("Radio 1", true);
     radio1.setFocusable(true);
     radioGroup.addRadio(radio1);
     pane.items.addElement(radio1);
     Radio radio2 = new Radio("Radio 2 Radio 2 Radio 2 Radio 2 Radio 2 Radio 2 Radio 2", false);
     radio2.setFocusable(true);
     radioGroup.addRadio(radio2);
     pane.items.addElement(radio2);
     Check check = new Check("Самый полный список чеченских террористов", false);
     check.setFocusable(true);
     pane.items.addElement(check);
     pane.items.addElement(new Label("Салман Радуев, Шамиль Басаев, Руслан Гилаев"));
     pane.items.addElement(new Label("Ушат Помоев, Улов Налимов, Букет Левкоев, Рекорд Надоев, Отряд Ковбоев, Подрыв Устоев, Погром Евреев, Поджог Сараев, Захват Покоев, Исход Изгоев, Побег Злодеев, Обвал Забоев, Угон Харлеев, Удел Плебеев, Камаз Отходов, Развод Супругов, Забег Дебилов, Парад Уродов, Улов Кальмаров, Рулон Обоев, Черёд Застоев, Квартет Гобоев, Подшум Прибоев, Побег Злодеев и Подсуд Злодеев, Загул Старлеев"));
     pane.items.addElement(new Label("Друган Братанов, Учёт Расходов, Налог Сдоходов, Разбор Полётов, Мешок Лимонов, Обед Лемуров, Карман Пистонов, Разгул Гормонов, Прыжок Гиббонов, Рожок Патронов, Разрез Батонов, Обвал Забоев, Полёт Фазанов, Косяк Пингвинов, Расстрел Арабов, Запой Гусаров"));
     pane.items.addElement(new Label("Сачок Моллюсков, Поход Гераклов, Барак Монголов, Загон Баранов, Пропой Погонов, Отряд Маньяков, Тридня Запоев, Облом Пиндосов"));
     pane.items.addElement(new Label("Курган Отбросов, Полно Засосов, Удар Морозов"));
     pane.items.addElement(new Label("И примкнувшие к ним абхаз Партучёба и японские активистки Атомули Ядалато, Ебида Пота, Токосо Томимо, Ясука Такая, Яско Тина и др."));
     pane.items.addElement(new Label("Label string5"));
     pane.items.addElement(new Label("Label string6"));
     pane.items.addElement(new Label("Label string7"));
     pane.items.addElement(new Label("Label string8"));
     Label label1 = new Label("Focusable");
     label1.setFocusable(true);
     pane.items.addElement(label1);
     Label label2 = new Label("Focusable");
     label2.setFocusable(true);
     pane.items.addElement(label2);
     pane.items.addElement(new Label("Label string9"));
     pane.items.addElement(new Label("Label string10"));
     pane.items.addElement(new Label("Label string11"));
     pane.items.addElement(new Label("Label string12"));
     pane.items.addElement(new Label("Label string13"));
     pane.items.addElement(new Label("Label string14"));
     pane.items.addElement(new Label("Label string15"));
     pane.items.addElement(new Label("Label string16"));
     pane.items.addElement(new Label("Label string17"));
     pane.items.addElement(new Label("Label string18"));
     pane.items.addElement(new Label("Label string19"));
        
     setGObject(pane);*/
    final RadioGroup radioGroup = new RadioGroup();
    final Tab tab = new Tab( screen );
    TabItem tabItem1 = new TabItem( "Pane", 0, -1 );
    TabItem tabItem2 = new TabItem( "List", 0, -1 );
    TabItem tabItem3 = new TabItem( "Group", 0, -1 );
    TabItem tabItem4 = new TabItem( "Chat", 0, -1 );
    Label tabLabel = new Label("Tab label header");
    tabLabel.setHeader(true);
    tabItem4.tabLabel = tabLabel;

    tab.addTabItem( tabItem1 );
    tab.addTabItem( tabItem2 );
    tab.addTabItem( tabItem3 );
    tab.addTabItem(tabItem4);

    final Pane pane = new Pane( null, false );
    pane.setTouchOrientation( false );

    Check check = new Check( "Check", true );
    check.setFocusable( true );
    pane.addItem( check );
    Field field = new Field( "Field" );
    field.setFocusable( true );
    pane.addItem( field );
    Button button = new Button( "Button" ) {

      @Override
      public void actionPerformed() {
        switch ( radioGroup.getCombed() ) {
          case 0x00: {
            MainFrame.this.showDialog( new Dialog( Screen.screen, null, "Title", "Message" ) );
            break;
          }
          case 0x01: {
            screen.setActiveWindow( s_prevWindow );
            break;
          }
          case 0x02: {
            screen.setActiveWindow( s_nextWindow );
            break;
          }
        }
      }
    };
    button.setFocusable( true );
    pane.addItem( button );
    Label plainLabel = new Label( "Plain label" );
    plainLabel.setFocusable( true );
    pane.addItem( plainLabel );
    Label titleLabel = new Label( "Title label" );
    titleLabel.setFocusable( true );
    titleLabel.setTitle(true);
    pane.addItem( titleLabel );

    for ( int c = 0; c < 4; c++ ) {
      Radio radio = new Radio( "Radio " + c, false );
      radio.setFocusable( true );
      radioGroup.addRadio( radio );
      pane.addItem( radio );
    }
    radioGroup.setCombed( 1 );

    Gauge gauge = new Gauge( "Gauge" );
    gauge.setFocusable( true );
    gauge.setValue( 50 );
    pane.addItem( gauge );

    /*ChatItem chatItem0 = new ChatItem(chatPane, "362540754", "Solkin", "15.12 23:09", ChatItem.TYPE_PLAIN_MSG, "Message Text Here but not only text message, may be and images :) be able to view *NCH*here.");
     chatPane.addItem(chatItem0);
     chatItem0.setFocused(true);*/
    //String[] smiles = new String[]{"O:-)", ":-D", "*ROFL*", ":-(", ":-)", "=-O", ";-)", "*YAHOO*", "%)", ":-*", "*KISSING*"};
        /*for (int c = 10; c < 24; c++) {
     ChatItem chatItem = new ChatItem(chatPane, "362540754", "Solkin", "15.12 23:" + c, ChatItem.TYPE_PLAIN_MSG, "Message TextO:-) Here but not only text " + (c == 15 ? "*BIGGRIN*" : "") + " message, may be and images *KISSED* be able to view " + (c == 15 ? "*MUSIC*" : "") + "here. ");
     chatPane.addItem(chatItem);
     if (c == 10) {
     chatItem.setFocused(true);
     }
     }*/
    tab.setGObject( pane );

    final List list = new List();
    for ( int c = 0; c < 10; c++ ) {
      list.addItem( new ListItem( "List item " + c ) );
    }

    final Group group = new Group();
    for ( int g = 0; g < 3; g++ ) {
      GroupHeader groupHeader = new GroupHeader( "GroupHeader " + g );
      group.addHeader( groupHeader );
      for ( int c = 0; c < 10; c++ ) {
        groupHeader.addChild( new GroupChild( "GroupChild " + c ) );
      }
    }

    final Pane chat = new Pane( this, true );
    pane.setTouchOrientation( false );

    for ( int c = 0; c < 24; c++ ) {
      ChatItem chatItem = new ChatItem( chat, "362540754", "Solkin", "15.12 23:" + c, ChatItem.TYPE_PLAIN_MSG, "[p][br/][br/][br/]Message Text.[/p]" );
      chat.addItem( chatItem );
      if ( c == 0 ) {
        chatItem.setFocused( true );
      }
    }

    tab.tabEvent = new TabEvent() {

      public void stateChanged( int previousIndex, int selectedIndex, int tabsCount ) {
        switch ( selectedIndex ) {
          case 0x00: {
            tab.setGObject( pane );
            break;
          }
          case 0x01: {
            tab.setGObject( list );
            break;
          }
          case 0x02: {
            tab.setGObject( group );
            break;
          }
          case 0x03: {
            tab.setGObject( chat );
            break;
          }
        }
      }
    };
    setGObject( tab );
  }
}
