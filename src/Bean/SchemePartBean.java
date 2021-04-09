/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;


public class SchemePartBean {
    
    private int schemeId;
    private int schemePart;
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
    public void setRemarks(String remarks){
            this.remarks=remarks;
    }
    public String getRemarks()
    {
        return remarks;
    
    }

    public String toString(){
        return ""+ schemePart; 
    }
    
     
    
}
