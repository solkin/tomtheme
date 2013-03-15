package tcuithemesmaker;

/**
 * Solkin Igor Viktorovich, TomClaw Software, 2003-2013
 * http://www.tomclaw.com/
 * @author Solkin
 */
public class KeyValue extends Object {

  public String key;
  public String value;

  public KeyValue( String key, String value ) {
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
