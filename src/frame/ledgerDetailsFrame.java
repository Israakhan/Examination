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
import javax.swing.JOptionPane;


public class ledgerDetailsFrame extends javax.swing.JFrame {
    
    
    
    
    
    
    
    

    public ledgerDetailsFrame() {
        initComponents();
        getFaculty();
    }

  
    
     private void getFaculty(){
        try{
            java.util.Vector v=DatabaseManager.getFaculty();
            FacultyComboBox.removeAllItems();
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
            BatchComboBox.removeAllItems();
        java.util.Vector v=DatabaseManager.getBatch(bean.getProgId());
        for(int i=0; i<v.size(); i++){
            BatchComboBox.addItem(v.elementAt(i));
            
        
        }
        
        }catch(Exception e){e.printStackTrace();}    
        
 } 
    
     
 private void getPart(){
   BatchBean bean=(BatchBean) BatchComboBox.getSelectedItem();
    if(bean==null)return;
   ShiftTextField.setText(bean.getShift());
   GroupTextField.setText(bean.getGroupDesc());
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        PartComboBox = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        GroupTextField = new javax.swing.JTextField();
        CourseNoTextField1 = new javax.swing.JTextField();
        CourseNoTextField2 = new javax.swing.JTextField();
        CourseNoTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        CourseNoTextField4 = new javax.swing.JTextField();
        CourseNoTextField5 = new javax.swing.JTextField();
        FacultyyLabel = new javax.swing.JLabel();
        FacultyComboBox = new javax.swing.JComboBox();
        DeptLabel = new javax.swing.JLabel();
        DeptComboBox = new javax.swing.JComboBox();
        ProgIdLabel = new javax.swing.JLabel();
        ProgComboBox = new javax.swing.JComboBox();
        DeptLabel1 = new javax.swing.JLabel();
        BatchComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CourseNoTextField6 = new javax.swing.JTextField();
        ShiftTextField = new javax.swing.JTextField();
        ExamYearComboBox = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        PartComboBox1 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        GroupTextField1 = new javax.swing.JTextField();
        CourseNoTextField7 = new javax.swing.JTextField();
        CourseNoTextField8 = new javax.swing.JTextField();
        CourseNoTextField9 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        CourseNoTextField10 = new javax.swing.JTextField();
        CourseNoTextField11 = new javax.swing.JTextField();
        FacultyyLabel1 = new javax.swing.JLabel();
        FacultyComboBox1 = new javax.swing.JComboBox();
        DeptLabel2 = new javax.swing.JLabel();
        DeptComboBox1 = new javax.swing.JComboBox();
        ProgIdLabel1 = new javax.swing.JLabel();
        ProgComboBox1 = new javax.swing.JComboBox();
        DeptLabel3 = new javax.swing.JLabel();
        BatchComboBox1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        CourseNoTextField12 = new javax.swing.JTextField();
        ShiftTextField1 = new javax.swing.JTextField();
        ExamYearComboBox1 = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        FacultyyLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(180, 630, 360, 39);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Group");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 220, 90, 17);

        PartComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PartComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(PartComboBox);
        PartComboBox.setBounds(180, 310, 360, 43);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(180, 470, 360, 43);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(180, 530, 360, 43);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(180, 580, 360, 43);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Scheme Id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 420, 90, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Scheme Part");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 480, 110, 31);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Ac Id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 530, 60, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Roll Number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 570, 100, 31);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Course Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 690, 110, 31);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Marks Obtain");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 740, 120, 31);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Semester");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 630, 80, 31);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Grade");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 790, 70, 31);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Remarks");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(80, 920, 90, 65);
        getContentPane().add(GroupTextField);
        GroupTextField.setBounds(420, 240, 120, 40);
        getContentPane().add(CourseNoTextField1);
        CourseNoTextField1.setBounds(180, 880, 370, 40);

        CourseNoTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseNoTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(CourseNoTextField2);
        CourseNoTextField2.setBounds(180, 930, 370, 40);
        getContentPane().add(CourseNoTextField3);
        CourseNoTextField3.setBounds(180, 830, 370, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Minimum Marks");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 820, 120, 65);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Quality Points");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(60, 880, 110, 65);

        jToggleButton1.setText("clear");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(430, 980, 120, 30);

        jToggleButton2.setText("Add");
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(180, 980, 60, 30);

        jToggleButton3.setText("update");
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(250, 980, 80, 30);

        jToggleButton4.setText("Delete");
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(340, 980, 80, 30);
        getContentPane().add(CourseNoTextField4);
        CourseNoTextField4.setBounds(180, 780, 370, 40);
        getContentPane().add(CourseNoTextField5);
        CourseNoTextField5.setBounds(180, 730, 370, 40);

        FacultyyLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        FacultyyLabel.setText("Ledger List Detail");
        getContentPane().add(FacultyyLabel);
        FacultyyLabel.setBounds(220, 0, 240, 50);

        FacultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FacultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(FacultyComboBox);
        FacultyComboBox.setBounds(180, 60, 360, 40);

        DeptLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        DeptLabel.setText("Department");
        getContentPane().add(DeptLabel);
        DeptLabel.setBounds(60, 120, 66, 22);

        DeptComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DeptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(DeptComboBox);
        DeptComboBox.setBounds(180, 120, 360, 40);

        ProgIdLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ProgIdLabel.setText("Program");
        getContentPane().add(ProgIdLabel);
        ProgIdLabel.setBounds(70, 170, 89, 31);

        ProgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ProgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ProgComboBox);
        ProgComboBox.setBounds(180, 180, 360, 40);

        DeptLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        DeptLabel1.setText("Batch");
        getContentPane().add(DeptLabel1);
        DeptLabel1.setBounds(80, 240, 66, 22);

        BatchComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BatchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatchComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(BatchComboBox);
        BatchComboBox.setBounds(180, 240, 120, 40);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(660, 60, 160, 920);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(180, 410, 360, 43);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Shift");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(320, 200, 90, 50);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Part");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(80, 320, 90, 17);
        getContentPane().add(CourseNoTextField6);
        CourseNoTextField6.setBounds(180, 680, 370, 40);
        getContentPane().add(ShiftTextField);
        ShiftTextField.setBounds(310, 240, 80, 40);

        ExamYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ExamYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamYearComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ExamYearComboBox);
        ExamYearComboBox.setBounds(180, 360, 360, 43);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Exam Year");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(80, 370, 90, 17);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(180, 630, 360, 39);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Group");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(440, 220, 90, 17);

        PartComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PartComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(PartComboBox1);
        PartComboBox1.setBounds(180, 310, 360, 43);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox8);
        jComboBox8.setBounds(180, 470, 360, 43);

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox9);
        jComboBox9.setBounds(180, 530, 360, 43);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox10);
        jComboBox10.setBounds(180, 580, 360, 43);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Scheme Id");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 420, 90, 31);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Scheme Part");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(50, 480, 110, 31);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Ac Id");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(100, 530, 60, 31);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Roll Number");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(50, 570, 100, 31);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Course Number");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(40, 690, 110, 31);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Marks Obtain");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(60, 740, 120, 31);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Semester");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(70, 630, 80, 31);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Grade");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(110, 790, 70, 31);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Remarks");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(80, 920, 90, 65);
        getContentPane().add(GroupTextField1);
        GroupTextField1.setBounds(420, 240, 120, 40);
        getContentPane().add(CourseNoTextField7);
        CourseNoTextField7.setBounds(180, 880, 370, 40);

        CourseNoTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseNoTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(CourseNoTextField8);
        CourseNoTextField8.setBounds(180, 930, 370, 40);
        getContentPane().add(CourseNoTextField9);
        CourseNoTextField9.setBounds(180, 830, 370, 40);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Minimum Marks");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(50, 820, 120, 65);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Quality Points");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(60, 880, 110, 65);

        jToggleButton5.setText("clear");
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(430, 980, 120, 30);

        jToggleButton6.setText("Add");
        getContentPane().add(jToggleButton6);
        jToggleButton6.setBounds(180, 980, 60, 30);

        jToggleButton7.setText("update");
        getContentPane().add(jToggleButton7);
        jToggleButton7.setBounds(250, 980, 80, 30);

        jToggleButton8.setText("Delete");
        getContentPane().add(jToggleButton8);
        jToggleButton8.setBounds(340, 980, 80, 30);
        getContentPane().add(CourseNoTextField10);
        CourseNoTextField10.setBounds(180, 780, 370, 40);
        getContentPane().add(CourseNoTextField11);
        CourseNoTextField11.setBounds(180, 730, 370, 40);

        FacultyyLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        FacultyyLabel1.setText("Faculty ");
        getContentPane().add(FacultyyLabel1);
        FacultyyLabel1.setBounds(90, 70, 157, 31);

        FacultyComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FacultyComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(FacultyComboBox1);
        FacultyComboBox1.setBounds(180, 60, 360, 40);

        DeptLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        DeptLabel2.setText("Department");
        getContentPane().add(DeptLabel2);
        DeptLabel2.setBounds(60, 120, 66, 22);

        DeptComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DeptComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(DeptComboBox1);
        DeptComboBox1.setBounds(180, 120, 360, 40);

        ProgIdLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ProgIdLabel1.setText("Program");
        getContentPane().add(ProgIdLabel1);
        ProgIdLabel1.setBounds(70, 170, 89, 31);

        ProgComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ProgComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(ProgComboBox1);
        ProgComboBox1.setBounds(180, 180, 360, 40);

        DeptLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        DeptLabel3.setText("Batch");
        getContentPane().add(DeptLabel3);
        DeptLabel3.setBounds(80, 240, 66, 22);

        BatchComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BatchComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatchComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(BatchComboBox1);
        BatchComboBox1.setBounds(180, 240, 120, 40);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(660, 60, 160, 920);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox11);
        jComboBox11.setBounds(180, 410, 360, 43);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Shift");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(320, 200, 90, 50);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Part");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(80, 320, 90, 17);
        getContentPane().add(CourseNoTextField12);
        CourseNoTextField12.setBounds(180, 680, 370, 40);
        getContentPane().add(ShiftTextField1);
        ShiftTextField1.setBounds(310, 240, 80, 40);

        ExamYearComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ExamYearComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamYearComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(ExamYearComboBox1);
        ExamYearComboBox1.setBounds(180, 360, 360, 43);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Exam Year");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(80, 370, 90, 17);

        FacultyyLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        FacultyyLabel2.setText("Faculty ");
        getContentPane().add(FacultyyLabel2);
        FacultyyLabel2.setBounds(90, 70, 157, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CourseNoTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseNoTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseNoTextField2ActionPerformed

    private void FacultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyComboBoxActionPerformed
        getDepartments();
    }//GEN-LAST:event_FacultyComboBoxActionPerformed

    private void DeptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptComboBoxActionPerformed
        getPrograms();
    }//GEN-LAST:event_DeptComboBoxActionPerformed

    private void ProgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgComboBoxActionPerformed
        getBatchYears();
    }//GEN-LAST:event_ProgComboBoxActionPerformed

    private void BatchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatchComboBoxActionPerformed
       getPart();
               
    }//GEN-LAST:event_BatchComboBoxActionPerformed

    private void PartComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartComboBoxActionPerformed
        getExamYear();
    }//GEN-LAST:event_PartComboBoxActionPerformed

    private void ExamYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamYearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExamYearComboBoxActionPerformed

    private void PartComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PartComboBox1ActionPerformed

    private void CourseNoTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseNoTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseNoTextField8ActionPerformed

    private void FacultyComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacultyComboBox1ActionPerformed

    private void DeptComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeptComboBox1ActionPerformed

    private void ProgComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProgComboBox1ActionPerformed

    private void BatchComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatchComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BatchComboBox1ActionPerformed

    private void ExamYearComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamYearComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExamYearComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ledgerDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ledgerDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ledgerDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ledgerDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ledgerDetailsFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BatchComboBox;
    private javax.swing.JComboBox BatchComboBox1;
    private javax.swing.JTextField CourseNoTextField1;
    private javax.swing.JTextField CourseNoTextField10;
    private javax.swing.JTextField CourseNoTextField11;
    private javax.swing.JTextField CourseNoTextField12;
    private javax.swing.JTextField CourseNoTextField2;
    private javax.swing.JTextField CourseNoTextField3;
    private javax.swing.JTextField CourseNoTextField4;
    private javax.swing.JTextField CourseNoTextField5;
    private javax.swing.JTextField CourseNoTextField6;
    private javax.swing.JTextField CourseNoTextField7;
    private javax.swing.JTextField CourseNoTextField8;
    private javax.swing.JTextField CourseNoTextField9;
    private javax.swing.JComboBox DeptComboBox;
    private javax.swing.JComboBox DeptComboBox1;
    private javax.swing.JLabel DeptLabel;
    private javax.swing.JLabel DeptLabel1;
    private javax.swing.JLabel DeptLabel2;
    private javax.swing.JLabel DeptLabel3;
    private javax.swing.JComboBox ExamYearComboBox;
    private javax.swing.JComboBox ExamYearComboBox1;
    private javax.swing.JComboBox FacultyComboBox;
    private javax.swing.JComboBox FacultyComboBox1;
    private javax.swing.JLabel FacultyyLabel;
    private javax.swing.JLabel FacultyyLabel1;
    private javax.swing.JLabel FacultyyLabel2;
    private javax.swing.JTextField GroupTextField;
    private javax.swing.JTextField GroupTextField1;
    private javax.swing.JComboBox PartComboBox;
    private javax.swing.JComboBox PartComboBox1;
    private javax.swing.JComboBox ProgComboBox;
    private javax.swing.JComboBox ProgComboBox1;
    private javax.swing.JLabel ProgIdLabel;
    private javax.swing.JLabel ProgIdLabel1;
    private javax.swing.JTextField ShiftTextField;
    private javax.swing.JTextField ShiftTextField1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    // End of variables declaration//GEN-END:variables
}
