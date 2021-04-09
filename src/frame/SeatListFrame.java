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
import Bean.PartBean;
import Bean.ProgramBean;
import Bean.SeatListBean;
import Bean.StudentPartBean;
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Khan
 */
public class SeatListFrame extends javax.swing.JFrame {

    /**
     * Creates new form SeatListFrame
     */
    public SeatListFrame() {
        initComponents();
   
        getFaculty();
    }
public void getFaculty(){

 try{
 
       java.util.Vector v= DatabaseManager.getFaculty();
       FacComboBox.removeAllItems();
       for(int i=0; i<v.size(); i++){
           FacComboBox.addItem(v.elementAt(i));
            
       
       }
 } catch(Exception e){e.printStackTrace();}
 
    
}

  
      private void getDepartments(){
 FacultyBean bean=(FacultyBean)FacComboBox.getSelectedItem();
 if(bean==null) return;
 try{
 java.util.Vector v=DatabaseManager.getDepartment(bean.getFacId());
 DeptComboBox.removeAllItems();
 for(int i=0; i<v.size(); i++){
     DeptComboBox.addItem(v.elementAt(i));
 }
 } catch(Exception e){e.printStackTrace();}
 
 }
      
      private void getPrograms(){
      DepartmentBean bean= (DepartmentBean)DeptComboBox.getSelectedItem();
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
    
      
      
      
        private void getShiftANDGroup(){
   BatchBean bean=(BatchBean)BatchYearComboBox.getSelectedItem();
    if(bean==null) return;
    
    this.ShiftTextField.setText(bean.getShift());
    this.GroupTextField.setText(bean.getGroupDesc());
    
    
        }
  






    
    
    
    
    
    
    
    public void getExamYearOfSeat(){
     
PartBean bean=(PartBean) PartComboBox.getSelectedItem();
  if(bean==null)return;

        try{
            
       java.util.Vector v =DatabaseManager.getExamYearOfSeat(bean.getPart(),bean.getBatchId());

            examYearList.setListData(v);
       
       
        }
        catch(Exception e){e.printStackTrace();}
       
        
    }
    
    public void clear(){
      
            SlTextField.setText("");
            ExamYearTextField.setText("");
            PrepDateTextField.setText("");
            RemarksTextArea.setText("");
                    
    
        
        
    }
    
    public void deleteSeatList(){
        SeatListBean bean=(SeatListBean) examYearList.getSelectedValue();
            
        try{
      int rows = DatabaseManager.deleteSeatList(bean.getSlId());
      if(rows>=1){
      getExamYearOfSeat();
      clear();
      JOptionPane.showMessageDialog(this,rows+"Records Deleted");
      }
      
      
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    
    
    
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
        
        
    
    
    
        
    
    
    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SlTextField = new javax.swing.JTextField();
        ExamYearTextField = new javax.swing.JTextField();
        PrepDateTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        RemarksTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        examYearList = new javax.swing.JList();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        TypeComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        FacComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        DeptComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        ProgComboBox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        BatchYearComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        ShiftTextField = new javax.swing.JTextField();
        GroupTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PartComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Seat List");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(232, 11, 76, 34);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Seatlist Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 270, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Part");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 220, 29, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Exam Year");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 310, 73, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Type");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 340, 34, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Preperation Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 380, 117, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Remarks");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 420, 80, 17);
        getContentPane().add(SlTextField);
        SlTextField.setBounds(190, 260, 70, 30);
        getContentPane().add(ExamYearTextField);
        ExamYearTextField.setBounds(190, 300, 270, 34);

        PrepDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrepDateTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PrepDateTextField);
        PrepDateTextField.setBounds(190, 380, 270, 34);

        RemarksTextArea.setColumns(20);
        RemarksTextArea.setRows(5);
        jScrollPane1.setViewportView(RemarksTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 450, 270, 96);

        examYearList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        examYearList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                examYearListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(examYearList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(490, 50, 120, 490);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(190, 550, 60, 23);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton);
        UpdateButton.setBounds(250, 550, 70, 23);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(320, 550, 70, 23);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(490, 540, 120, 30);

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton);
        ClearButton.setBounds(390, 550, 70, 23);

        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "R", "I" }));
        TypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(TypeComboBox);
        TypeComboBox.setBounds(190, 340, 60, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Faculty");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(114, 51, 49, 17);

        FacComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FacComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(FacComboBox);
        FacComboBox.setBounds(196, 56, 213, 31);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Department");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 94, 83, 17);

        DeptComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DeptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(DeptComboBox);
        DeptComboBox.setBounds(196, 93, 213, 32);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Program");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 140, 60, 17);

        ProgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ProgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ProgComboBox);
        ProgComboBox.setBounds(196, 136, 213, 27);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Batch");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(120, 180, 40, 17);

        BatchYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BatchYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatchYearComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(BatchYearComboBox);
        BatchYearComboBox.setBounds(196, 179, 80, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Shift");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(290, 160, 50, 17);

        ShiftTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShiftTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ShiftTextField);
        ShiftTextField.setBounds(280, 180, 60, 30);
        getContentPane().add(GroupTextField);
        GroupTextField.setBounds(350, 179, 60, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Group");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(360, 160, 50, 17);

        PartComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PartComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(PartComboBox);
        PartComboBox.setBounds(190, 220, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Exam Year");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 20, 140, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
           
        
     PartBean bean=(PartBean) PartComboBox.getSelectedItem();
                if(bean==null)return;
    
       // int examYear=Integer.parseInt(ExamYearTextField.getText());
                String examYear=ExamYearTextField.getText();
      String type= TypeComboBox.getSelectedItem().toString();
      
       String prepDate=PrepDateTextField.getText();
       String remarks=RemarksTextArea.getText();
            
        try{
      int rows = DatabaseManager.addSeatList(bean.getPart(),bean.getBatchId(),examYear,type,prepDate,remarks);
      if(rows>=1){
      getExamYearOfSeat();
      clear();
      JOptionPane.showMessageDialog(this,rows+"Records Added");
      }
      
      
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        clear();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void examYearListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_examYearListValueChanged
        SeatListBean bean=(SeatListBean) examYearList.getSelectedValue();
        if(bean==null)return;
        
                    
                      SlTextField.setText(""+bean.getSlId());
                      ExamYearTextField.setText(""+bean.getExamYear());
                      TypeComboBox.setSelectedItem(bean.getType());
                      PrepDateTextField.setText(Decode.DateFormat(bean.getPrepDate()));
                      RemarksTextArea.setText(bean.getRemarks());
                              
        
        
        
        
    }//GEN-LAST:event_examYearListValueChanged

    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        
    }//GEN-LAST:event_TypeComboBoxActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        Object prepDateObjs[]=examYearList.getSelectedValues();
        
        if(prepDateObjs==null|| prepDateObjs.length==0)return;
        int rows=0;
        try{
        for(int i=0; i<prepDateObjs.length; i++){
            
         SeatListBean bean=(SeatListBean) prepDateObjs[i];
         if(bean==null)return;
            rows+=DatabaseManager.deleteSeatList(bean.getSlId());
            
           
            
        }
        if(rows>=1){
        JOptionPane.showMessageDialog(null,rows+"Record Deleted");
        getExamYearOfSeat();
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error"+e.getMessage());
            
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

      SeatListBean bean=(SeatListBean) examYearList.getSelectedValue();
            if(bean==null)return;
          String examYear=ExamYearTextField.getText();
          String prepDate=PrepDateTextField.getText();
            String remarks=RemarksTextArea.getText();
            
                try{
      int rows = DatabaseManager.updateSeatList(bean.getSlId(),bean.getPart(),bean.getBatchId(),examYear,prepDate,remarks);
      if(rows>=1){
      getExamYearOfSeat();
      clear();
      JOptionPane.showMessageDialog(this,rows+"Records Updated");
      }
      
      
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
            
     
          
            
         
        
        
        
        
        
        
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
       hide();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PrepDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrepDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrepDateTextFieldActionPerformed

    private void DeptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptComboBoxActionPerformed
        getPrograms();
    }//GEN-LAST:event_DeptComboBoxActionPerformed

    private void FacComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacComboBoxActionPerformed
                getDepartments();
    }//GEN-LAST:event_FacComboBoxActionPerformed

    private void ShiftTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShiftTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShiftTextFieldActionPerformed

    private void ProgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgComboBoxActionPerformed
      getBatchYears();
    }//GEN-LAST:event_ProgComboBoxActionPerformed

    private void BatchYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatchYearComboBoxActionPerformed
        getShiftANDGroup();
        getPart();
    }//GEN-LAST:event_BatchYearComboBoxActionPerformed

    private void PartComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartComboBoxActionPerformed
            getExamYearOfSeat();
    }//GEN-LAST:event_PartComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SeatListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatListFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox BatchYearComboBox;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox DeptComboBox;
    private javax.swing.JTextField ExamYearTextField;
    private javax.swing.JComboBox FacComboBox;
    private javax.swing.JTextField GroupTextField;
    private javax.swing.JComboBox PartComboBox;
    private javax.swing.JTextField PrepDateTextField;
    private javax.swing.JComboBox ProgComboBox;
    private javax.swing.JTextArea RemarksTextArea;
    private javax.swing.JTextField ShiftTextField;
    private javax.swing.JTextField SlTextField;
    private javax.swing.JComboBox TypeComboBox;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JList examYearList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    // End of variables declaration//GEN-END:variables
}
