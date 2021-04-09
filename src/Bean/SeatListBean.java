/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
public class SeatListBean {
    private int  batchId;
    private int slId;
    private int part;
    private int examYear;
    private String type;
    private java.util.Date prepDate;
    private String remarks;
    
    public void setBatchId(int batchId){
            this.batchId=batchId;
    
    }
    public int getBatchId(){
        return batchId;
    }
    public void setSlId(int slId){
        this.slId=slId;
   
    }
    public int getSlId(){
            return slId;
    
    }
    public void setPart(int part){
        this.part=part;
    
    }
    public int getPart(){
        return part;
    }
    public void setExamYear(int examYear){
        this.examYear=examYear;
    
    }
    public int getExamYear(){
        return examYear;
    
    }
    public void setType(String type){
        this.type=type;
    
    }
    public String getType(){
        return type;
    }
    public void setPrepDate(java.util.Date prepDate){
        this.prepDate=prepDate;
      
    }
    public java.util.Date getPrepDate(){
             return  prepDate; 
    }
    public void setRemarks(String remarks){
        this.remarks=remarks;

    }
    public String getRemarks(){
        return remarks;
    
    }
    public String toString(){
      return ""+examYear;
    
    }
            
 
}
