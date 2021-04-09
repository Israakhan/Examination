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
import Bean.SchemeDetailBean;
import Bean.SchemePartBean;
import Bean.SchemeSemesterBean;
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Khan
 */
public class SchemeSemesterDetailFrame extends javax.swing.JFrame {

    /**
     * Creates new form SchemeSemesterDetailFrame
     */
    public SchemeSemesterDetailFrame() {
        initComponents();
                getFaculty();
    }

    
         private void getFaculty(){
        try{
            java.util.Vector v=DatabaseManager.getFaculty();
           FacComboBox .removeAllItems();
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
         
      SemesterComboBox.removeAllItems();
        for(int i=0; i<v.size(); i++){
            SemesterComboBox.addItem(v.elementAt(i));
            
        
        }
     
  }
  catch(Exception e){e.printStackTrace();}
 
 }
    
    
   public void getSchemeDetail(){
  SchemeSemesterBean bean=(SchemeSemesterBean) SemesterComboBox.getSelectedItem(); 
  if(bean==null)return;
  try{
      java.util.Vector v=DatabaseManager.getSchemeDetail(bean.getSchemeId(),bean.getSchemePart(),bean.getSchemeSemester());
    
        CourseTitleList.setListData(v);
  
  
  }
  catch(Exception e){e.printStackTrace();}
 
 
 
 
 }   
    
    
    private void clear(){
        
       CourseNoTextField.setText("");
        CourseTitleTextField.setText("");
         CreditHoursTextField.setText("");
        MaxMarksTextField.setText("");
        IscreditableComboBox.setSelectedItem("");
       SubjectTypeComboBox.setSelectedItem("");
        
        
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProgramLabel = new javax.swing.JLabel();
        FacultyyLabel = new javax.swing.JLabel();
        FacComboBox = new javax.swing.JComboBox();
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
        CourseTitleList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SemesterComboBox = new javax.swing.JComboBox();
        SchemePartComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        CourseNoTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CourseTitleTextField = new javax.swing.JTextField();
        CreditHoursTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MaxMarksTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        IscreditableComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        SubjectTypeComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ProgramLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ProgramLabel.setText("Scheme Detail");
        getContentPane().add(ProgramLabel);
        ProgramLabel.setBounds(150, 0, 330, 82);

        FacultyyLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        FacultyyLabel.setText("Faculty ");
        getContentPane().add(FacultyyLabel);
        FacultyyLabel.setBounds(90, 80, 157, 31);

        FacComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FacComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(FacComboBox);
        FacComboBox.setBounds(160, 80, 320, 40);

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
        DeptComboBox.setBounds(160, 140, 320, 40);

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
        ProgComboBox.setBounds(160, 190, 320, 40);

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
        SchemeYearComboBox.setBounds(160, 240, 320, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Remarks");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 560, 70, 17);

        RemarksTextArea.setColumns(20);
        RemarksTextArea.setRows(5);
        jScrollPane1.setViewportView(RemarksTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 590, 310, 96);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(160, 690, 60, 40);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(230, 690, 90, 40);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton);
        UpdateButton.setBounds(320, 690, 70, 40);

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton);
        ClearButton.setBounds(390, 690, 80, 40);

        jButton5.setText("Back");
        getContentPane().add(jButton5);
        jButton5.setBounds(540, 690, 220, 40);

        CourseTitleList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                CourseTitleListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(CourseTitleList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(540, 80, 220, 610);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Course Title");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 420, 110, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Course Title");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(570, 40, 170, 22);

        SemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SemesterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemesterComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SemesterComboBox);
        SemesterComboBox.setBounds(160, 355, 320, 40);

        SchemePartComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SchemePartComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchemePartComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SchemePartComboBox);
        SchemePartComboBox.setBounds(160, 300, 320, 39);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Scheme Part");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 300, 100, 17);
        getContentPane().add(CourseNoTextField);
        CourseNoTextField.setBounds(160, 410, 100, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Semester");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 360, 100, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Maximum Marks");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 470, 120, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Course Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 420, 110, 17);
        getContentPane().add(CourseTitleTextField);
        CourseTitleTextField.setBounds(380, 410, 100, 40);
        getContentPane().add(CreditHoursTextField);
        CreditHoursTextField.setBounds(160, 460, 100, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Subject Type");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 520, 110, 17);
        getContentPane().add(MaxMarksTextField);
        MaxMarksTextField.setBounds(380, 460, 100, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Credit Hours");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 470, 110, 17);

        IscreditableComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N" }));
        getContentPane().add(IscreditableComboBox);
        IscreditableComboBox.setBounds(160, 510, 100, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Is Creditable");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 520, 110, 17);

        SubjectTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "Elective" }));
        getContentPane().add(SubjectTypeComboBox);
        SubjectTypeComboBox.setBounds(380, 510, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FacComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacComboBoxActionPerformed
       getDepartments();
    }//GEN-LAST:event_FacComboBoxActionPerformed

    private void DeptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptComboBoxActionPerformed
       getPrograms();
    }//GEN-LAST:event_DeptComboBoxActionPerformed

    private void ProgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgComboBoxActionPerformed
     getScheme();
    }//GEN-LAST:event_ProgComboBoxActionPerformed

    private void SchemeYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchemeYearComboBoxActionPerformed
        getSchemePart();
    }//GEN-LAST:event_SchemeYearComboBoxActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        SchemeSemesterBean bean=(SchemeSemesterBean) SemesterComboBox.getSelectedItem();
        if(bean==null)return;
             
      String courseNo=CourseNoTextField.getText();
      String courseTitle=CourseTitleTextField.getText();
      String creditHours=CreditHoursTextField.getText();
      String maxMarks=MaxMarksTextField.getText();
      String isCreditable=(String)IscreditableComboBox.getSelectedItem();
      String subjectType=(String)SubjectTypeComboBox.getSelectedItem();
         
        
        String remarks=RemarksTextArea.getText();

        try{
            int rows=DatabaseManager.addSchemeDetail(bean.getSchemeId(),bean.getSchemePart(),bean.getSchemeSemester(),courseNo,courseTitle,creditHours,maxMarks,isCreditable,subjectType,remarks);
            if(rows>=1){
                getSchemeDetail();
                clear();
                JOptionPane.showMessageDialog(this,rows+"Data Added");

            }
        }catch(Exception e){

            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        Object courseTitleObjs[]=CourseTitleList.getSelectedValues();

        if(courseTitleObjs==null|| courseTitleObjs.length==0)return;
        int rows=0;
        try{
            for(int i=0; i<courseTitleObjs.length; i++){

                SchemeDetailBean bean=(SchemeDetailBean)courseTitleObjs[i];
                if(bean==null)return;
                rows+=DatabaseManager.deleteSchemeDetail(bean.getSchemeId(),bean.getSchemePart(),bean.getSemester(),bean.getCourseTitle());

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
        SchemeDetailBean bean=(SchemeDetailBean) CourseTitleList.getSelectedValue();
        if(bean==null)return;
                
      String courseNo=CourseNoTextField.getText();
      String courseTitle=CourseTitleTextField.getText();
      String creditHours=CreditHoursTextField.getText();
      String maxMarks=MaxMarksTextField.getText();
      String isCreditable=(String)IscreditableComboBox.getSelectedItem();
      String subjectType=(String)SubjectTypeComboBox.getSelectedItem();
      String remarks=RemarksTextArea.getText();    
        
        
        try{
            int rows=DatabaseManager.updateSchemeDetail(bean.getSchemeId(),bean.getSchemePart(),bean.getSemester(),bean.getCourseNo(),courseNo,courseTitle,creditHours,maxMarks,isCreditable,subjectType,remarks);
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
      //  clear();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void CourseTitleListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_CourseTitleListValueChanged
        SchemeDetailBean bean=(SchemeDetailBean)CourseTitleList.getSelectedValue();
        if(bean==null)return;

       CourseNoTextField.setText(""+bean.getCourseNo());
        CourseTitleTextField.setText(bean.getCourseTitle());
         CreditHoursTextField.setText(""+bean.getCrHours());
        MaxMarksTextField.setText(""+bean.getMaxMarks());
        IscreditableComboBox.setSelectedItem(bean.getIsCreditable());
       SubjectTypeComboBox.setSelectedItem(bean.getSubjectType());

    }//GEN-LAST:event_CourseTitleListValueChanged

    private void SchemePartComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchemePartComboBoxActionPerformed
    getSchemeSemester();
    }//GEN-LAST:event_SchemePartComboBoxActionPerformed

    private void SemesterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemesterComboBoxActionPerformed
      getSchemeDetail();
    }//GEN-LAST:event_SemesterComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SchemeSemesterDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchemeSemesterDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchemeSemesterDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchemeSemesterDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchemeSemesterDetailFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextField CourseNoTextField;
    private javax.swing.JList CourseTitleList;
    private javax.swing.JTextField CourseTitleTextField;
    private javax.swing.JTextField CreditHoursTextField;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox DeptComboBox;
    private javax.swing.JLabel DeptLabel;
    private javax.swing.JComboBox FacComboBox;
    private javax.swing.JLabel FacultyyLabel;
    private javax.swing.JComboBox IscreditableComboBox;
    private javax.swing.JTextField MaxMarksTextField;
    private javax.swing.JComboBox ProgComboBox;
    private javax.swing.JLabel ProgIdLabel;
    private javax.swing.JLabel ProgramLabel;
    private javax.swing.JTextArea RemarksTextArea;
    private javax.swing.JComboBox SchemePartComboBox;
    private javax.swing.JComboBox SchemeYearComboBox;
    private javax.swing.JComboBox SemesterComboBox;
    private javax.swing.JComboBox SubjectTypeComboBox;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
