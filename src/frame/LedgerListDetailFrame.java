/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import Bean.BatchBean;
import Bean.DatabaseManager;
import Bean.DepartmentBean;
import Bean.FacultyBean;
import Bean.LedgerListDetailBean;
import Bean.PartBean;
import Bean.ProgramBean;
import Bean.SeatListBean;
import Bean.SeatListDetailBean;
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Khan
 */
public class LedgerListDetailFrame extends javax.swing.JFrame {

    /**
     * Creates new form LedgerListDetailFrame
     */
    public LedgerListDetailFrame() {
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
        ProgComboBox.removeAllItems();
        for(int i=0; i<v.size(); i++){
        ProgComboBox.addItem(v.elementAt(i));
            
       
        }
        }catch(Exception e){e.printStackTrace();}
   }//getprogram
        
        
   
   
           
           
           
         
 private void   getBatchYears(){ 
       ProgramBean bean=(ProgramBean) ProgComboBox.getSelectedItem();
    if(bean==null) return;
        try{
        java.util.Vector v=DatabaseManager.getBatch(bean.getProgId());
      
                BatchYearComboBox.removeAllItems();
                for(int i=0; i<v.size(); i++){
                    BatchYearComboBox.addItem(v.elementAt(i));
                }
                
            
            
        }catch(Exception e){e.printStackTrace();}    
 }
 
 
 
 
 private void getPart(){
   BatchBean bean=(BatchBean) BatchYearComboBox.getSelectedItem();
    if(bean==null)return;
   ShiftTextField.setText(bean.getShift());
   GroupDescTextField.setText(bean.getGroupDesc());
   try{
     java.util.Vector v=  DatabaseManager.getPart(bean.getBatchId());
     PartComboBox.removeAllItems();
     for(int i=0; i<v.size(); i++){
         PartComboBox.addItem(v.elementAt(i));
     
     }
     
   }catch(Exception e){e.printStackTrace();}
 
 
 
 
 }
 
    public void getExamYear(){
     
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
 
 
 
   private void getLedgerListDetail(){
    SeatListBean bean=(SeatListBean)ExamYearComboBox.getSelectedItem();
      if(bean==null)return;
      try{
             java.util.Vector v = DatabaseManager.getLedgerListDetail(bean.getSlId());
              LedgerrollnoList.setListData(v);
                    
      }catch(Exception e){
          javax.swing.JOptionPane.showMessageDialog(this,"Error: "+e);
          e.printStackTrace();
      }
      
  }     
       

        
    public void pasteLedgerListDetail(){
   SeatListBean bean=(SeatListBean)ExamYearComboBox.getSelectedItem();
    if(bean==null)return;
        
        String remarks=RemarksTextArea.getText();
        try{
             int rows =DatabaseManager.getLedgerListPaste(bean.getSlId());
             
                getLedgerListDetail();
                 JOptionPane.showMessageDialog(this,rows+"Record Paste Successfully");
           
        }
        catch(Exception e){e.printStackTrace();}
     
    } 


 
    private void clear(){
        RollnoTextField.setText("");
        RemarksTextArea.setText("");
 
 
}
 




 

 
 
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ClearButton1 = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RemarksTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PasteButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        LedgerrollnoList = new javax.swing.JList();
        ShiftTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FacComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        DeptComboBox = new javax.swing.JComboBox();
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
        AddButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ledger List Detail");

        ClearButton1.setText("Clear");
        ClearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButton1ActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        RemarksTextArea.setColumns(20);
        RemarksTextArea.setRows(5);
        jScrollPane1.setViewportView(RemarksTextArea);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Remarks");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Roll number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Exam Year");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Part");

        PasteButton.setText("PASTE");
        PasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteButtonActionPerformed(evt);
            }
        });

        LedgerrollnoList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        LedgerrollnoList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LedgerrollnoListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(LedgerrollnoList);

        ShiftTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShiftTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Faculty");

        FacComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FacComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Department");

        DeptComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DeptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptComboBoxActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Program");

        ProgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ProgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgComboBoxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Batch");

        BatchYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BatchYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatchYearComboBoxActionPerformed(evt);
            }
        });

        GroupDescTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupDescTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Shift");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Group Desc");

        PartComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PartComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartComboBoxActionPerformed(evt);
            }
        });

        ExamYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ExamYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamYearComboBoxActionPerformed(evt);
            }
        });

        TypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeTextFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Type");

        AddButton1.setText("Add");
        AddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Roll Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(ClearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(358, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 21, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FacComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(DeptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(130, 130, 130)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(240, 240, 240)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ProgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel11)
                            .addGap(20, 20, 20)
                            .addComponent(BatchYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(ShiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(GroupDescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel4)
                            .addGap(21, 21, 21)
                            .addComponent(PartComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(ExamYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(RollnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(TypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(PasteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(FacComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addComponent(DeptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ProgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel12))))
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel11))
                                .addComponent(BatchYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ShiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GroupDescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel4))
                                .addComponent(PartComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addComponent(ExamYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RollnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(TypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(PasteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 97, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearButton1ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       
        LedgerListDetailBean bean=(LedgerListDetailBean) LedgerrollnoList.getSelectedValue();
        if(bean==null)return;
            
        String remarks=RemarksTextArea.getText();

        try{
            int rows = DatabaseManager.updateLedgerListDetail(bean.getSlId(),bean.getRollNo(),remarks);
            if(rows>=1){
                getLedgerListDetail();
                clear();
                JOptionPane.showMessageDialog(this,rows+"Records Updated");
                
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       
              Object rollnoObj[]=LedgerrollnoList.getSelectedValues();
        if(rollnoObj==null|| rollnoObj.length==0)return;
        int rows=0;
        for(int i=0; i<rollnoObj.length; i++){
            LedgerListDetailBean bean=(LedgerListDetailBean)rollnoObj[i];
            if(bean==null)return;
            try{
                rows+=DatabaseManager.deleteLedgerListDetail(bean.getSlId(),bean.getRollNo());

            }catch(Exception e){e.printStackTrace();}
        }

        JOptionPane.showMessageDialog(this,rows+"Records Deleted");
       getLedgerListDetail();

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void PasteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteButtonActionPerformed
        pasteLedgerListDetail();

    }//GEN-LAST:event_PasteButtonActionPerformed

    private void LedgerrollnoListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LedgerrollnoListValueChanged
        LedgerListDetailBean bean=(LedgerListDetailBean) LedgerrollnoList.getSelectedValue();
        if(bean==null)return;
       RollnoTextField.setText(bean.getRollNo());
       RemarksTextArea.setText(bean.getRemarks());
       
       
       
      
        

    }//GEN-LAST:event_LedgerrollnoListValueChanged

    private void ShiftTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShiftTextFieldActionPerformed

    }//GEN-LAST:event_ShiftTextFieldActionPerformed

    private void FacComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacComboBoxActionPerformed
        getDepartments();
    }//GEN-LAST:event_FacComboBoxActionPerformed

    private void DeptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptComboBoxActionPerformed
        getPrograms();
    }//GEN-LAST:event_DeptComboBoxActionPerformed

    private void ProgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgComboBoxActionPerformed
        getBatchYears();
    }//GEN-LAST:event_ProgComboBoxActionPerformed

    private void BatchYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatchYearComboBoxActionPerformed
getPart();   
    
    
            
    }//GEN-LAST:event_BatchYearComboBoxActionPerformed

    private void GroupDescTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupDescTextFieldActionPerformed

    }//GEN-LAST:event_GroupDescTextFieldActionPerformed

    private void PartComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartComboBoxActionPerformed
       getExamYear();
    }//GEN-LAST:event_PartComboBoxActionPerformed

    private void ExamYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamYearComboBoxActionPerformed

        
      SeatListBean Seatbean=(SeatListBean) ExamYearComboBox.getSelectedItem();
        if(Seatbean==null)return;
 

        TypeTextField.setText(Seatbean.getType());
        
        
        

        getLedgerListDetail();
    }//GEN-LAST:event_ExamYearComboBoxActionPerformed

    private void TypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeTextFieldActionPerformed

    }//GEN-LAST:event_TypeTextFieldActionPerformed

    private void AddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton1ActionPerformed
        SeatListBean bean=(SeatListBean) ExamYearComboBox.getSelectedItem();
        if(bean==null)return;

        String rollNo= RollnoTextField.getText();
        String remarks=RemarksTextArea.getText();

        try{
            int rows = DatabaseManager.addLedgerListDetail(bean.getSlId(),rollNo,remarks);
            if(rows>=1){

               clear();
                JOptionPane.showMessageDialog(this,rows+"Records Added");
                getLedgerListDetail();
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_AddButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       hide();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(LedgerListDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LedgerListDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LedgerListDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LedgerListDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LedgerListDetailFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton1;
    private javax.swing.JComboBox BatchYearComboBox;
    private javax.swing.JButton ClearButton1;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox DeptComboBox;
    private javax.swing.JComboBox ExamYearComboBox;
    private javax.swing.JComboBox FacComboBox;
    private javax.swing.JTextField GroupDescTextField;
    private javax.swing.JList LedgerrollnoList;
    private javax.swing.JComboBox PartComboBox;
    private javax.swing.JButton PasteButton;
    private javax.swing.JComboBox ProgComboBox;
    private javax.swing.JTextArea RemarksTextArea;
    private javax.swing.JTextField RollnoTextField;
    private javax.swing.JTextField ShiftTextField;
    private javax.swing.JTextField TypeTextField;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
