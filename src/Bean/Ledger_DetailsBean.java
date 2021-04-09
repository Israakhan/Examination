/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
public class Ledger_DetailsBean {
    
    int slId;
    int schemeId;
    int schemePart;
    int acId;
    String rollNo;
    int semester;
    int courseNo;
    int marksObtain;
    int grade;
    int minMarks;
    int qp; 
    String remarks;
    
    
         public void setSlId(){
        this.slId=slId;
    
    }
    
    public int getSlId(){
        return slId;
    
    }
    
    
    
   

public void setSchemeId(int schemeId){
    this.schemeId=schemeId;


}

public int getSchemeId(){
    return schemeId;
    

} 
 
    
    

public void setSchemePart(int schemePart){
    this.schemePart=schemePart;


}

public int getSchemePart(){
    return schemePart;
    

} 




public void setAcId(int acId){
    this.acId=acId;


}
public int getAcId(){
    return acId;
}
    
 
    
  public void setRollNo(String rollNo){
        this.rollNo=rollNo;
    
    }
    
    public String getRollNo(){
        return rollNo;
    
    }  
    
    
    public void setSemester(int semester){
    this.semester=semester;
    }
    
      
    public int getSemester(){
            return semester;
   } 
    
    
  public void setCourseNo(int courseNo){
    this.courseNo=courseNo;
    }
    
      
    public int getCourseNo(){
            return courseNo;
   } 
       
    
 public void setMarksObtain(int marksObtain){
    this.marksObtain=marksObtain;
    }
    
      
    public int getMaxObtain(){
            return marksObtain;
   }    
    
   public void setMinMarks(int minMarks){
    this.minMarks=minMarks;
    }
    
      
    public int getMinMarks(){
            return minMarks;
   }  
    
       public void setQP(int qp){
            this.qp=qp;
    }
    
      
    public int getQP(){
            return qp;
   }  
    
    public void setRemarks(){
        this.remarks=remarks;
    }
    public String getRemarks(){
        return remarks;
    }
    
}
