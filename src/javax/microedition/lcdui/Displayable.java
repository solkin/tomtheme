package javax.microedition.lcdui;

import java.util.Timer;
import java.util.TimerTask;
// import javax.microedition.lcdui.Displayable.TickerPainter;

public abstract class Displayable {

    private class TickerPainter extends TimerTask {

        private TickerPainter() {
            //compiled code
            tcuithemesmaker.Logger.println("Compiled Code");
        }

        public final void run() {
            //compiled code
            tcuithemesmaker.Logger.println("Compiled Code");
        }
    }
    Display currentDisplay;
    Command[] commands;
    int numCommands;
    CommandListener listener;
    static final int X = 0;
    static final int Y = 1;
    static final int WIDTH = 2;
    static final int HEIGHT = 3;
    int[] viewport;
    boolean fullScreenMode;
    boolean sizeChangeOccurred;
    Displayable paintDelegate;
    private static final Font TITLE_FONT = null;
    static final int TITLE_HEIGHT=0;
    private String title;
    // private Ticker ticker;
    private static final Timer tickerTimer=null;
    private TickerPainter tickerPainter;
    private int tickerHeight;
    private int totalHeight;
    private int vScrollPosition;
    private int vScrollProportion;
    public static int width, height;

    Displayable() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    public String getTitle() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return "";
    }

    public void setTitle(String s) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    /*public Ticker getTicker() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    public void setTicker(Ticker ticker) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }*/

    public boolean isShown() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return false;
    }

    public void addCommand(Command cmd) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    public void removeCommand(Command cmd) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    public void setCommandListener(CommandListener l) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    public int getWidth() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return width;
    }

    public int getHeight() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return height;
    }

    protected void sizeChanged(int w, int h) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void commitPendingInteraction() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void invalidate(Item src) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callInvalidate(Item src) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void itemStateChanged(Item src) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callItemStateChanged(Item src) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    /*void setTickerImpl(Ticker t) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }*/

    void setTitleImpl(String s) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callSizeChanged(int w, int h) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callPaint(Graphics g, Object target) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void paintTicker(Graphics g) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void paintTitle(Graphics g) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void layout() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void fullScreenMode(boolean onOff) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    private void setupViewport() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    private void translateViewport() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callKeyPressed(int keyCode) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callKeyRepeated(int keyCode) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callKeyReleased(int keyCode) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callKeyTyped(char c) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callPointerPressed(int x, int y) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callPointerDragged(int x, int y) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callPointerReleased(int x, int y) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    final void callRepaint(int x, int y, int width, int height, Object target) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    public void callRepaint() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    final void repaintContents() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void setVerticalScroll(int scrollPosition, int scrollProportion) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    int getVerticalScrollPosition() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return 0;
    }

    int getVerticalScrollProportion() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return 0;
    }

    void callShowNotify(Display d) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void callHideNotify(Display d) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    Command[] getCommands() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return null;
    }

    int getCommandCount() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return 0;
    }

    Item getCurrentItem() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
            return null;
    }

    CommandListener getCommandListener() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
            return null;
    }

    void addCommandImpl(Command cmd) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void removeCommandImpl(Command cmd) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    void updateCommandSet() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    boolean commandInSetImpl(Command command) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return false;
    }

    private void repaintTitle() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    private void startTicker() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    private void stopTicker() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    private void repaintTickerText() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    private boolean sizeChangeImpl() {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
        return false;
    }

    protected void keyPressed(int keyCode) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    protected void keyRepeated(int keyCode) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    protected void keyReleased(int keyCode) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    protected void pointerPressed(int x, int y) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    protected void pointerReleased(int x, int y) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    protected void pointerDragged(int x, int y) {
        //compiled code
        tcuithemesmaker.Logger.println("Compiled Code");
    }

    native void grabFullScreen(boolean arg0);
}
