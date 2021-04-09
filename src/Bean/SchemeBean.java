/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
public class SchemeBean {
  private  int schemeId;
   private int progId;
  private  int schemeYear;
  private  int minMarks;
  private String schemeGroup;
  private  String remarks;
    
    
    
    
    public void setSchemeId(int schemeId){
            this.schemeId=schemeId;
        
    }
    public int getSchemeId(){
        return schemeId;
    
    }
    
    public void setProgId(int progId){
        this.progId=progId;
    
    }
    public int getProgId(){
        return progId;
    }
    public void setSchemeYear(int schemeYear){
        this.schemeYear=schemeYear;
    

    }
    
    public int getSchemeYear(){
        return schemeYear;
    
    }
    
    
    
    public void setMinMarks(int minMarks){
        this.minMarks=minMarks;
    
    }
    public int getMinMarks(){
            return minMarks;
    
    } 
    public void setRemarks(String remarks){
        this.remarks=remarks;
        
    
    }
    public String getRemarks(){
        return remarks;
    
    }
   public void setSchemeGroup(String schemeGroup){
       this.schemeGroup=schemeGroup;
   
   
   } 
   public String getSchemeGroup(){
       return schemeGroup;
   
   }
    
    
    
    public String  toString(){
        return schemeGroup;
    
    }
    
 
    
}
