/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
public class LedgerListDetailBean {
    int slId;
    String rollNo;
    String remarks;
    
    
    public void setSlId(int slId){
        this.slId=slId;
    
    }
    
    public int getSlId(){
        return slId;
    
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
