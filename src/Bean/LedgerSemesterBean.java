/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
public class LedgerSemesterBean {
    
    int slId;
    int semester;
    String rollNo;
    String remarks;
    
    
    public void setSlId(int slId){
        this.slId=slId;
    
    }
    
    public int getSlId(){
        return slId;
    
    }
    
    public void setSemester(int semester){
    this.semester=semester;
    }
    
      
    public int getSemester(){
            return semester;
   }
    
    
  public void setRollNo(String rollNo){
        this.rollNo=rollNo;
    
    }
    
    public String getRollNo(){
        return rollNo;
    
    }  
    
    public void setRemarks(String remarks){
        this.remarks=remarks;
    
    }
    public String getRemarks(){
        return remarks;
    }
    
    public String toString(){
        return rollNo;
    }
    
    
     
}
