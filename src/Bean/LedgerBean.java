/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
public class LedgerBean {
int slId;
int schemePart;
int schemeId;
String isAnn;
java.util.Date annDate;

String remarks;


public void setSlId(int slId){
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



public void setIsAnn(String isAnn){
    this.isAnn=isAnn;


}
public String getIsAnn(){
    return isAnn;
}


public  void  setDateAnn(java.util.Date annDate){
    this.annDate=annDate;
}
public java.util.Date getDateAnn(){
    return annDate;

}

public void setRemarks(String remarks){
    this.remarks=remarks;
}

public String getRemarks(){
    return remarks;

}

public String toString(){
       return Decode.DateFormat(annDate);
}


    

    
}
