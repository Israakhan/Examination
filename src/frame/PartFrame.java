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
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Khan
 */
public class PartFrame extends javax.swing.JFrame {

    /**
     * Creates new form PartFrame
     */
    public PartFrame() {
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
    this.GroupTextField.setText(bean.getGroupDesc());
    
    
        }
  
  
    
    
    
    
    
    
    
    private void getPart(){
       BatchBean bean=(BatchBean)BatchYearComboBox.getSelectedItem();
       if(bean==null)return;
        
        try{
        
           java.util.Vector v =DatabaseManager.getPart(bean.getBatchId());
           PartList.setListData(v);
        
        }
        catch(Exception e){e.printStackTrace();}
    
    
    }
    
    
    
    
    
    
    
    
    
 
  

    
    
    private void clear(){
    
      PartYearTextField.setText("");  
      RemarksTextArea.setText("");
    
    
    }
    
             
             
          
             
           
    
    

    
    
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Part = new javax.swing.JLabel();
        PartYearLabel = new javax.swing.JLabel();
        RemarksLabel = new javax.swing.JLabel();
        PartYearTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        RemarksTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        PartList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        FacComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        DepartmentComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        ProgComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        BatchYearComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        ShiftTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        GroupTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ClearrButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        partComboBox = new javax.swing.JComboBox();

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Part.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Part.setText("Part");

        PartYearLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PartYearLabel.setText("Part Year");

        RemarksLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RemarksLabel.setText("Remarks");

        RemarksTextArea.setColumns(20);
        RemarksTextArea.setRows(5);
        jScrollPane1.setViewportView(RemarksTextArea);

        PartList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                PartListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(PartList);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Faculty");

        FacComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FacComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Department");

        DepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DepartmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Program");

        ProgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ProgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Batch");

        BatchYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BatchYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatchYearComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Shift");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Group");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ClearrButton.setText("Clear");
        ClearrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearrButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Parts");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Part ");

        partComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(Part, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FacComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BatchYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ShiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(GroupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(partComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(PartYearLabel)
                                        .addGap(16, 16, 16)
                                        .addComponent(PartYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(RemarksLabel))))
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClearrButton)
                        .addGap(94, 94, 94)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Part, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FacComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(DepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ProgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BatchYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(ShiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(GroupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(PartYearLabel))
                            .addComponent(PartYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(RemarksLabel)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(partComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel4)
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel5)
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel8))))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(ClearrButton))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
   
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
  // addPartYears();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void PartListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_PartListValueChanged
        PartBean bean=(PartBean) PartList.getSelectedValue();
        if(bean==null)return;
                
         this.partComboBox.setSelectedItem(""+bean.getPart());
          
          PartYearTextField.setText(""+bean.getPartYear());
          RemarksTextArea.setText(bean.getRemarks());
          
    }//GEN-LAST:event_PartListValueChanged

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
            hide();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void FacComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacComboBoxActionPerformed
     getDepartments();
    }//GEN-LAST:event_FacComboBoxActionPerformed

    private void DepartmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentComboBoxActionPerformed
      getPrograms();
    }//GEN-LAST:event_DepartmentComboBoxActionPerformed

    private void BatchYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatchYearComboBoxActionPerformed
   getPart();
   getShiftAndGroup();
   
    }//GEN-LAST:event_BatchYearComboBoxActionPerformed

    private void ProgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgComboBoxActionPerformed
      getBatchYears();
    }//GEN-LAST:event_ProgComboBoxActionPerformed

    private void ClearrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearrButtonActionPerformed
       clear();
    }//GEN-LAST:event_ClearrButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
                
        Object partObj[]= PartList.getSelectedValues();
        if(partObj==null|| partObj.length==0)return;
        int rows=0;
        for(int i=0; i<partObj.length; i++){
         PartBean bean=(PartBean)partObj[i];
         if(bean==null)continue;
       
         try{
          rows+=DatabaseManager.deletePart(bean.getBatchId(),bean.getPart());
         
     ;    }catch(Exception e){e.printStackTrace();}
        
        }//forloop
        
        
        
             
        
   
         JOptionPane.showMessageDialog(this,rows+"Records Deleted");
          getPart();
         
        
        
        
        
   
            
        
      
                    
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        BatchBean bean=(BatchBean)BatchYearComboBox.getSelectedItem();
        if(bean==null)return;
        
        String part=(String)partComboBox.getSelectedItem();
        
        String partYear=PartYearTextField.getText(); 
        String remarks=RemarksTextArea.getText();
        
        
        
             try{
            int rows=DatabaseManager.addPart(part,bean.getBatchId(),partYear,remarks);
            
                if(rows>=1){
                getPart();
                    clear();
                    JOptionPane.showMessageDialog(this,rows+"Records Added");
                }
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                
                }
             
    
         
        
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

                    
     PartBean bean=(PartBean) this.PartList.getSelectedValue();
      if(bean==null)return;
      
      
      String part=(String)this.partComboBox.getSelectedItem();
     
    
        String partYear=PartYearTextField.getText();
        String remarks=RemarksTextArea.getText();
        try{
            int rows=DatabaseManager.updatePart(bean.getPart(),bean.getBatchId(),part,partYear,remarks);
            
                if(rows>=1){
                getPart();
                    clear();
                    JOptionPane.showMessageDialog(this,rows+"Records updated");
                }
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                
                }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      hide();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox BatchYearComboBox;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton ClearrButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox DepartmentComboBox;
    private javax.swing.JComboBox FacComboBox;
    private javax.swing.JTextField GroupTextField;
    private javax.swing.JLabel Part;
    private javax.swing.JList PartList;
    private javax.swing.JLabel PartYearLabel;
    private javax.swing.JTextField PartYearTextField;
    private javax.swing.JComboBox ProgComboBox;
    private javax.swing.JLabel RemarksLabel;
    private javax.swing.JTextArea RemarksTextArea;
    private javax.swing.JTextField ShiftTextField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox partComboBox;
    // End of variables declaration//GEN-END:variables
}
