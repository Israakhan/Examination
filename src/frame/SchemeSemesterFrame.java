/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import Bean.DatabaseManager;
import Bean.DepartmentBean;
import Bean.FacultyBean;
import Bean.ProgramBean;
import Bean.SchemeBean;
import Bean.SchemePartBean;
import Bean.SchemeSemesterBean;
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Khan
 */
public class SchemeSemesterFrame extends javax.swing.JFrame {

    /**
     * Creates new form SchemeSemesterFrame
     */
    public SchemeSemesterFrame() {
        initComponents();
        getFaculty();
    }

      
     private void getFaculty(){
        try{
            java.util.Vector v=DatabaseManager.getFaculty();
           FacultyComboBox .removeAllItems();
                for(int i=0; i<v.size(); i++){
               FacultyComboBox.addItem(v.elementAt(i));
                
                }
            
        }//try
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error:"+e.getMessage());
        }
    
    }
 
  private void getDepartments(){
 FacultyBean bean=(FacultyBean)FacultyComboBox.getSelectedItem();
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
 
     DepartmentBean bean=(DepartmentBean)DeptComboBox.getSelectedItem();
 
     if(bean==null) return;
 try{
 java.util.Vector v=DatabaseManager.getProgram(bean.getDeptId());
 
 
ProgComboBox.removeAllItems();
 for(int i=0; i<v.size(); i++){
     ProgComboBox.addItem(v.elementAt(i));
 }
 } catch(Exception e){e.printStackTrace();}
 
 } 
 
 public void getScheme(){
        ProgramBean bean=(ProgramBean)ProgComboBox.getSelectedItem();
            if(bean==null)return;
            
            try{
         java.util.Vector v=DatabaseManager.getScheme(bean.getProgId());
         SchemeYearComboBox.removeAllItems();
          for(int i=0; i<v.size(); i++){
                SchemeYearComboBox.addItem(v.elementAt(i));
  
          }
            }catch(Exception e){e.printStackTrace();}
   
 }
 
 public void getSchemePart(){
  SchemeBean bean=(SchemeBean) SchemeYearComboBox.getSelectedItem(); 
  if(bean==null)return;
  try{
      java.util.Vector v=DatabaseManager.getSchemePart(bean.getSchemeId());
      SchemePartComboBox.removeAllItems();
        for(int i=0; i<v.size(); i++){
            SchemePartComboBox.addItem(v.elementAt(i));
            
        
        }
     
  
  
  }
  catch(Exception e){e.printStackTrace();}
 
 
 
 
 }

 

    public void getSchemeSemester(){
  SchemePartBean bean=(SchemePartBean) SchemePartComboBox.getSelectedItem(); 
  if(bean==null)return;
  try{
      java.util.Vector v=DatabaseManager.getSchemeSemester(bean.getSchemeId(),bean.getSchemePart());
    
        SchemeSemesterList.setListData(v);
     
  
  
  }
  catch(Exception e){e.printStackTrace();}
 
 
 
 
 }
    
    
    
    
    
    
    void clear(){
     SemesterTextField.setText("");  
     RemarksTextArea.setText("");
        
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgramLabel = new javax.swing.JLabel();
        FacultyyLabel = new javax.swing.JLabel();
        FacultyComboBox = new javax.swing.JComboBox();
        DeptLabel = new javax.swing.JLabel();
        DeptComboBox = new javax.swing.JComboBox();
        ProgIdLabel = new javax.swing.JLabel();
        ProgComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        SchemeYearComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        SchemePartComboBox = new javax.swing.JComboBox();
        SemesterTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SchemeSemesterList = new javax.swing.JList();
        AddButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RemarksTextArea = new javax.swing.JTextArea();
        ProgramLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        ProgramLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ProgramLabel.setText("Scheme Semester ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        FacultyyLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        FacultyyLabel.setText("Faculty ");
        getContentPane().add(FacultyyLabel);
        FacultyyLabel.setBounds(123, 100, 157, 31);

        FacultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FacultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(FacultyComboBox);
        FacultyComboBox.setBounds(193, 100, 310, 40);

        DeptLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        DeptLabel.setText("Department");
        getContentPane().add(DeptLabel);
        DeptLabel.setBounds(93, 160, 66, 22);

        DeptComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DeptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(DeptComboBox);
        DeptComboBox.setBounds(193, 160, 310, 40);

        ProgIdLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ProgIdLabel.setText("Program");
        getContentPane().add(ProgIdLabel);
        ProgIdLabel.setBounds(103, 210, 89, 31);

        ProgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ProgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ProgComboBox);
        ProgComboBox.setBounds(193, 210, 310, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Semester");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(680, 60, 90, 20);

        SchemeYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SchemeYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchemeYearComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SchemeYearComboBox);
        SchemeYearComboBox.setBounds(193, 260, 310, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Scheme Part");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(67, 312, 90, 20);

        SchemePartComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SchemePartComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchemePartComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SchemePartComboBox);
        SchemePartComboBox.setBounds(193, 306, 310, 37);
        getContentPane().add(SemesterTextField);
        SemesterTextField.setBounds(193, 354, 310, 35);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Semester");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 360, 90, 20);

        SchemeSemesterList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        SchemeSemesterList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SchemeSemesterListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(SchemeSemesterList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(660, 91, 134, 410);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(193, 507, 63, 51);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(266, 507, 70, 51);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(343, 507, 70, 51);

        jButton4.setText("Clear");
        getContentPane().add(jButton4);
        jButton4.setBounds(424, 507, 79, 51);

        jButton5.setText("Back");
        getContentPane().add(jButton5);
        jButton5.setBounds(656, 510, 140, 51);

        RemarksTextArea.setColumns(20);
        RemarksTextArea.setRows(5);
        jScrollPane2.setViewportView(RemarksTextArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(193, 400, 310, 96);

        ProgramLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ProgramLabel1.setText("Scheme Semester ");
        getContentPane().add(ProgramLabel1);
        ProgramLabel1.setBounds(175, 0, 410, 82);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Scheme Year");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(67, 268, 90, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FacultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyComboBoxActionPerformed
        getDepartments();
    }//GEN-LAST:event_FacultyComboBoxActionPerformed

    private void DeptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptComboBoxActionPerformed
        getPrograms();
    }//GEN-LAST:event_DeptComboBoxActionPerformed

    private void ProgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgComboBoxActionPerformed
        getScheme();
    }//GEN-LAST:event_ProgComboBoxActionPerformed

    private void SchemeYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchemeYearComboBoxActionPerformed
        getSchemePart();
    }//GEN-LAST:event_SchemeYearComboBoxActionPerformed

    private void SchemePartComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchemePartComboBoxActionPerformed
  getSchemeSemester();
    }//GEN-LAST:event_SchemePartComboBoxActionPerformed

    private void SchemeSemesterListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SchemeSemesterListValueChanged
       SchemeSemesterBean bean=(SchemeSemesterBean)SchemeSemesterList.getSelectedValue();
       if(bean==null)return;
        
        SemesterTextField.setText(""+bean.getSchemeSemester());
        RemarksTextArea.setText(bean.getRemarks());
        
    }//GEN-LAST:event_SchemeSemesterListValueChanged

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
     
         SchemePartBean bean=(SchemePartBean) SchemePartComboBox.getSelectedItem();    
        if(bean==null)return;
 
 String semester=SemesterTextField.getText();      
 String remarks=RemarksTextArea.getText();
 
 
 
 
     try{
          int rows=DatabaseManager.addSchemeSemester(bean.getSchemeId(),bean.getSchemePart(),semester,remarks);
            if(rows>=1){
                getSchemePart();
          clear();
              JOptionPane.showMessageDialog(this,rows+"Data Added");
 
 
 }
 }catch(Exception e){
 
 JOptionPane.showMessageDialog(this,e.getMessage());
 e.printStackTrace();
}
        
        
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
         Object schemePartObjs[]=SchemeSemesterList.getSelectedValues();
        
        if(schemePartObjs==null|| schemePartObjs.length==0)return;
        int rows=0;
        try{
        for(int i=0; i<schemePartObjs.length; i++){
            
         SchemeSemesterBean bean=(SchemeSemesterBean) schemePartObjs[i];
         if(bean==null)return;
            rows+=DatabaseManager.deleteSemesterScheme(bean.getSchemeId(),bean.getSchemePart(),bean.getSchemeSemester());
            
           
            
        }
        if(rows>=1){
        JOptionPane.showMessageDialog(null,rows+"Record Deleted");
        getSchemeSemester();
        clear();
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error"+e.getMessage());
            
        }
          
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
      
   SchemeSemesterBean bean=(SchemeSemesterBean) SchemeSemesterList.getSelectedValue();
 if(bean==null)return;

 String remarks=RemarksTextArea.getText();
 String semester=this.SemesterTextField.getText();
 
     try{
          int rows=DatabaseManager.updateSchemeSemester(bean.getSchemeId(),bean.getSchemePart(),semester,bean.getSchemeSemester(),remarks);
            if(rows>=1){
          clear();
              JOptionPane.showMessageDialog(this,rows+"Data Updated");
 
 
 }
 }catch(Exception e){
 
 JOptionPane.showMessageDialog(this,e.getMessage());
 e.printStackTrace();
}
       
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SchemeSemesterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchemeSemesterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchemeSemesterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchemeSemesterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchemeSemesterFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JComboBox DeptComboBox;
    private javax.swing.JLabel DeptLabel;
    private javax.swing.JComboBox FacultyComboBox;
    private javax.swing.JLabel FacultyyLabel;
    private javax.swing.JComboBox ProgComboBox;
    private javax.swing.JLabel ProgIdLabel;
    private javax.swing.JLabel ProgramLabel;
    private javax.swing.JLabel ProgramLabel1;
    private javax.swing.JTextArea RemarksTextArea;
    private javax.swing.JComboBox SchemePartComboBox;
    private javax.swing.JList SchemeSemesterList;
    private javax.swing.JComboBox SchemeYearComboBox;
    private javax.swing.JTextField SemesterTextField;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
