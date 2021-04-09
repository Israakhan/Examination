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
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Khan
 */
public class SchemePartFrame extends javax.swing.JFrame {

    /**
     * Creates new form SchemePartFrame
     */
    public SchemePartFrame() {
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
      SchemePartList.setListData(v);
     
  
  
  }
  catch(Exception e){e.printStackTrace();}
 
 
 
 
 }
 private void clear(){
 
        SchemePartTextField.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        RemarksTextArea = new javax.swing.JTextArea();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SchemePartList = new javax.swing.JList();
        SchemePartTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ProgramLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ProgramLabel.setText("Scheme Part");
        getContentPane().add(ProgramLabel);
        ProgramLabel.setBounds(170, 0, 290, 82);

        FacultyyLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        FacultyyLabel.setText("Faculty ");
        getContentPane().add(FacultyyLabel);
        FacultyyLabel.setBounds(90, 80, 157, 31);

        FacultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FacultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(FacultyComboBox);
        FacultyComboBox.setBounds(160, 80, 310, 40);

        DeptLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        DeptLabel.setText("Department");
        getContentPane().add(DeptLabel);
        DeptLabel.setBounds(60, 140, 66, 22);

        DeptComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DeptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(DeptComboBox);
        DeptComboBox.setBounds(160, 140, 310, 40);

        ProgIdLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ProgIdLabel.setText("Program");
        getContentPane().add(ProgIdLabel);
        ProgIdLabel.setBounds(70, 190, 89, 31);

        ProgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ProgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ProgComboBox);
        ProgComboBox.setBounds(160, 190, 310, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Scheme Year");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 250, 90, 20);

        SchemeYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SchemeYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchemeYearComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SchemeYearComboBox);
        SchemeYearComboBox.setBounds(160, 240, 310, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Remarks");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 360, 70, 17);

        RemarksTextArea.setColumns(20);
        RemarksTextArea.setRows(5);
        jScrollPane1.setViewportView(RemarksTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 390, 310, 96);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(160, 490, 51, 40);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(220, 490, 80, 40);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton);
        UpdateButton.setBounds(310, 490, 70, 40);

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton);
        ClearButton.setBounds(390, 490, 80, 40);

        jButton5.setText("Back");
        getContentPane().add(jButton5);
        jButton5.setBounds(540, 490, 180, 40);

        SchemePartList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SchemePartListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(SchemePartList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(540, 80, 180, 410);
        getContentPane().add(SchemePartTextField);
        SchemePartTextField.setBounds(160, 290, 310, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Scheme Part");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 300, 100, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Scheme Part");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(570, 40, 120, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FacultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyComboBoxActionPerformed
        getDepartments();
    }//GEN-LAST:event_FacultyComboBoxActionPerformed

    private void DeptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptComboBoxActionPerformed
        getPrograms();

    }//GEN-LAST:event_DeptComboBoxActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

    SchemeBean bean=(SchemeBean) SchemeYearComboBox.getSelectedItem();    
        if(bean==null)return;
 
 String schemePart=SchemePartTextField.getText();      
 String remarks=RemarksTextArea.getText();
 
 
 
 
     try{
          int rows=DatabaseManager.addSchemePart(bean.getSchemeId(),schemePart,remarks);
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

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
   Object schemePartObjs[]=SchemePartList.getSelectedValues();
        
        if(schemePartObjs==null|| schemePartObjs.length==0)return;
        int rows=0;
        try{
        for(int i=0; i<schemePartObjs.length; i++){
            
         SchemePartBean bean=(SchemePartBean) schemePartObjs[i];
         if(bean==null)return;
            rows+=DatabaseManager.deleteSchemePart(bean.getSchemeId(),bean.getSchemePart());
            
           
            
        }
        if(rows>=1){
        JOptionPane.showMessageDialog(null,rows+"Record Deleted");
        getSchemePart();
        clear();
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error"+e.getMessage());
            
        }
          
        
      
        
        
        
        
        
        

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
    SchemePartBean bean=(SchemePartBean) SchemePartList.getSelectedValue();
 if(bean==null)return;
 String schemePart=SchemePartTextField.getText();
 String remarks=RemarksTextArea.getText();

 
 
 
 
     try{
          int rows=DatabaseManager.updateSchemePart(bean.getSchemeId(),schemePart,remarks);
            if(rows>=1){
          clear();
              JOptionPane.showMessageDialog(this,rows+"Data Updated");
 
 
 }
 }catch(Exception e){
 
 JOptionPane.showMessageDialog(this,e.getMessage());
 e.printStackTrace();
}
        
        
        
        
        
        
        
        
        
        
        
     

    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
            clear();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void ProgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgComboBoxActionPerformed
   getScheme();
    }//GEN-LAST:event_ProgComboBoxActionPerformed

    private void SchemeYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchemeYearComboBoxActionPerformed
      getSchemePart();
    }//GEN-LAST:event_SchemeYearComboBoxActionPerformed

    private void SchemePartListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SchemePartListValueChanged
      SchemePartBean bean=(SchemePartBean) SchemePartList.getSelectedValue();
        if(bean==null)return;
        
                    SchemePartTextField.setText(""+bean.getSchemePart());
                    RemarksTextArea.setText(bean.getRemarks());
                    
        
                
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_SchemePartListValueChanged

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
            java.util.logging.Logger.getLogger(SchemePartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchemePartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchemePartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchemePartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchemePartFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox DeptComboBox;
    private javax.swing.JLabel DeptLabel;
    private javax.swing.JComboBox FacComboBox;
    private javax.swing.JComboBox FacComboBox1;
    private javax.swing.JComboBox FacComboBox2;
    private javax.swing.JComboBox FacComboBox3;
    private javax.swing.JComboBox FacComboBox4;
    private javax.swing.JComboBox FacultyComboBox;
    private javax.swing.JLabel FacultyyLabel;
    private javax.swing.JComboBox ProgComboBox;
    private javax.swing.JLabel ProgIdLabel;
    private javax.swing.JLabel ProgramLabel;
    private javax.swing.JTextArea RemarksTextArea;
    private javax.swing.JList SchemePartList;
    private javax.swing.JTextField SchemePartTextField;
    private javax.swing.JComboBox SchemeYearComboBox;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
