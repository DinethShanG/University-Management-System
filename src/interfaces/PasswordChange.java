/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import dbconnection.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 *
 * @author Dinet
 */
public class PasswordChange extends javax.swing.JFrame {

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private String Role1,password,pname;
    private int id;


    public void setPName(String name) {
        this.pname = name;
    }


    public void setRole1(String Role1) {
        this.Role1 = Role1;
    }
    public void setId(int id) {
        this.id = id;
    }
    public PasswordChange() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    public void showPasswordChange(){
        this.setVisible(true);
        this.profileName.setText("Sign in as "+pname);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        confirmPasswordTxtBx = new javax.swing.JPasswordField();
        newPasswordTxtBx = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profileName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        previousPasswordTxtBx = new javax.swing.JPasswordField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 300));
        setUndecorated(true);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel7.setText("Old-Password");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel8.setText("New-Password");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel9.setText("Confirm New-Password");

        confirmPasswordTxtBx.setForeground(new java.awt.Color(204, 204, 204));
        confirmPasswordTxtBx.setText("Enter your Password");
        confirmPasswordTxtBx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmPasswordTxtBxMouseClicked(evt);
            }
        });
        confirmPasswordTxtBx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmPasswordTxtBxKeyPressed(evt);
            }
        });

        newPasswordTxtBx.setForeground(new java.awt.Color(204, 204, 204));
        newPasswordTxtBx.setText("Enter your Password");
        newPasswordTxtBx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPasswordTxtBxMouseClicked(evt);
            }
        });
        newPasswordTxtBx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newPasswordTxtBxKeyPressed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jButton5.setText("Update Password");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Images/Webp.net-resizeimage (2).png"))); // NOI18N
        jLabel1.setText("Change Password");

        profileName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        profileName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Images/top.png"))); // NOI18N
        profileName.setText("Sign in as");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Sign out");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(profileName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 13, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(profileName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        previousPasswordTxtBx.setForeground(new java.awt.Color(204, 204, 204));
        previousPasswordTxtBx.setText("Enter your Password");
        previousPasswordTxtBx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousPasswordTxtBxMouseClicked(evt);
            }
        });
        previousPasswordTxtBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPasswordTxtBxActionPerformed(evt);
            }
        });
        previousPasswordTxtBx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                previousPasswordTxtBxKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSeparator1)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton5)
                                                .addGap(31, 31, 31))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8))
                                                .addGap(112, 112, 112))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(newPasswordTxtBx, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(confirmPasswordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(previousPasswordTxtBx))
                                .addGap(0, 78, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(previousPasswordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(newPasswordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(confirmPasswordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        previousPasswordTxtBx.setText("Enter your Password");
        previousPasswordTxtBx.setText("Enter your Password");
        previousPasswordTxtBx.setText("Enter your Password");

        pack();
    }// </editor-fold>

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            DBConnect dbConnect=new DBConnect();
            conn=dbConnect.getConnection();
            stmt=conn.createStatement();
            String sql="SELECT password FROM "+Role1+" WHERE id='"+id+"'";
            rs=stmt.executeQuery(sql);
            while (rs.next()){
                password=rs.getString("password");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Database is not Connected!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Invalid SQL Expression");
        }
        if(password.equals(previousPasswordTxtBx.getText())){
            if(newPasswordTxtBx.getText().equals(confirmPasswordTxtBx.getText())){
                int response=JOptionPane.showConfirmDialog(null,"Confirm to Change Password");
                if(response==JOptionPane.YES_OPTION){
                    try {
                        DBConnect dbConnect=new DBConnect();
                        conn=dbConnect.getConnection();
                        stmt=conn.createStatement();
                        String sql="UPDATE "+Role1+" SET password='"+confirmPasswordTxtBx.getText()+"' WHERE id="+id+"";
                        stmt.executeUpdate(sql);
                        stmt.close();
                        conn.close();
                    }
                    catch (ClassNotFoundException a) {
                        a.printStackTrace();
                    }
                    catch (SQLException a) {

                        if(a instanceof MysqlDataTruncation){
                            JOptionPane.showMessageDialog(null,"Some Entered Values are too L0ong!!","Too Long Value",JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            a.printStackTrace();
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Password Changed Succcessfully");
                    this.dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Passwords didn't match.try again");
            }

        }
        else{
            JOptionPane.showMessageDialog(null,"Your old Password is incorrect.try again");
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        Home home=new Home();
        this.dispose();
        home.setVisible(true);
    }

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {
        jLabel2.setForeground(Color.BLACK);
        jLabel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    private void newPasswordTxtBxMouseClicked(java.awt.event.MouseEvent evt) {
        if(newPasswordTxtBx.getText().equals("Enter your Password")){
            newPasswordTxtBx.setText(null);
            newPasswordTxtBx.setFont(new java.awt.Font("Tahoma", 0, 16));
            newPasswordTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }

    private void confirmPasswordTxtBxMouseClicked(java.awt.event.MouseEvent evt) {
        if(confirmPasswordTxtBx.getText().equals("Enter your Password")){
            confirmPasswordTxtBx.setText(null);
            confirmPasswordTxtBx.setFont(new java.awt.Font("Tahoma", 0, 16));
            confirmPasswordTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }

    private void previousPasswordTxtBxMouseClicked(java.awt.event.MouseEvent evt) {
        if(previousPasswordTxtBx.getText().equals("Enter your Password")){
            previousPasswordTxtBx.setText(null);
            previousPasswordTxtBx.setFont(new java.awt.Font("Tahoma", 0, 16));
            previousPasswordTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }

    private void previousPasswordTxtBxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void previousPasswordTxtBxKeyPressed(java.awt.event.KeyEvent evt) {
        if(previousPasswordTxtBx.getText().equals("Enter your Password")){
            previousPasswordTxtBx.setText(null);
            previousPasswordTxtBx.setFont(new java.awt.Font("Tahoma", 0, 16));
            previousPasswordTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }

    private void newPasswordTxtBxKeyPressed(java.awt.event.KeyEvent evt) {
        if(newPasswordTxtBx.getText().equals("Enter your Password")){
            newPasswordTxtBx.setText(null);
            newPasswordTxtBx.setFont(new java.awt.Font("Tahoma", 0, 16));
            newPasswordTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }

    private void confirmPasswordTxtBxKeyPressed(java.awt.event.KeyEvent evt) {
        if(confirmPasswordTxtBx.getText().equals("Enter your Password")){
            confirmPasswordTxtBx.setText(null);
            confirmPasswordTxtBx.setFont(new java.awt.Font("Tahoma", 0, 16));
            confirmPasswordTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }


    private javax.swing.JPasswordField confirmPasswordTxtBx;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField newPasswordTxtBx;
    private javax.swing.JPasswordField previousPasswordTxtBx;
    private javax.swing.JLabel profileName;
    // End of variables declaration
}
