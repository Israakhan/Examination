/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import Bean.BatchBean;
import Bean.DatabaseManager;
import Bean.Decode;
import Bean.DepartmentBean;
import Bean.FacultyBean;
import Bean.LedgerBean;
import Bean.PartBean;
import Bean.ProgramBean;
import Bean.SchemeBean;
import Bean.SeatListBean;
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Khan
 */
public class LedgerFrame extends javax.swing.JFrame {

    /**
     * Creates new form LedgerFrame
     */
    public LedgerFrame() {
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
            JOptionPane.showMessageDialog(this,"Error:"+e.getMessage());
        }
    
    }
    
    
    
    
    private void getDepartments(){
 FacultyBean bean=(FacultyBean)FacComboBox.getSelectedItem();
 if(bean==null) return;
 try{
 java.util.Vector v=DatabaseManager.getDepartment(bean.getFacId());
 DeptComboBox.removeAllItems();
 for(int i=0; i<v.size(); i++){
    this.DeptComboBox.addItem(v.elementAt(i));
 }
 } catch(Exception e){e.printStackTrace();}
 
 }
    
    
   private void getPrograms(){
   DepartmentBean bean=(DepartmentBean) DeptComboBox.getSelectedItem();
    if(bean==null) return;
        try{
        java.util.Vector v=DatabaseManager.getProgram(bean.getDeptId());
        ProgramComboBox.removeAllItems();
        for(int i=0; i<v.size(); i++){
        ProgramComboBox.addItem(v.elementAt(i));
            
       
        }
        }catch(Exception e){e.printStackTrace();}
   }//getprogram
        
        
   
   
           
           
           
         
 private void   getBatchYears(){ 
       ProgramBean bean=(ProgramBean) ProgramComboBox.getSelectedItem();
    if(bean==null) return;
        try{
        java.util.Vector v=DatabaseManager.getBatch(bean.getProgId());
        BatchYearComboBox.removeAllItems();
            for(int i=0; i<v.size(); i++){
                BatchYearComboBox.addItem(v.elementAt(i));
            
            }
        
        }catch(Exception e){e.printStackTrace();}    
        
 } 
//    private void getShiftAndGroup(){
//   BatchBean bean=(BatchBean)BatchYearComboBox.getSelectedItem();
//    if(bean==null) return;
//    
//    this.ShiftTextField.setText(bean.getShift());
//    this.GroupTextField.setText(bean.getGroupDesc());
//    
//    
//        }
//  
  
    
    
    
    
    
    
    
    private void getPart(){
       BatchBean bean=(BatchBean)BatchYearComboBox.getSelectedItem();
       if(bean==null)return;
   
       this.ShiftTextField.setText(bean.getShift());
       this.GroupTextField.setText(bean.getGroupDesc());
   
       try{
        
           java.util.Vector v =DatabaseManager.getPart(bean.getBatchId());
           PartComboBox.removeAllItems();
           
           for(int i=0; i<v.size(); i++){
               PartComboBox.addItem(v.elementAt(i));
           }
        }
        catch(Exception e){e.printStackTrace();}
    
    
    }
    
         public  void getExamYear(){
        PartBean bean=(PartBean) PartComboBox.getSelectedItem();
         if(bean==null)return;

        try{
            
       java.util.Vector v =DatabaseManager.getExamYearOfSeat(bean.getPart(),bean.getBatchId());
       ExamYearComboBox.removeAllItems();
        for(int i=0; i<v.size(); i++){ 
        
            ExamYearComboBox.addItem(v.elementAt(i));
        }
       
       
        }
        catch(Exception e){e.printStackTrace();}
       
       
    }
    
//   public void getExamType(){
//   SeatListBean bean=(SeatListBean)ExamYearComboBox.getSelectedItem();
//   if(bean==null)return;
//   
//               ExamTypeTextField.setText(bean.getType());
//   
//   
//   } 
//   
   
   public void getScheme(){
   BatchBean bean=(BatchBean) BatchYearComboBox.getSelectedItem();
   if(bean==null)return;
   
   try{
     java.util.Vector v =  DatabaseManager.getScheme(bean.getProgId(),bean.getBatchYear());

     SchemeGroupComboBox.removeAllItems();
     for(int i=0; i<v.size(); i++){
            SchemeGroupComboBox.addItem(v.elementAt(i));
     }           
   }catch(Exception e){
       e.printStackTrace();
       javax.swing.JOptionPane.showMessageDialog(this,"Error: "+e);
   }                    
}//end method    
   
   
//public void getSchemeIdAndGroup(){
//    SchemeBean bean=(SchemeBean) SchemeYearComboBox.getSelectedItem();
//    if(bean==null)return;
//    
//                          SchemeIdTextField.setText(""+bean.getSchemeId());
//                          SchemeGroupComboBox.setSelectedItem(bean.getSchemeGroup());
//                          
//                           
//                          
//    
//
//}   
 
 
 public void getLedger(){
   SeatListBean seatbean=(SeatListBean) ExamYearComboBox.getSelectedItem();
   if(seatbean==null)
       return;
  
    ExamTypeTextField.setText(seatbean.getType());
   try{
        LedgerBean ledgerBean = DatabaseManager.getLedger(seatbean.getSlId());
        if(ledgerBean==null)return;
             
        AnnouncementDateTextField.setText(Decode.DateFormat(ledgerBean.getDateAnn()));
//        AnnouncementDateTextField.setText(""+ledgerBean);
        IsAnnounceComboBox.setSelectedItem(ledgerBean.getIsAnn());
             
  }catch(Exception e){ 
      e.printStackTrace();
      javax.swing.JOptionPane.showMessageDialog(this,"Error: "+e);
  }
 }//end method
                                        
     
     
     
     
     
 
 
 
 




  
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DeptComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        ProgramComboBox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        BatchYearComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PartComboBox = new javax.swing.JComboBox();
        IsAnnounceComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ShiftTextField = new javax.swing.JTextField();
        ExamYearComboBox = new javax.swing.JComboBox();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RemarksTextArea = new javax.swing.JTextArea();
        AnnouncementDateTextField = new javax.swing.JTextField();
        SchemeIdTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ExamTypeTextField = new javax.swing.JTextField();
        GroupTextField = new javax.swing.JTextField();
        SchemeGroupComboBox = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        FacComboBox = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        SchemeYearTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Part");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 260, 29, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel10.setText("LEDGER");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 0, 220, 58);

        DeptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(DeptComboBox);
        DeptComboBox.setBounds(180, 110, 320, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Program");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 170, 60, 17);

        ProgramComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgramComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ProgramComboBox);
        ProgramComboBox.setBounds(180, 160, 320, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Batch");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(100, 220, 40, 17);

        BatchYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatchYearComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(BatchYearComboBox);
        BatchYearComboBox.setBounds(180, 220, 80, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Shift");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(280, 200, 50, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Group");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(400, 200, 50, 17);

        PartComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(PartComboBox);
        PartComboBox.setBounds(180, 260, 90, 30);

        IsAnnounceComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N" }));
        IsAnnounceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsAnnounceComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(IsAnnounceComboBox);
        IsAnnounceComboBox.setBounds(360, 430, 100, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Exam Type");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 290, 76, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Scheme Year");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 340, 89, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Scheme Id");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 370, 74, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Scheme Group");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 340, 101, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Announcement Date");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 430, 142, 30);

        ShiftTextField.setEditable(false);
        ShiftTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShiftTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ShiftTextField);
        ShiftTextField.setBounds(270, 220, 80, 30);

        ExamYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamYearComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ExamYearComboBox);
        ExamYearComboBox.setBounds(180, 310, 150, 31);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(180, 610, 60, 30);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(240, 610, 70, 30);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton);
        UpdateButton.setBounds(310, 610, 80, 30);

        ClearButton.setText("clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton);
        ClearButton.setBounds(390, 610, 60, 30);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(460, 610, 60, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Is Announced");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(360, 400, 110, 30);

        RemarksTextArea.setColumns(20);
        RemarksTextArea.setRows(5);
        jScrollPane1.setViewportView(RemarksTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 510, 340, 96);
        getContentPane().add(AnnouncementDateTextField);
        AnnouncementDateTextField.setBounds(180, 430, 170, 40);

        SchemeIdTextField.setEditable(false);
        getContentPane().add(SchemeIdTextField);
        SchemeIdTextField.setBounds(180, 370, 80, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Exam Year");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(70, 310, 73, 30);

        ExamTypeTextField.setEditable(false);
        getContentPane().add(ExamTypeTextField);
        ExamTypeTextField.setBounds(360, 310, 140, 30);

        GroupTextField.setEditable(false);
        getContentPane().add(GroupTextField);
        GroupTextField.setBounds(360, 220, 140, 30);

        SchemeGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "C", "M", "G" }));
        SchemeGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchemeGroupComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SchemeGroupComboBox);
        SchemeGroupComboBox.setBounds(370, 370, 130, 31);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Remarks");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(180, 480, 60, 30);

        FacComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(FacComboBox);
        FacComboBox.setBounds(180, 60, 320, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Department");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 130, 83, 17);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Faculty");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(90, 70, 83, 17);

        SchemeYearTextField.setEditable(false);
        SchemeYearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchemeYearTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SchemeYearTextField);
        SchemeYearTextField.setBounds(270, 370, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptComboBoxActionPerformed
            getPrograms();
    }//GEN-LAST:event_DeptComboBoxActionPerformed

    private void ProgramComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgramComboBoxActionPerformed
      getBatchYears();
     
    }//GEN-LAST:event_ProgramComboBoxActionPerformed

    private void BatchYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatchYearComboBoxActionPerformed
            getPart();
            //getShiftAndGroup();
            getScheme();
    }//GEN-LAST:event_BatchYearComboBoxActionPerformed

    private void PartComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartComboBoxActionPerformed
            getExamYear();  
    }//GEN-LAST:event_PartComboBoxActionPerformed

    private void ShiftTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShiftTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShiftTextFieldActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

           SeatListBean bean=(SeatListBean) ExamYearComboBox.getSelectedItem();
            if(bean==null)return;
            
            String SCHEME_ID=SchemeIdTextField.getText();
            if(SCHEME_ID.trim().equals("")){
                javax.swing.JOptionPane.showMessageDialog(this,"KINDLY FIRST BUILD SCHEME THEN BUILD LEDGER?");
                return; 
            }
            
            int schemeId=Integer.parseInt(SCHEME_ID);
            String announcementDate=AnnouncementDateTextField.getText();
            
            if(announcementDate.trim().equals("")){
                javax.swing.JOptionPane.showMessageDialog(this,"Enter ANNOUNCEMENT DATE?");
                return; 
            }
            
            String Isann=(String)IsAnnounceComboBox.getSelectedItem();
            String remarks=RemarksTextArea.getText(); 
            try{
                int rows = DatabaseManager.addLedger(bean.getSlId(),schemeId,Isann,announcementDate,remarks);
                if(rows>=1)
                  JOptionPane.showMessageDialog(this,rows+"Data Added");
                
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this,"ERROR: "+e);
            }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       SeatListBean bean=(SeatListBean) ExamYearComboBox.getSelectedItem();
       if(bean==null)return;

 
        try{
            int rows=DatabaseManager.deleteLedger(bean.getSlId());
                if(rows>=1){
               
                        JOptionPane.showMessageDialog(this,rows+"Records Deleted");
                }
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                     e.printStackTrace();
                }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

     
           SeatListBean bean=(SeatListBean)ExamYearComboBox.getSelectedItem();
            if(bean==null)return;

            String SCHEME_ID=SchemeIdTextField.getText();
            if(SCHEME_ID.trim().equals("")){
                javax.swing.JOptionPane.showMessageDialog(this,"KINDLY FIRST BUILD SCHEME THEN BUILD LEDGER?");
                return; 
            }
            
            int schemeId=Integer.parseInt(SCHEME_ID);
            String announcementDate=AnnouncementDateTextField.getText();
            
            if(announcementDate.trim().equals("")){
                javax.swing.JOptionPane.showMessageDialog(this,"Enter ANNOUNCEMENT DATE?");
                return; 
            }
            
            String Isann=(String)IsAnnounceComboBox.getSelectedItem();
            String remarks=RemarksTextArea.getText(); 
            try{
                 int rows = DatabaseManager.updateLedger(bean.getSlId(),schemeId,Isann,announcementDate,remarks);
                 if(rows>=1)         
                     JOptionPane.showMessageDialog(this,rows+"Data Updated");
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this,"Error: "+e);
            }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
   
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
            hide();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void FacComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacComboBoxActionPerformed
        getDepartments();
    }//GEN-LAST:event_FacComboBoxActionPerformed

    private void ExamYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamYearComboBoxActionPerformed
//            getExamType();
       getLedger();          
    }//GEN-LAST:event_ExamYearComboBoxActionPerformed

    private void IsAnnounceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsAnnounceComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsAnnounceComboBoxActionPerformed

    private void SchemeGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchemeGroupComboBoxActionPerformed
       SchemeBean bean=(SchemeBean)SchemeGroupComboBox.getSelectedItem();
        if(bean==null)return;
        
        this.SchemeIdTextField.setText(""+bean.getSchemeId());
        this.SchemeYearTextField.setText(""+bean.getSchemeYear());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_SchemeGroupComboBoxActionPerformed

    private void SchemeYearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchemeYearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SchemeYearTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LedgerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LedgerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LedgerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LedgerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LedgerFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AnnouncementDateTextField;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox BatchYearComboBox;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox DeptComboBox;
    private javax.swing.JTextField ExamTypeTextField;
    private javax.swing.JComboBox ExamYearComboBox;
    private javax.swing.JComboBox FacComboBox;
    private javax.swing.JTextField GroupTextField;
    private javax.swing.JComboBox IsAnnounceComboBox;
    private javax.swing.JComboBox PartComboBox;
    private javax.swing.JComboBox ProgramComboBox;
    private javax.swing.JTextArea RemarksTextArea;
    private javax.swing.JComboBox SchemeGroupComboBox;
    private javax.swing.JTextField SchemeIdTextField;
    private javax.swing.JTextField SchemeYearTextField;
    private javax.swing.JTextField ShiftTextField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
