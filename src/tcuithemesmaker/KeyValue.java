/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcuithemesmaker;

/**
 *
 * @author i.solkin
 */
public class KeyValue extends Object {
  public String key;
  public String value;
  
  public KeyValue(String key, String value) {
    this.key=  key;
    this.value = value;
  }
  
  @Override
  public String toString() {
    return value;
  }
}
