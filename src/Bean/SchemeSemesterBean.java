/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
public class SchemeSemesterBean {
    private int schemeId;
    private int schemePart;
    private int schemeSemester;
    private String remarks;
    
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
    
     public void setSchemeSemester(int schemeSemester){
        this.schemeSemester=schemeSemester;
    
    }
    public int getSchemeSemester(){
        return  schemeSemester;
    
    }
    
    
    
    
    
    
    public void setRemarks(String remarks){
        this.remarks=remarks;
    
    }
    public String getRemarks(){
        return remarks;
        }
    public String toString(){
        return ""+schemeSemester;
    }
    
    
    
    
    
    
    
    
    
}
