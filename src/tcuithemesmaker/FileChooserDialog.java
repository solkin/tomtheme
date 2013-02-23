/*
 * FileChooserDialog.java
 *
 * Created on 02.07.2011, 13:20:51
 */
package tcuithemesmaker;

import java.io.File;

/**
 *
 * @author Игорь
 */
public class FileChooserDialog extends javax.swing.JDialog {

  public static final int MODE_OPEN = 0x00;
  public static final int MODE_SAVE = 0x01;
  public static final int MODE_SCRN = 0x02;
  public int mode;
  public String defaultFileName = "";

  /** Creates new form FileChooserDialog */
  public FileChooserDialog( java.awt.Frame parent, boolean modal, int mode, String defaultFileName ) {
    super( parent, modal );
    this.defaultFileName = defaultFileName;
    this.mode = mode;
    initComponents();
    if ( defaultFileName != null ) {
      jFileChooser1.setSelectedFile( new File( defaultFileName ) );
    }
    setLocationRelativeTo( null );
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings( "unchecked" )
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jFileChooser1 = new javax.swing.JFileChooser();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Выбор файла");

    jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFileChooser1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
      if ( evt.getActionCommand().equals( "ApproveSelection" ) ) {
        if ( mode == MODE_OPEN ) {
          MainFrame.mainFrame.openTheme( jFileChooser1.getSelectedFile().getPath() );
        } else if ( mode == MODE_SAVE ) {
          MainFrame.mainFrame.saveTheme( jFileChooser1.getSelectedFile().getPath() );
        } else if ( mode == MODE_SCRN ) {
          MainFrame.mainFrame.makeScreenShot( jFileChooser1.getSelectedFile().getPath() );
        }
      }
      dispose();
    }//GEN-LAST:event_jFileChooser1ActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JFileChooser jFileChooser1;
  // End of variables declaration//GEN-END:variables
}
