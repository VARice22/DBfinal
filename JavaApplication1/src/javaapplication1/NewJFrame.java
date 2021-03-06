package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewJFrame extends javax.swing.JFrame {

    Connection con;
    public NewJFrame() {
        initComponents();
        connect();
    }

    void connect() 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javamdb","root","baccano1");
            System.out.println("Connection Established");
            String dbop="USE javamdb;";
            Statement stmt2 = con.createStatement();
            stmt2.execute(dbop);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputLabel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tablen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputupdateval = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        input.setText("metadata to insert/delete/search");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Read");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Values");

        inputLabel.setText("eg file_name, title, artist, album, tracknum, genre");
        inputLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLabelActionPerformed(evt);
            }
        });

        jLabel2.setText("labels");

        tablen.setText("vallid entries are 'song' 'album', and 'genre'");
        tablen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablenActionPerformed(evt);
            }
        });

        jLabel3.setText("Table updated");

        inputupdateval.setText("new label name, for updates only");
        inputupdateval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputupdatevalActionPerformed(evt);
            }
        });

        jLabel4.setText("new label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputupdateval)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tablen)
                                    .addComponent(input, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputLabel)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablen, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(inputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputupdateval, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed

    }//GEN-LAST:event_inputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                try {
            String name= input.getText();
            String table= tablen.getText();
            String label= inputLabel.getText();
            Statement stmt = con.createStatement();
            String dbop="INSERT INTO "+ table +" ("+ label +") VALUES('"+ name.replaceAll(", ", "', '") +"');";
            //System.out.println(dbop.replaceAll(", ", "', '"));
                //test insert
                //album
                //YES, 01 Funky Kitchen.mp3, 02 ???????????????????????????.mp3, 03 Sexy Lover.mp3
                //file_name, song1, song2, song3
            stmt.execute(dbop);
            //System.out.println("worked");
            stmt.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{            
            String table= tablen.getText();
            Statement stmt=con.createStatement();
            if(table.equals("album")){
                ResultSet rs=stmt.executeQuery("SELECT * FROM javamdb.album");
                while(rs.next()){
                    String name= rs.getString("file_name");
                    String song1= ", "+ rs.getString("song1");
                    String song2= ", "+ rs.getString("song2");
                    String song3= ", "+ rs.getString("song3");
                    String song4= ", "+ rs.getString("song4");
                    String song5= ", "+ rs.getString("song5");
                    String song6= ", "+ rs.getString("song6");
                    String song7= ", "+ rs.getString("song7");
                    String song8= ", "+ rs.getString("song8");
                    String song9= ", "+ rs.getString("song9");
                    String song10= ", "+ rs.getString("song10");
                    String song11= ", "+ rs.getString("song11");
                    System.out.println(name+song1+song2+song3+song4+song5+song6+song7+song8+song9+song10+song11);
                }
            }
            else if(table.equals("song")){
                ResultSet rs=stmt.executeQuery("SELECT * FROM javamdb.song");
                while(rs.next()){
                    String name= rs.getString("file_name");
                    String title= ", "+ rs.getString("title");
                    String artist=", "+ rs.getString("artist");
                    String album= ", "+ rs.getString("album");
                    String track= ", "+ rs.getString("tracknum");
                    String genre= ", "+ rs.getString("genre");

                    System.out.println(name+title+artist+album+track+genre);
                }
            }
            else if(table.equals("genre")){
                ResultSet rs=stmt.executeQuery("SELECT * FROM javamdb.genre");
                while(rs.next()){
                    String name= rs.getString("file_name");
                    String title= ", "+ rs.getString("gname");

                    System.out.println(name+title);
                }
            }
            else{System.out.print(table);}
            
            
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                try {
            String name= input.getText();
            String table= tablen.getText();
            String label= inputLabel.getText();
            String updateval= inputupdateval.getText();
            Statement stmt = con.createStatement();
            String dbop="update "+ table +" set "+label+"='"+updateval+"' where file_name='"+ name+ "';";
            System.out.println(dbop);
            stmt.execute(dbop);
            //System.out.println("worked");
            stmt.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String name= input.getText();
            String table= tablen.getText();
            //String label= inputLabel.getText();
            Statement stmt = con.createStatement();
            String dbop="delete from "+ table +" where file_name='"+ name +"';";
            System.out.println(dbop);
            stmt.execute(dbop);
            //System.out.println("worked");
            stmt.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void inputLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLabelActionPerformed

    private void tablenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablenActionPerformed

    private void inputupdatevalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputupdatevalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputupdatevalActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input;
    private javax.swing.JTextField inputLabel;
    private javax.swing.JTextField inputupdateval;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tablen;
    // End of variables declaration//GEN-END:variables
}
