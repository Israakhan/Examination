/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import Bean.BatchBean;
import Bean.DatabaseManager;
import Bean.DepartmentBean;
import Bean.FacultyBean;
import Bean.PartBean;
import Bean.ProgramBean;
import Bean.SeatListBean;
import Bean.SeatListDetailBean;
import Bean.StudentPartBean;
import java.awt.FileDialog;
import java.io.FileOutputStream;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Khan
 */
public class SeatListDetailFrame extends javax.swing.JFrame {

    /**
     * Creates new form SeatListDetailFrame
     */
    public SeatListDetailFrame() {
        initComponents();
       getFaculty();
    }
    
    
  private void getFaculty(){
        try{
            java.util.Vector v=DatabaseManager.getFaculty();
            FacComboBox.removeAllItems();
                for(int i=0; i<v.size(); i++){
               FacComboBox.addItem(v.elementAt(i));
                
                }
            
        }//try
        catch(Exception e){
        
            e.printStackTrace();
        }
    
    }
       
       
       
       
       
       
       
      
      private void getDepartments(){
 FacultyBean bean=(FacultyBean)FacComboBox.getSelectedItem();
 if(bean==null) return;
 try{
 java.util.Vector v=DatabaseManager.getDepartment(bean.getFacId());
 DepartmentComboBox.removeAllItems();
 for(int i=0; i<v.size(); i++){
     DepartmentComboBox.addItem(v.elementAt(i));
 }
 } catch(Exception e){e.printStackTrace();}
 
 }
      
      private void getPrograms(){
      DepartmentBean bean= (DepartmentBean)DepartmentComboBox.getSelectedItem();
        if(bean==null)return;
            try{
           java.util.Vector v=DatabaseManager.getProgram(bean.getDeptId());
           ProgComboBox.removeAllItems();
            for(int i=0; i<v.size(); i++){
            
            ProgComboBox.addItem(v.elementAt(i));
            }
            }catch(Exception e){
                    e.printStackTrace();
            }
      }
      
      private void getBatchYears(){
   ProgramBean bean=(ProgramBean) ProgComboBox.getSelectedItem();
    if(bean==null) return;
        try{
        java.util.Vector v=DatabaseManager.getBatch(bean.getProgId());
        BatchYearComboBox.removeAllItems();
        for(int i=0; i<v.size(); i++){
        BatchYearComboBox.addItem(v.elementAt(i));
        }
        
        }catch(Exception e){e.printStackTrace();}
   }//getbatchyears
    
      
      
      
        private void getShiftAndGroup(){
   BatchBean bean=(BatchBean)BatchYearComboBox.getSelectedItem();
    if(bean==null) return;
    
    this.ShiftTextField.setText(bean.getShift());
    this.GroupDescTextField.setText(bean.getGroupDesc());
    

        }
          
        
      private void getPart(){
       BatchBean bean=(BatchBean)BatchYearComboBox.getSelectedItem();
       if(bean==null)return;
        
        try{
            PartComboBox.removeAllItems();
           java.util.Vector v =DatabaseManager.getPart(bean.getBatchId());
           for(int i=0; i<v.size(); i++){
               PartComboBox.addItem(v.elementAt(i));
           
            }
        
        }
        catch(Exception e){e.printStackTrace();}
    
    }   
      
      
      
   
   
        public void getExamYearOfSeatList(){
     
PartBean bean=(PartBean) PartComboBox.getSelectedItem();
  if(bean==null)return;

        try{
      java.util.Vector v= DatabaseManager.getExamYearOfSeat(bean.getPart(),bean.getBatchId());
            ExamYearComboBox.removeAllItems();
            for(int i=0; i<v.size(); i++){
                   ExamYearComboBox.addItem(v.elementAt(i));
            
                
            }
       
        
        }catch(Exception e){e.printStackTrace();}
       
        }

  
   
  private void getSeatListDetail(){
      SeatListBean bean=(SeatListBean) ExamYearComboBox.getSelectedItem();
      if(bean==null)return;
      try{
             java.util.Vector v = DatabaseManager.getSeatListDetail(bean.getSlId(),bean.getPart(),bean.getBatchId());
              RollnoList.setListData(v);
                    
      }catch(Exception e){
          javax.swing.JOptionPane.showMessageDialog(this,"Error: "+e);
          e.printStackTrace();
      }
      
  }     
       

        
    public void pasteSeatListDetail(){
   SeatListBean bean=(SeatListBean)ExamYearComboBox.getSelectedItem();
    if(bean==null)return;
        
        String remarks=RemarksTextArea.getText();
        try{
             int rows =DatabaseManager.getSeatListDetailPaste(bean.getPart(),bean.getBatchId(),bean.getSlId());
             
                getSeatListDetail();
                 JOptionPane.showMessageDialog(this,rows+"Record Paste Successfully");
           
        }
        catch(Exception e){e.printStackTrace();}
              
              }

   
   
  private  void clear(){
      RemarksTextArea.setText("");
  
  
  }
   
   
  public void getSaveButton(){
        FileDialog  d=new FileDialog(this,"save",FileDialog.SAVE);
                d.show();
                String dir=d.getDirectory();
                String filename=d.getFile();
                String path=dir+filename;
                if(path.endsWith(".csv")){}
          
                else{
                    path+=".csv";
                }
                try{
                
                FileOutputStream ff=new FileOutputStream(path);
                PrintStream f=new PrintStream(ff);
                f.println("StdId,name,fname,surname,rollno,remarks");
                Object obj[]=RollnoList.getSelectedValues();
                if(obj==null || obj.length==0)return;
                for(int i=0; i<obj.length; i++){
                    SeatListDetailBean bean=(SeatListDetailBean) obj[i];
                        
                     f.println(bean.getSlId()+","+bean.getBatchId()+","+bean.getPart()+","+bean.getRollNo()+","+bean.getStatus()+","+bean.getRemarks());
                     
                     
                }//loop
                
                f.close();
                JOptionPane.showMessageDialog(this,"Saved Successfully"+path);
                }catch(Exception e){e.printStackTrace();}
  }             
                
  
  
  
  
   
              
  
  
   
   
   
   
   
   
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
  
   
    
    

        
        
   
       
        
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RemarksTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RollnoList = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        ShiftTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FacComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        DepartmentComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        ProgComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        BatchYearComboBox = new javax.swing.JComboBox();
        GroupDescTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PartComboBox = new javax.swing.JComboBox();
        ExamYearComboBox = new javax.swing.JComboBox();
        TypeTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RollnoTextField = new javax.swing.JTextField();
        StatusComboBox = new javax.swing.JComboBox();
        AddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton4.setText("Back");
        getContentPane().add(jButton4);
        jButton4.setBounds(680, 560, 140, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Seat List Detail");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 0, 190, 34);

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton);
        ClearButton.setBounds(390, 560, 90, 40);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(230, 560, 75, 40);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(310, 560, 71, 40);

        RemarksTextArea.setColumns(20);
        RemarksTextArea.setRows(5);
        jScrollPane1.setViewportView(RemarksTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 460, 330, 96);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Remarks");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 430, 60, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Roll number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 330, 120, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Exam Year");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 280, 90, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Part");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 230, 29, 17);

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton);
        SaveButton.setBounds(490, 370, 80, 40);

        RollnoList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        RollnoList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                RollnoListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(RollnoList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(680, 30, 140, 530);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Status");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 380, 80, 20);

        ShiftTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShiftTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ShiftTextField);
        ShiftTextField.setBounds(270, 180, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Faculty");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 50, 60, 17);

        FacComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FacComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(FacComboBox);
        FacComboBox.setBounds(150, 29, 330, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Department");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 80, 90, 17);

        DepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DepartmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(DepartmentComboBox);
        DepartmentComboBox.setBounds(150, 75, 330, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Program");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 130, 70, 17);

        ProgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ProgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ProgComboBox);
        ProgComboBox.setBounds(150, 121, 330, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Batch");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 190, 40, 17);

        BatchYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BatchYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatchYearComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(BatchYearComboBox);
        BatchYearComboBox.setBounds(150, 180, 115, 32);

        GroupDescTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupDescTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(GroupDescTextField);
        GroupDescTextField.setBounds(370, 180, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Shift");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 160, 32, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Group Desc");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(390, 160, 90, 17);

        PartComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PartComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(PartComboBox);
        PartComboBox.setBounds(150, 220, 330, 40);

        ExamYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ExamYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamYearComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ExamYearComboBox);
        ExamYearComboBox.setBounds(150, 270, 330, 40);

        TypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(TypeTextField);
        TypeTextField.setBounds(490, 270, 80, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Type");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(510, 230, 34, 30);
        getContentPane().add(RollnoTextField);
        RollnoTextField.setBounds(150, 320, 330, 40);

        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L", "T" }));
        getContentPane().add(StatusComboBox);
        StatusComboBox.setBounds(150, 370, 330, 40);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(150, 560, 70, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
       
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
    getSaveButton();
        
        
        
        
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
     Object rollnoObj[]=RollnoList.getSelectedValues();
        if(rollnoObj==null|| rollnoObj.length==0)return;
        int rows=0;
        for(int i=0; i<rollnoObj.length; i++){
         StudentPartBean bean=(StudentPartBean)rollnoObj[i];  
         if(bean==null)return;
          try{
         rows+=DatabaseManager.deleteStudentPartDetails(bean.getBatchId(),bean.getPart(),bean.getRollNo());
         
          }catch(Exception e){e.printStackTrace();}
        }
         
        
        
         JOptionPane.showMessageDialog(this,rows+"Records Deleted");
        getSeatListDetail();
        
        
        
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void DepartmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentComboBoxActionPerformed
            getPrograms();
    }//GEN-LAST:event_DepartmentComboBoxActionPerformed

    private void ShiftTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShiftTextFieldActionPerformed
   
    }//GEN-LAST:event_ShiftTextFieldActionPerformed

    private void GroupDescTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupDescTextFieldActionPerformed
        
    }//GEN-LAST:event_GroupDescTextFieldActionPerformed

    private void ProgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgComboBoxActionPerformed
      getBatchYears();
    }//GEN-LAST:event_ProgComboBoxActionPerformed

    private void BatchYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatchYearComboBoxActionPerformed
     getShiftAndGroup();
     getPart();
    }//GEN-LAST:event_BatchYearComboBoxActionPerformed

    private void FacComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacComboBoxActionPerformed
   getDepartments();
    }//GEN-LAST:event_FacComboBoxActionPerformed

    private void PartComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartComboBoxActionPerformed
      getExamYearOfSeatList();
    }//GEN-LAST:event_PartComboBoxActionPerformed

    private void TypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeTextFieldActionPerformed

        
      
    }//GEN-LAST:event_TypeTextFieldActionPerformed

    private void ExamYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamYearComboBoxActionPerformed
       
      SeatListBean Seatbean=(SeatListBean) ExamYearComboBox.getSelectedItem();
      if(Seatbean==null)return;
      //System.out.println(Seatbean.getType());
      
      TypeTextField.setText(Seatbean.getType());
  
       
      getSeatListDetail();
    }//GEN-LAST:event_ExamYearComboBoxActionPerformed

    private void RollnoListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_RollnoListValueChanged
      SeatListDetailBean bean =(SeatListDetailBean) RollnoList.getSelectedValue();
      if(bean==null)return;
      RollnoTextField.setText(bean.getRollNo());
      StatusComboBox.setSelectedItem(bean.getStatus());
      
      
        
        
    }//GEN-LAST:event_RollnoListValueChanged

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
     SeatListDetailBean bean=(SeatListDetailBean) RollnoList.getSelectedValue();
            if(bean==null)return;
            
                String rollno=RollnoTextField.getText();
            String remarks=RemarksTextArea.getText();
            
                try{
     int rows = DatabaseManager.updateSeatListDetails(bean.getSlId(),bean.getPart(),bean.getBatchId(),rollno,remarks);
     if(rows>=1){
     getSeatListDetail();
      clear();
      JOptionPane.showMessageDialog(this,rows+"Records Updated");
      }
      
      
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
            
    }//GEN-LAST:event_updateButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
       SeatListBean bean=(SeatListBean)ExamYearComboBox.getSelectedItem();
       if(bean==null)return;
         
       String status=(String )StatusComboBox.getSelectedItem();
      String rollNo= RollnoTextField.getText();
       String remarks=RemarksTextArea.getText();
            
        try{
            System.out.println(bean.getSlId());
      int rows = DatabaseManager.addSeatListDetails(bean.getSlId(),bean.getPart(),bean.getBatchId(),status,remarks);
      if(rows>=1){
    
      clear();
      JOptionPane.showMessageDialog(this,rows+"Records Added");
      }
      
      
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_AddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SeatListDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatListDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatListDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatListDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatListDetailFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JComboBox BatchYearComboBox;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox DepartmentComboBox;
    private javax.swing.JComboBox ExamYearComboBox;
    private javax.swing.JComboBox FacComboBox;
    private javax.swing.JTextField GroupDescTextField;
    private javax.swing.JComboBox PartComboBox;
    private javax.swing.JComboBox ProgComboBox;
    private javax.swing.JTextArea RemarksTextArea;
    private javax.swing.JList RollnoList;
    private javax.swing.JTextField RollnoTextField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField ShiftTextField;
    private javax.swing.JComboBox StatusComboBox;
    private javax.swing.JTextField TypeTextField;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
