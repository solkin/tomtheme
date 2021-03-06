package com.tomclaw.tcuilite;

import javax.microedition.lcdui.Graphics;

/**
 * Solkin Igor Viktorovich, TomClaw Software, 2003-2013
 * http://www.tomclaw.com/
 * @author Solkin
 */
public abstract class PaneObject {

  private ObjectGroup objectGroup;
  private String name;
  public boolean isFocusable = true;
  public boolean isFocused = false;
  public boolean isVisible = true;
  public int x = 0, y = 0, width = 0, height = 0;

  public abstract void repaint( Graphics g );

  public void setLocation( int x, int y ) {
    this.x = x;
    this.y = y;
  }

  public void setSize( int width, int height ) {
    this.width = width;
    this.height = height;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public abstract void keyPressed( int keyCode );

  public abstract void keyReleased( int keyCode );

  public abstract void keyRepeated( int keyCode );

  public abstract void pointerPressed( int x, int y );

  public abstract void pointerReleased( int x, int y );

  public abstract void pointerDragged( int x, int y );

  public void setFocusable( boolean isFocusable ) {
    this.isFocusable = isFocusable;
  }

  public boolean getFocusable() {
    return isFocusable;
  }

  public void setFocused( boolean isFocused ) {
    this.isFocused = isFocused;
  }

  public boolean getFocused() {
    return isFocused;
  }

  public boolean getVisible() {
    return isVisible;
  }

  public void setVisible( boolean isVisible ) {
    this.isVisible = isVisible;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String getStringValue();

  public void setObjectGroup( ObjectGroup objectGroup ) {
    this.objectGroup = objectGroup;
  }

  public ObjectGroup getObjectGroup() {
    return objectGroup;
  }

  public void removeObjectGroup() {
    if ( objectGroup != null ) {
      objectGroup.removeObject( this );
      objectGroup = null;
    }
  }

  public void actionPerformed() {
  }
}
