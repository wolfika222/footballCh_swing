
package platform;

import connection.ConnectionConfiguration;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class FootballApp extends javax.swing.JFrame {

  private final int WIDTH = 750;
  private final int HEIGHT = 470;
  private final String TITLE = "Foci VB";
  private FootballPanel footballPanel;
  private Connection connection = null;
  private Statement statement = null;
  
    public FootballApp() {
          initComponents();
          connectDatabase();
          this.setSize(WIDTH, HEIGHT);
          this.setTitle(TITLE);
          this.setLocationRelativeTo(this);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        footballPanel1 = new platform.FootballPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(footballPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FootballApp().start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private platform.FootballPanel footballPanel1;
    // End of variables declaration//GEN-END:variables

    private void connectDatabase(){
      try {
          connection = ConnectionConfiguration.getConnection();
          statement = connection.createStatement();
          this.addWindowListener(new WindowAdapter(){
              @Override
              public void windowClosing(WindowEvent e) {
                  try {
                      connection.close(); //To change body of generated methods, choose Tools | Templates.
                  } catch (SQLException ex) {
                      Logger.getLogger(FootballApp.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          });
      } catch (SQLException ex) {
          Logger.getLogger(FootballApp.class.getName()).log(Level.SEVERE, null, ex);
      }
       
   }
    private void start(){ 
        
        this.setVisible(true);
    }
}
