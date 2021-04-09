/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
public class StudentPartBean {
    private int batchId;
    private int part;
    private String rollNo;
    private String remarks;
    
    public void setBatchId(int batchId){
        this.batchId=batchId;
   
    }
    public int getBatchId(){
        return batchId;
    
    }
    public void setPart(int part){
        this.part=part;
    
    }

    public int getPart(){
        return part;
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
