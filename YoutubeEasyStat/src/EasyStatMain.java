/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.mysql.cj.xdevapi.DbDoc;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ASUS
 */
public class MainCommandPanel extends javax.swing.JFrame {

    String filename=null;
    byte[] person_image;
    public MainCommandPanel() {
        this.person_image = null;
        initComponents();
        show_user();
    }

   public ArrayList<User>userList(){
       ArrayList<User> usersList=new ArrayList<>();
       String dbname = "easystat";
       String DB_CONNECTION = "jdbc:mysql://localhost/";
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection = DriverManager.getConnection(DB_CONNECTION+dbname, "root", "");
             String query1="SELECT * FROM student_info";
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(query1);
             User user;
             while(rs.next())
             {
                user=new User(rs.getString("Student_id"),rs.getString("First_Name"),rs.getString("Last_Name"),rs.getString("Department"),rs.getString("Series"),rs.getString("Age"),rs.getString("Height"),rs.getString("Weight"),rs.getString("Gender"),rs.getString("Blood"),rs.getBytes("images"));
                usersList.add(user);
             }
            
    }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
         return usersList;
         }
    public void show_user()
    {
        ArrayList<User> list=userList();
        DefaultTableModel model=(DefaultTableModel)jTable_Display_User.getModel();
        Object[] row=new Object[10];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getStudent_id();
            row[1]=list.get(i).getFirst_Name();
            row[2]=list.get(i).getLast_Name();
            row[3]=list.get(i).getDepartment();
            row[4]=list.get(i).getSeries();
            row[5]=list.get(i).getAge();
            row[6]=list.get(i).getHeight();
            row[7]=list.get(i).getWeight();
            row[8]=list.get(i).getGender();
            row[9]=list.get(i).getBlood();
            model.addRow(row);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        seri = new javax.swing.JTextField();
        ag = new javax.swing.JTextField();
        heit = new javax.swing.JTextField();
        weit = new javax.swing.JTextField();
        blo = new javax.swing.JTextField();
        gen = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();
        deleteBtn = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_img = new javax.swing.JLabel();
        btn_image = new javax.swing.JButton();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Input", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 0, 255))); // NOI18N

        jLabel1.setText("Student_id ");

        jLabel2.setText("First_Name ");

        jLabel3.setText("Last_Name ");

        jLabel4.setText("Department");

        jLabel5.setText("Series ");

        jLabel6.setText("Age ");

        jLabel7.setText("Height");

        jLabel8.setText("Weight ");

        jLabel9.setText("Gender ");

        jLabel10.setText("Blood ");

        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seri, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6)
                        .addComponent(jLabel9))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(heit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(weit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(blo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(204, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                " Student_id", "First_Name", "Last_Name", "Department 	", "Series ", "Age ", "Height ", "Weight", "Gender ", "Blood "
            }
        ));
        jTable_Display_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UserMouseClicked(evt);
            }
        });
        jTable_Display_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_Display_UserKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User);

        deleteBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Action", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteBtnLayout = new javax.swing.GroupLayout(deleteBtn);
        deleteBtn.setLayout(deleteBtnLayout);
        deleteBtnLayout.setHorizontalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearBtn)
                    .addGroup(deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addBtn)
                        .addComponent(editBtn)
                        .addComponent(jButton1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        deleteBtnLayout.setVerticalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBtnLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(addBtn)
                .addGap(18, 18, 18)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(clearBtn)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_image.setText("Choose");
        btn_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_imageMouseClicked(evt);
            }
        });
        btn_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_image)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btn_image)
                .addContainerGap())
        );

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(search)
                        .addGap(44, 44, 44)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(search))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jTable_Display_UserMouseClicked(java.awt.event.MouseEvent evt) {                                                 
         int i=jTable_Display_User.getSelectedRow();
        TableModel model=jTable_Display_User.getModel();
      
        id.setText(model.getValueAt(i, 1).toString());
        fname.setText(model.getValueAt(i, 2).toString());
        lname.setText(model.getValueAt(i, 3).toString());
        dept.setText(model.getValueAt(i, 4).toString());
        seri.setText(model.getValueAt(i, 5).toString());
        ag.setText(model.getValueAt(i, 6).toString());
        heit.setText(model.getValueAt(i, 7).toString());
        weit.setText(model.getValueAt(i, 8).toString());
        //gen.setText(model.getValueAt(i, 9).toString());
        gen.getSelectedItem().toString();
        blo.setText(model.getValueAt(i, 10).toString());
        byte[] img=(userList().get(i).getImage());
        ImageIcon imageIcon=new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageIcon);
        person_image=img;
        
    }                                                

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
         String dbname = "easystat";
        String DB_CONNECTION = "jdbc:mysql://localhost/";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_CONNECTION+dbname, "root", "");
            String query="insert into student_info(Student_id,First_Name,Last_Name,Department,Series,Age,Height,Weight,Gender,Blood,images)values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=connection.prepareStatement(query);
            pst.setString(1, id.getText());
            pst.setString(2, fname.getText());
            pst.setString(3, lname.getText());
            pst.setString(4, dept.getText());
            pst.setString(5, seri.getText());
            pst.setString(6, ag.getText());
            pst.setString(7, heit.getText());
            pst.setString(8, weit.getText());
            pst.setString(9, gen.getItemAt(WIDTH));//CSE
            pst.setString(10, blo.getText());
            pst.setBytes(11, person_image);
            
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel) jTable_Display_User.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Inserted Sucessfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }                                      

    private void jTable_Display_UserKeyReleased(java.awt.event.KeyEvent evt) {                                                
         if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
        int i=jTable_Display_User.getSelectedRow();
        TableModel model=jTable_Display_User.getModel();
        id.setText(model.getValueAt(i, 0).toString());
        fname.setText(model.getValueAt(i, 1).toString());
        lname.setText(model.getValueAt(i, 2).toString());
        dept.setText(model.getValueAt(i, 3).toString());
        seri.setText(model.getValueAt(i, 4).toString());
        ag.setText(model.getValueAt(i, 5).toString());
        heit.setText(model.getValueAt(i, 6).toString());
        weit.setText(model.getValueAt(i, 7).toString());
        //gen.setText(model.getValueAt(i, 8).toString());
         //gen.getSelectedItem(model.getValueAt(i, 8).toString());
        blo.setText(model.getValueAt(i, 9).toString());
        byte[] img=(userList().get(i).getImage());
        ImageIcon imageIcon=new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageIcon);
        
        }
    }                                               

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
      String dbname = "easystat";
        String DB_CONNECTION = "jdbc:mysql://localhost/";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_CONNECTION+dbname, "root", "");
            int row=jTable_Display_User.getSelectedRow();
           String value=(jTable_Display_User.getModel().getValueAt(row, 0).toString());
        
            String query="UPDATE student_info SET First_Name=?,Last_Name=?,Department=?,Series=?,Age=?,Height=?,Weight=?,Gender=?,Blood=?,images=?  where Student_id="+value;
             PreparedStatement pst=connection.prepareStatement(query);
          
            pst.setString(1, fname.getText());
            pst.setString(2, lname.getText());
            pst.setString(3, dept.getText());
            pst.setString(4, seri.getText());
            pst.setString(5, ag.getText());
            pst.setString(6, heit.getText());
            pst.setString(7, weit.getText());
            pst.setString(8, gen.getSelectedItem().toString());
            pst.setString(9, blo.getText());
            byte[] img=person_image;
            pst.setBytes(10, img);
            pst.executeUpdate();
             
            DefaultTableModel model=(DefaultTableModel)jTable_Display_User.getModel();//CSE
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Updated Sucessfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String dbname = "easystat";
        String DB_CONNECTION = "jdbc:mysql://localhost/";
        int opt=JOptionPane.showConfirmDialog(null, "Are You Sure to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0)
        {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_CONNECTION+dbname, "root", "");
            int row=jTable_Display_User.getSelectedRow();
            String value=(jTable_Display_User.getModel().getValueAt(row, 0).toString());
            String query="DELETE FROM student_info  where Student_id="+value;
            PreparedStatement pst=connection.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel) jTable_Display_User.getModel();//CSE
            model.setRowCount(0);
            show_user();
             JOptionPane.showMessageDialog(null, "Deleted Sucessfully");
        } catch (Exception e) {
            
        }
        }
    }                                        

    private void btn_imageActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imageIcon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageIcon);
        try {
            File image=new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;)
            {
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }                                         

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
       id.setText("");
       fname.setText("");
       lname.setText("");
       dept.setText("");
       seri.setText("");
       ag.setText("");
       heit.setText("");
       weit.setText("");
      // gen.setText("");
       blo.setText("");
       lbl_img.setIcon(null);
    }                                        

    private void btn_imageMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String dbname = "easystat";
        String DB_CONNECTION = "jdbc:mysql://localhost/";
          try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_CONNECTION+dbname, "root", "");
            String sql="select * from student_info where Student_id =?";
            PreparedStatement pst=connection.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(id.getText()));
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                fname.setText(rs.getString("First_Name"));
                lname.setText(rs.getString("Last_Name"));
                dept.setText(rs.getString("Department"));
                seri.setText(rs.getString("Series"));
                ag.setText(rs.getString("Age"));
                heit.setText(rs.getString("Height"));
                weit.setText(rs.getString("Weight"));
                //gen.setText(rs.getString("Gender"));
                blo.setText(rs.getString("Blood"));
                byte[] img=rs.getBytes("images");
                ImageIcon imageIcon=new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH));
                lbl_img.setIcon(imageIcon);
                person_image=img;
        
            }
              //connection.close();
            }
            
          
            
         catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
                }
        
    }                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MainCommandPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainCommandPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainCommandPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainCommandPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainCommandPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField ag;
    private javax.swing.JTextField blo;
    private javax.swing.JButton btn_image;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel deleteBtn;
    private javax.swing.JTextField dept;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JTextField heit;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_Display_User;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JTextField lname;
    private javax.swing.JButton search;
    private javax.swing.JTextField seri;
    private javax.swing.JTextField weit;
    // End of variables declaration                   

    private Object getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
