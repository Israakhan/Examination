
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
import java.sql.*;
import java.util.*;
public class DatabaseManager {
    
    private static Connection con;
    static{ try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:Examination");
    }catch(Exception e){
             e.printStackTrace();
         }//catchF
        
    }//static
   public static Vector getFaculty()throws Exception {
       String query="Select Fac_id,Fac_name,remarks from Faculty" ;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next()){
                    FacultyBean bean=new FacultyBean();
                    bean.setFacId(result.getInt("Fac_id"));
                    bean.setFacName(result.getString("Fac_name"));
                    bean.setRemarks(result.getString("remarks"));
                    v.addElement(bean);
            }//while
            return v;
            }finally{
            if(result!=null) result.close();
            if(st!=null) st.close();
               
        }//finally
        }//end method
   
  
     public static Vector getDepartment(int facId)throws Exception {
       String query="Select * from Department where Fac_id="+facId;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next()){
                    DepartmentBean bean=new DepartmentBean();
                    bean.setDeptId(result.getInt("Dept_id"));
                    bean.setFacId(result.getInt("Fac_id"));
                    bean.setDeptName(result.getString("Dept_name"));
                    bean.setRemarks(result.getString("remarks"));
                     v.addElement(bean);
            }//while
            
           
            return v;
            }finally{
            if(result!=null) result.close();
            if(st!=null) st.close();
               
        }//finally
        
        
        
        
        
        
        }//end method
     
     
     
       public static Vector getProgram(int deptId)throws Exception {
       String query="Select * from Program where Dept_id="+deptId;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next()){
                    ProgramBean bean=new ProgramBean();
                    bean.setProgId(result.getInt("Prog_id"));
                    bean.setDeptId(result.getInt("Dept_id"));
                    bean.setProgName(result.getString("Prog_name"));
                    bean.setDurationInSem(result.getInt("Duration_in_sem"));
                    bean.setRemarks(result.getString("remarks"));
                    v.addElement(bean);
                    
            }//while
            return v;
            }finally{
            if(result!=null) result.close();
            if(st!=null) st.close();
               
        }//finally
        }//end method
   
     public static Vector getBatch(int progId)throws Exception {
       String query="Select * from Batch where Prog_id="+progId;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next()){
                    BatchBean bean=new BatchBean();
                    bean.setBatchId(result.getInt("Batch_id"));
                    bean.setProgId(result.getInt("Prog_id"));
                    bean.setBatchYear(result.getInt("Batch_year"));
                    bean.setShift(result.getString("shift"));
                    bean.setGroupDesc(result.getString("Group_desc"));
                    bean.setRemarks(result.getString("remarks"));
                    v.addElement(bean);
            }//while
            return v;
            }finally{
            if(result!=null) result.close();
            if(st!=null) st.close();
               
        }//finally
        }//end method
     
       public static Vector getStudent(int batchId)throws Exception {
       String query="Select * from Students where Batch_id="+batchId;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next()){
                    StudentsBean bean=new StudentsBean();
                        //bean.setStdId(result.getInt("Std_id"));
                          bean.setBatchId(result.getInt("Batch_id"));
                          bean.setStdName(result.getString("Std_name"));
                          bean.setFName(result.getString("fname"));
                          bean.setSurname(result.getString("surname"));
                          
                           bean.setRollNo(result.getString("roll_no"));
                             
                          bean.setRemarks(result.getString("remarks"));
             
                    v.addElement(bean);
            }//while
            return v;
            }finally{
            if(result!=null) result.close();
            if(st!=null) st.close();
               
        }//finally
        }//end method
       
       
       
       
       
       
       
       
      
            
       
       
       
       
       
       
       
       
       
              public static StudentsBean getStudent(String rollNo)throws Exception {
       String query="Select * from Students where roll_no like '"+rollNo+"'";
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);
            StudentsBean bean=null;
            while(result.next()){
                    bean=new StudentsBean();
                         bean.setBatchId(result.getInt("Batch_id"));
                         bean.setRollNo(result.getString("roll_no"));
                          bean.setStdName(result.getString("Std_name"));
                          bean.setFName(result.getString("fname"));
                          bean.setSurname(result.getString("surname"));
                         bean.setRemarks(result.getString("remarks"));
            }//while
            return bean;
            }finally{
            if(result!=null) result.close();
            if(st!=null) st.close();
        }//finally
        }//end method
              
            
              
              
              

       

              
              
              
       
       
       
       
       
       
       
       public static Vector getPart(int batchId) throws Exception{
           String query="Select * from Part where Batch_id="+batchId;
           Statement st=null;
           ResultSet result=null;
           try{
             st= con.createStatement();
            result=st.executeQuery(query);
            System.out.println(query);
           Vector  v=new Vector();
           while(result.next()){
               PartBean bean=new PartBean();
                      bean.setPart(result.getInt("Part"));
                      bean.setBatchId(result.getInt("Batch_id"));
                      bean.setPartYear(result.getInt("Part_year"));
                      bean.setRemarks(result.getString("Remarks"));
                     v.addElement(bean);

                   }
           return v;
           
                
           } finally{
           if(result!=null)result.close();        
           if(st!=null) st.close();
           }
       
      }
       
         public static Vector getBatchId()throws Exception {
       String query="Select * from Batch";
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);
            Vector v=new Vector();
            while(result.next()){
                    BatchBean bean=new BatchBean();
                    bean.setBatchId(result.getInt("Batch_id"));
                    bean.setProgId(result.getInt("Prog_id"));
                    bean.setBatchYear(result.getInt("Batch_year"));
                    bean.setShift(result.getString("shift"));
                    bean.setGroupDesc(result.getString("Group_desc"));
                    bean.setRemarks(result.getString("remarks"));
                    v.addElement(bean);
            }//while
            return v;
            }finally{
            if(result!=null) result.close();
            if(st!=null) st.close();
               
        }//finally
        }//end method
         
         
         
         
         
         
         public static Vector getExamYearOfSeat(int part,int batchId)throws Exception{
             Statement st=null;
             ResultSet result=null;
             String query="Select * from Seat_List where Part="+part+" AND Batch_Id="+batchId ;
             try{
                 st=con.createStatement();
                 result=st.executeQuery(query);
      
                 Vector v=new Vector();
                while(result.next()){
                    SeatListBean bean=new SeatListBean();
                        bean.setSlId(result.getInt("Sl_id"));
                        bean.setPart(result.getInt("part"));
                        bean.setBatchId(result.getInt("Batch_id"));
                        bean.setExamYear(result.getInt("Exam_year"));
                        bean.setType(result.getString("type"));
                        bean.setPrepDate(result.getDate("Prep_date"));
                        bean.setRemarks(result.getString("remarks"));
                            v.addElement(bean);
                    
                    
                }
                return v;
             }
             finally{
                 if(result!=null) result.close();
                 if(st!=null) st.close();
             }
         
         
         }
         
           public static Vector getSeatListDetail(int slId,int part,int batchId)throws Exception{
             Statement st=null;
             ResultSet result=null;
             String query="Select * from Seat_List_Detail where Sl_id="+slId+" AND Part="+part+" AND Batch_id="+batchId ;
             try{
                 st=con.createStatement();
                 result=st.executeQuery(query);
                Vector v=new Vector();
                while(result.next()){
                    SeatListDetailBean bean=new SeatListDetailBean();
                        bean.setSlId(result.getInt("Sl_id"));
                        bean.setPart(result.getInt("Part"));
                        bean.setBatchId(result.getInt("Batch_id"));
                        bean.setRollNo(result.getString("Roll_no"));    
                        bean.setRemarks(result.getString("remarks"));
                            v.addElement(bean);
                    
                    
                }
                return v;
             }
             finally{
                 if(result!=null) result.close();
                 if(st!=null) st.close();
             }
         
         
         }
         
         
         
         
  public static Vector  getScheme(int progId,int batchYear)throws Exception{
   String query="Select * from Scheme where Prog_id="+progId+" AND Scheme_year="+batchYear;
   System.out.println(query);

    Statement st=null;
    ResultSet result=null;
      try{
          st=con.createStatement();
          result=st.executeQuery(query);
   
          Vector v=new Vector();
          while(result.next()){
             SchemeBean bean=new SchemeBean();
   
             bean.setSchemeId(result.getInt("Scheme_id"));
             bean.setProgId(result.getInt("Prog_id"));
      bean.setSchemeGroup(result.getString("Scheme_group"));
      bean.setSchemeYear(result.getInt("Scheme_Year"));
      bean.setMinMarks(result.getInt("Min_Marks"));
      bean.setRemarks(result.getString("Remarks"));
        v.addElement(bean);
              
      }
     
      return v;
      
      
          
      }
     finally{
          if(result!=null) result.close();
          if(st!=null) st.close();
            
  } 
  }   
  
  
   public static Vector getScheme(int progId)throws Exception{
      String query="Select * from Scheme where Prog_id="+progId;
     System.out.println(query);
     Statement st=null;
     ResultSet result=null;
      try{
              st=con.createStatement();
              result=st.executeQuery(query);
              Vector v=new Vector();
     while(result.next()){
              SchemeBean bean=new SchemeBean();
   
            bean.setSchemeId(result.getInt("Scheme_id"));
            bean.setProgId(result.getInt("Prog_id"));
            bean.setSchemeGroup(result.getString("Scheme_group"));
            bean.setSchemeYear(result.getInt("Scheme_year"));
            bean.setMinMarks(result.getInt("Min_Marks"));
            bean.setRemarks(result.getString("Remarks"));
            
      }
     
      return v;
      
      }
     finally{
          if(result!=null) result.close();
          if(st!=null) st.close();      
  } 
  }   
  
  
  
  
  
  
  
  
 
  
  
  
  
         
   public static Vector getSchemePart(int schemeId)throws Exception{
       
         String query="Select * from Scheme_Part where Scheme_id="+schemeId;
      
    Statement st=null;
     ResultSet result=null;
      try{
          st=con.createStatement();
          result=st.executeQuery(query);
      Vector v=new Vector(); 
     while(result.next()){
      SchemePartBean bean=new SchemePartBean();
   
      bean.setSchemeId(result.getInt("Scheme_id"));
      bean.setSchemePart(result.getInt("Scheme_part"));
      bean.setRemarks(result.getString("Remarks"));
      v.addElement(bean);
              
      }
     
      return v;
      
      
      
      }
     finally{
          if(result!=null) result.close();
          if(st!=null) st.close();
       
  
   }    
   }
       
       
       public static Vector getSchemeSemester(int schemeId,int schemePart)throws Exception{
       
         String query="Select * from Scheme_Semester where Scheme_id="+schemeId+" AND  Scheme_Part="+schemePart;
         System.out.println(query);
    Statement st=null;
     ResultSet result=null;
      try{
          st=con.createStatement();
          result=st.executeQuery(query);
      Vector v=new Vector(); 
     while(result.next()){
      SchemeSemesterBean bean=new SchemeSemesterBean();
   
      bean.setSchemeId(result.getInt("Scheme_id"));
      bean.setSchemePart(result.getInt("Scheme_part"));
      bean.setSchemeSemester(result.getInt("Semester"));
      bean.setRemarks(result.getString("Remarks"));
      v.addElement(bean);
              
      }
     
      return v;
      
      
      
      }
     finally{
          if(result!=null) result.close();
          if(st!=null) st.close();
       
  
   }      
       
       }   
      public static Vector getSchemeDetail(int schemeId,int schemePart,int semester)throws Exception{
       
         String query="Select * from Scheme_Detail where Scheme_id="+schemeId+" AND  Scheme_part="+schemePart+" AND Semester="+semester;
      
    Statement st=null;
     ResultSet result=null;
      try{
          st=con.createStatement();
          result=st.executeQuery(query);
      Vector v=new Vector(); 
     while(result.next()){
      SchemeDetailBean bean=new SchemeDetailBean();
   
      bean.setSchemeId(result.getInt("Scheme_id"));
      bean.setSchemePart(result.getInt("Scheme_part"));
      bean.setSemester(result.getInt("Semester"));
      bean.setCourseNo(result.getInt("Course_no"));
      bean.setCourseTitle(result.getString("Course_title"));
      bean.setCrHours(result.getInt("Cr_hrs"));
      bean.setMaxMarks(result.getInt("Max_Marks"));
      bean.setIsCreditable(result.getString("Is_creditable"));
      bean.setSubjectType(result.getString("Subject_type"));
      bean.setRemarks(result.getString("Remarks"));
      
      

      v.addElement(bean);
              
      }
     
      return v;
      
      
      
      }
     finally{
          if(result!=null) result.close();
          if(st!=null) st.close();
       
  
   }      
       
       }   
       
 
       
       public static LedgerBean getLedger(int slId)throws Exception{
           String query="Select * from Ledger where SL_id="+slId;
           System.out.println(query);
           
           Statement st=null;
           ResultSet result=null;
       
           
           try{
                  st= con.createStatement();
                  result=st.executeQuery(query);
                      LedgerBean ledgerBean=null;
           
           if(result.next()){
             
             ledgerBean=new LedgerBean();
               
             ledgerBean.setSlId(result.getInt("SL_id"));
             ledgerBean.setSchemeId(result.getInt("Scheme_id"));
             ledgerBean.setSchemePart(result.getInt("Scheme_part"));
             ledgerBean.setIsAnn(result.getString("is_Ann"));
             ledgerBean.setDateAnn(result.getDate("Ann_Date"));
             ledgerBean.setRemarks(result.getString("Remarks"));
           }
           
           return ledgerBean;
           }finally{
               if(result!=null)result.close();
               if(st!=null)st.close();
           }
       }
       
       
       
       
       
       
        public static Vector getLedgerListDetail(int slId)throws Exception{
            
               String query="Select * from Ledger_List_Detail where SL_id="+slId;
           System.out.println(query);
           
           Statement st=null;
           ResultSet result=null;
       
           
           try{
                  st= con.createStatement();
                  result=st.executeQuery(query);
                   Vector v=new Vector();
           
           while(result.next()){
             
               LedgerListDetailBean bean=new LedgerListDetailBean();
                       
               
             bean.setSlId(result.getInt("SL_id"));
             bean.setRollNo(result.getString("Roll_no"));
             bean.setRemarks(result.getString("remarks"));
                v.addElement(bean);
           }
           
          return v;
           }finally{
               if(result!=null)result.close();
               if(st!=null)st.close();
           }   
            
            
            
            
   
 }  
        
        
        
        public static Vector getLedgerSemester(int slId,int semester)throws Exception{
            
            String query="Select * from Ledger_Semester where SL_id="+slId+" AND Semester="+semester;
           System.out.println(query);
           
           Statement st=null;
           ResultSet result=null;
       
           
           try{
                  st= con.createStatement();
                  result=st.executeQuery(query);
                   Vector v=new Vector();
           
           while(result.next()){
             
               LedgerSemesterBean bean=new LedgerSemesterBean();
                       
               
      
               bean.setSlId(result.getInt("SL_id"));
             bean.setSemester(result.getInt("Semester"));
             bean.setRollNo(result.getString("Roll_no"));
             bean.setRemarks(result.getString("remarks"));
                v.addElement(bean);
           }
           
          return v;
           }finally{
               if(result!=null)result.close();
               if(st!=null)st.close();
           }   
        }    
          
        
         
         
         
         
         
         
         
     
       
      
       
       public static int deletefaculty(int facId) throws Exception{
           String query="Delete from faculty where Fac_id="+facId;
           System.out.println(query);
           Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
       
       
       }
       
       
           public static int deleteDepartment(int deptId) throws Exception{
           String query="Delete from Department where Dept_id="+deptId;
           System.out.println(query);
           Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
       
       
       }
       
       
           
            public static int deleteProgram(int progId ) throws Exception{
           String query="Delete from Program where Prog_id="+progId;
           System.out.println(query);
           Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
       
       
       }
            
        
          public static int deleteStudent (int stdId ) throws Exception{
           String query="Delete from Students where Std_id="+stdId ;
                  
           System.out.println(query);
           Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
       
       
       }
    public static int deleteBatch (int batchId ) throws Exception{
           String query="Delete from Batch where Batch_id="+batchId ;
                  
           System.out.println(query);
           Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
       
       
       }

    public static int deletePart(int batchId, int part)throws Exception{
        String query="delete from Part where Batch_id="+batchId+ "and Part="+part;
            System.out.println(query);
                Statement st=null;
                try{
                    st=con.createStatement();
                    int rows=st.executeUpdate(query);
                    return rows;
                }
                finally{
                    if(st!=null) st.close();
                
                }
    }
    
    public static int deleteSeatList(int slId)throws Exception{
        String query="Delete * from Seat_List where Sl_id="+slId;
        Statement st=null;
        
            try{
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }
    
    
    
      public static int deleteSeatListDetail(int slId,int part,int batchId)throws Exception{
        String query="Delete * from Seat_List_Detail where Sl_id="+slId+"Part="+part+"Batch_id="+batchId;
        Statement st=null;
       
            try{
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }
    
        public static int deleteStudentPart(int batchId,int part,String rollNo)throws Exception{
        String query="delete from Student_Part where Part="+part+" AND  Batch_id="+batchId+" AND  Roll_no like '"+rollNo+"'";
        Statement st=null;
        
            try{
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }
        
       public static int deleteStudentPartDetails(int batchId,int part,String rollNo)throws Exception{
        String query="delete from Seat_List_Detail where Part="+part+" AND  Batch_id="+batchId+" AND  Roll_no like '"+rollNo+"'";
        Statement st=null;
        
            try{
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }  
    
      public static int deleteScheme(int schemeId)throws Exception{
        String query="delete from Scheme where Scheme_id="+schemeId;
        Statement st=null;
        
            try{
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }  
      
      
      
      
            public static int deleteLedger(int slId)throws Exception{
        String query="delete from Ledger where SL_id="+slId;
        Statement st=null;
        
            try{
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }  
      
      
      
      
      
      
      
            public static int deleteSchemePart(int schemeId,int schemePart)throws Exception{
        String query="delete from Scheme_Part where Scheme_id="+schemeId+" AND Scheme_Part="+schemePart;
        Statement st=null;
        
            try{
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }  
      
              public static int deleteSemesterScheme(int schemeId,int schemePart,int semester)throws Exception{
        String query="delete from Scheme_Semester where Scheme_id="+schemeId+" AND Scheme_Part="+schemePart+"AND Semester="+semester;
        Statement st=null;
        
            try{
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }  
              
    
              public static int deleteSchemeDetail(int schemeId,int schemePart,int semester,String courseTitle)throws Exception{
        String query="delete from Scheme_Detail where Scheme_id="+schemeId+" AND Scheme_part="+schemePart+" AND Semester="+semester+" AND Course_title like '"+courseTitle+"'";
        Statement st=null;
        
            try{
                
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }  
         
              
              
              
                     public static int deleteLedgerListDetail(int slId,String rollNo)throws Exception{
        String query="delete from Ledger_List_Detail where SL_id="+slId+" AND Roll_no LIKE '"+rollNo+"'";
        Statement st=null;
        
            try{
                
               st= con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                        
            }
               finally{
                if(st!=null) st.close();
            }
        
    }  
                     
                 public static int deleteLedgerSemester(int slId,int semester,String rollNo)throws Exception{
                  String query="delete from Ledger_Semester where SL_id="+slId+ " AND Semester="+semester+" AND Roll_no LIKE '"+rollNo+"'";
                    Statement st=null;
            try{

                    st= con.createStatement();
                    int rows=st.executeUpdate(query);
                    return rows;
                 
                      }
               finally{
                if(st!=null) st.close();
            }
        
    }  
                        
                     
        
              
              
              
              
              
              
          
              
          

    
    
    
    
    
    public static int addFaculty(String facName,String remarks) throws Exception{

        String query="Insert into Faculty(Fac_name,remarks)Values('"+facName+"','"+remarks+"')";
                    System.out.println(query);
                        
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
              if(st!=null) st.close();
           }
    }
    
    
      public static int addDepartment(int facId,String deptName,String remarks) throws Exception{
        
            String query="Insert into Department(Fac_id,Dept_name,remarks)Values('"+facId+"','"+deptName+"','"+remarks+"')";
                    
                    
                    System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
      }
           
             public static int addProgram(int deptId,String progName,String durationInSem,String remarks) throws Exception{
        
            String query="Insert into Program(Dept_id,Prog_name,Duration_in_sem,remarks)Values('"+deptId+"','"+progName+"','"+durationInSem+"','"+remarks+"')";
                    System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
            
      public static int addBatch(int progId, String batchYear,String remarks) throws Exception{
        
            String query="Insert into Batch(Prog_id,Batch_year,remarks)values('" +progId+"','"+batchYear+"','"+remarks+"')";
                    System.out.println(query);
                    
                       Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
           
            public static int addStudent(int batchId,String stdName, String fName,String surname,String rollNo,String remarks) throws Exception{
        
            String query="Insert into Students(Batch_id,Std_name,fname,surname,rollno) Values ('"+batchId+"','"+stdName+"','"+fName+"','"+surname+"','"+rollNo+"')";
             System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
         
             
             
    
    
      
    
       
            public static int addPart(String part,int batchId,String partYear,String remarks)throws Exception{
                String query="insert into Part(Part,Batch_id,Part_year,Remarks)Values('"+part+"',"+batchId+","+partYear+",'"+remarks+"')";
                System.out.println(query);
                Statement st=null;
                try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                    return rows;
                }
                finally{
                    if(st!=null) st.close();
                
                }
            
       
            }
            
   
           public static int addStudentPart(int part,int batchId,String rollNo,String remarks)throws Exception{
                String query="insert into Student_Part(Part,Batch_id,Roll_no,remarks)Values("+part+","+batchId+",'"+rollNo+"','"+remarks+"')";
                System.out.println(query);
                Statement st=null;
                try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                    return rows;
                }
                finally{
                    if(st!=null) st.close();
                
                }
            
       
            }
            
            
            
            
            
            
            
            
            
            
            
            public static int addSeatList(int part,int batchId,String examYear,String type,String prepDate,String remarks)throws Exception{
                if(prepDate.equals(""))prepDate=null;
                      else
                          prepDate="#"+prepDate+"#";
                
                String query="insert into Seat_List(part,Batch_id,Exam_year,type,Prep_date,remarks)Values("+part+","+batchId+",'"+examYear+"','"+type+"',"+prepDate+",'"+remarks+"')";
                System.out.println(query);
                        Statement  st=null;
                        try{
                        st=con.createStatement(); 
                          int  rows  =st. executeUpdate(query);
                          return rows;
                        
                      }
                        finally{
                            if(st!=null) st.close();
                        }
                
            }
            public static int addSeatListDetails(int slId,int part,int batchId,String status,String remarks)throws Exception{
                   String query="Insert into Seat_List_Detail(Sl_id,part,Batch_id,status,remarks)Values('"+slId+"','"+part+"','"+batchId+"','"+status+"','"+remarks+"')";
                System.out.println(query);
                        Statement  st=null;
                        try{
                        st=con.createStatement(); 
                          int  rows =st.executeUpdate(query);
                          return rows;
                          
                        
                        }
                        finally{
                            if(st!=null) st.close();
                        }
            
            
            }
            
            
               public static int addScheme(int progId,String schemeYear,String minimumMarks,String remarks)throws Exception{
                   String query="Insert into Scheme(Prog_id,Scheme_year,Min_Marks,Remarks)Values("+progId+",'"+schemeYear+"','"+minimumMarks+"','"+remarks+"')";
                System.out.println(query);
                        Statement  st=null;
                        try{
                        st=con.createStatement(); 
                          int  rows =st.executeUpdate(query);
                          return rows;
                          
                        
                        }
                        finally{
                            if(st!=null) st.close();
                        }
            
            
            }  
               
           public static int addSchemePart(int schemeId,String schemePart,String remarks)throws Exception{
                   String query="Insert into Scheme_Part(Scheme_id,Scheme_part,Remarks)Values("+schemeId+",'"+schemePart+"','"+remarks+"')";
                System.out.println(query);
                        Statement  st=null;
                        try{
                        st=con.createStatement(); 
                          int  rows =st.executeUpdate(query);
                          return rows;
                          
                        
                        }
                        finally{
                            if(st!=null) st.close();
                        }
            
            
            }     
           
          public static int addSchemeSemester(int schemeId,int schemePart,String semester,String remarks)throws Exception{
                   String query="Insert into Scheme_Semester(Scheme_id,Scheme_part,semester,Remarks)Values("+schemeId+","+schemePart+",'"+semester+"','"+remarks+"')";
                System.out.println(query);
                        Statement  st=null;
                        try{
                        st=con.createStatement(); 
                          int  rows =st.executeUpdate(query);
                          return rows;
                          
                        
                        }
                        finally{
                            if(st!=null) st.close();
                        }
            
            
            }      
           
               
            
               public static int addSchemeDetail(int schemeId,int schemePart,int Schemesemester,String courseNo,String courseTitle,String creditHours,String maxMarks,String isCreditable,String subjectType,String remarks)throws Exception{
                   String query="Insert into Scheme_Detail(Scheme_id,Scheme_part,Semester,Course_no,Course_title,Cr_hrs,Max_Marks,Is_creditable,Subject_type,Remarks)Values("+schemeId+","+schemePart+","+Schemesemester+",'"+courseNo+"','"+courseTitle+"','"+creditHours+"','"+maxMarks+"','"+isCreditable+"','"+subjectType+"','"+remarks+"')";
                   
               
                   
                  
                   
                   
                System.out.println(query);
                        Statement  st=null;
                        try{
                        st=con.createStatement(); 
                          int  rows =st.executeUpdate(query);
                          return rows;
                          
                        
                        }
                        finally{
                            if(st!=null) st.close();
                        }
            
            
            }      
          
                      
         public static int addLedger(int slId,int schemeId,String isAnn,String announcementDate,String remarks)throws Exception{
             
              if(announcementDate.equals(""))announcementDate=null;
                      else
                          announcementDate="#"+announcementDate+"#";
             
             String query="Insert into Ledger(SL_id,Scheme_id,is_Ann,Ann_Date,remarks)VALUES("+slId+","+schemeId+",'"+isAnn+"',"+announcementDate+",'"+remarks+"')";
                  
                System.out.println(query);
                        Statement  st=null;
                        try{
                        st=con.createStatement(); 
                          int  rows =st.executeUpdate(query);
                          return rows;
                          
                        
                        }
                        finally{
                            if(st!=null) st.close();
                        }
         }
         
         
            public static int addLedgerListDetail(int slId,String rollNo,String remarks)throws Exception{

             
             String query="Insert into Ledger_List_Detail(SL_id,Roll_no,remarks) VALUES ("+slId+",'"+rollNo+"','"+remarks+"')'";
                  
                System.out.println(query);
                        Statement  st=null;
                        try{
                        st=con.createStatement(); 
                          int  rows =st.executeUpdate(query);
                          return rows;
                          
                        
                        }
                        finally{
                            if(st!=null) st.close();
                        }
         }
         
           public static int addLedgerSemester(int slId,int semester,String rollNo,String remarks)throws Exception{

             
             String query="Insert into Ledger_Semester(SL_id,Semester,Roll_no,remarks)VALUES("+slId+","+semester+",'"+rollNo+"','"+remarks+"')";
                 
                System.out.println(query);
                        Statement  st=null;
                        try{
                        st=con.createStatement(); 
                          int  rows =st.executeUpdate(query);
                          return rows;
                         
                        
                        }
                        finally{
                            if(st!=null) st.close();
                        }
         }    


          public static int updateLedgerSemester(int slId,int semester,String rollNo,String remarks) throws SQLException{
                    
                  String query="update Ledger_Semester set Roll_no='"+rollNo+"',remarks='"+remarks+"' where SL_id="+slId+" AND Semester="+semester;
                  System.out.println(query);
                        Statement  st=null;
                               
                        try{
                            
                        st=con.createStatement(); 
                          int  rows =st.executeUpdate(query);
                          return rows;
                          
                        
                        }
                        finally{
                            if(st!=null) st.close();
                        }
           
          }
            
            
            
            
            
            
            
            
            
      
      public static int updateFaculty(int facId,String facName,String remarks) throws Exception{
          String query="update Faculty Set Fac_name='"+facName+"',remarks='"+remarks+"'where Fac_id="+facId;
      
          
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
       
      
      public static int updateDepartment(int facId,int deptId,String deptName,String remarks) throws Exception{
                
      
          String query="update Department set Fac_id="+facId+",Dept_name='"+deptName+"',remarks='"+remarks+"' where Dept_id="+deptId; 
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
         
                    
                  
      public static int updateProgram(int deptId,int progId,String progName,String progDur,String remarks) throws Exception{
          String query="update Program Set Dept_id="+deptId +",Prog_name='"+progName+"',Duration_in_sem='"+progDur+"',remarks='"+remarks+"'where prog_id="+progId;
      
          
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
      
            public static int updateBatch(int progId,int batchId, int batchYear,String remarks) throws Exception{
                    String query="update Batch Set Prog_id="+progId +",Batch_year="+batchYear+",remarks='"+remarks+"' where Batch_id="+batchId;

      
          
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
        
      
                 public static int updateStudent(int batchId,int stdId,String stdName,String surname ,String rollNo ,String fName,String remarks) throws Exception{
          String query = "update Students Set Batch_id="+batchId+",Std_name='"+stdName+"',surname='"+surname+"',rollno='"+rollNo+"',fname='"+fName+"',remarks='"+remarks+"'where Std_id="+stdId;
          
                  
          

      
          
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
      
       public static int updateStudentPart(int part,int batchId,String rollNum,String remarks)throws Exception{
            
                 String query = "update Student_Part Set remarks='"+remarks+"',Roll_no='"+rollNum+"' where Batch_id="+batchId+" AND Part="+part; 
                  
          

      
          
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
         public static int updateScheme(int schemeId,int progId,String schemeYear,String minMarks,String remarks)throws Exception{
            
                 String query = "update Scheme Set Prog_id="+progId+",Scheme_year='"+schemeYear+"',Min_Marks='"+minMarks+"',Remarks='"+remarks+"'where Scheme_id="+schemeId;
                  
          

      
          
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
          
           
           
       public static int updateLedger(int slId,int schemeId,String Isann,String announcementDate,String remarks)throws Exception{
           
                 String query = "update Ledger set is_Ann='"+Isann+"',Ann_Date=#"+announcementDate+"#,Remarks='"+remarks+"',Scheme_id="+schemeId+" where SL_id="+slId;
                        
                    System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }        
       
       
       
         public static int updateLedgerListDetail(int slId,String rollNo,String remarks)throws Exception{
           
                 String query = "update Ledger_List_Detail set remarks='"+remarks+"' where SL_id="+slId+" AND Roll_no LIKe '"+rollNo+"'";
                        
                    System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }        
           
           
       
       
       
       
       
       
       
           
              
      
                 
   public  static int getStudentPaste(int part,int batchId,String remarks)throws Exception{
       String query="insert into Student_Part(Batch_id,Part,Roll_no,remarks)Select Batch_id,"+part+",roll_no,'"+remarks+"'  from Students where Batch_id="+batchId;
                            System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
               
       
   }
   

   

  
 public static int getSeatListDetailPaste(int part,int batchId,int slId)throws Exception{
 String query="Insert into Seat_List_Detail(Sl_id,Part,Batch_id,Roll_no,Status) Select "+slId+",Batch_id,Part,Roll_no,'L' from Student_Part where Batch_id="+batchId+" AND Part="+part;
 
       System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
           
 
 }  
 
 public static int getLedgerListPaste(int slId)throws Exception{
 String query="Insert into Ledger_List_Detail(SL_id,Roll_no,remarks) Select Sl_id,Roll_no,remarks from Seat_List_Detail where Sl_id="+slId;
       System.out.println(query);
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
               return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
           
 
 }  
 
 
 
 
 
 
 
 
public static Vector getStudentPart(int batchId,int part)throws Exception{
    String q="Select * from Student_Part where Batch_id="+batchId+" AND Part="+part;
    

      System.out.println(q);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(q);
            Vector v=new Vector();
            while(result.next()){
                    StudentPartBean bean=new StudentPartBean();
                    bean.setPart(result.getInt("Part"));
                    bean.setBatchId(result.getInt("Batch_id"));
                    bean.setRollNo(result.getString("Roll_no"));
                    bean.setRemarks(result.getString("remarks"));
                    v.addElement(bean);
                    
            }//while
            return v;
            }finally{
            if(result!=null) result.close();
            if(st!=null) st.close();
               
        }//finally
        }//end method
    
    
    
    
    
    
    
    


      
      
      
      
      
      
      
      
      
      
      
      
      
                   
   public static int updatePart(int originPart,int batchId,String part,String partYear,String remarks) throws Exception{
                    String query="update Part Set part_year="+partYear+" ,remarks='"+remarks+"',part="+part+" where Batch_id="+batchId+" AND Part="+originPart;
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
               return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
      public static int updateSeatList(int slId,int part,int batchId, String examYear,String prepDate,String remarks) throws Exception{
          
            if(prepDate.equals(""))prepDate=null;
                      else
                          prepDate="#"+prepDate+"#";
                
          
                    String query="update Seat_List Set part="+part+",Batch_id="+batchId+",Exam_year='"+examYear+"',Prep_date="+prepDate+",remarks='"+remarks+"' where Sl_id="+slId;

      
          
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
   
    public static int updateSeatListDetails(int slId,int part,int batchId, String status,String remarks) throws Exception{
          
          
                
          
                    String query="update Seat_List_Detail Set part="+part+",Batch_id="+batchId+",status='"+status+"',remarks='"+remarks+"' where Sl_id="+slId;

      
          
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
   
    
     public static int updateSchemePart(int schemeId,String schemePart,String remarks) throws Exception{
          
          
                
          
                 String query="update Scheme_Part Set Remarks='"+remarks+"'where Scheme_id="+schemeId+" AND Scheme_part="+schemePart;

      
         
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
   
     public static int updateSchemeSemester(int schemeId,int schemePart,String semester,int originalSemester,String remarks) throws Exception{
          
          
                
          
                 String query="update Scheme_Semester Set Semester="+semester+",Remarks='"+remarks+"' where Scheme_id="+schemeId+" AND Scheme_part="+schemePart+" and semester="+originalSemester;        
                      System.out.println(query);
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }

     
     
     
     
     
     
      public static int updateSchemeDetail(int schemeId,int schemePart,int semester,int orignalcourseNo,String courseNo,String courseTitle,String creditHours,String maxMarks,String isCreditable,String subjectType, String remarks) throws Exception{
          
         
                 String query="update Scheme_Detail Set Course_no="+courseNo+",Course_title='"+courseTitle+"',Max_Marks='"+maxMarks+"',Is_creditable='"+isCreditable+"',Subject_type='"+subjectType+"',Remarks='"+remarks+"' Where Scheme_id="+schemeId+" AND Scheme_part="+schemePart+" AND Semester="+semester+" AND Course_no="+orignalcourseNo;
                      System.out.println(query);
                    
                        Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }
    }
      
      public static int pasteLedgerSemester(int slId,int Semester)throws Exception{
            String query="Insert into Ledger_Semester(SL_id,Semester,Roll_no) Select SL_id,"+Semester+",Roll_No from Seat_List_Detail where SL_id="+slId;
            System.out.println(query);     
                    Statement st=null;
           try{
                st=con.createStatement();
                int rows=st.executeUpdate(query);
                return rows;
                    
           }
           finally{
               if(st!=null) st.close();
           }    
            
          
                }//pasteLedgerSemester
                
                
                
            
          
                  
          
      
      
    
      
      
      
     
      
     
      

     
     
     
     
     
      
    

}//class
