/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Isra Khan
 */
public class SchemeDetailBean {
    private int schemeId;
    private int schemePart;
    private int semester;
    private int courseNo;
    private String courseTitle;
    private int crHours;
    private int  maxMarks;
    private String Iscreditable;
    private String subjectType;
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
    public void  setSemester(int semester){
        this.semester=semester;
    }
    public int getSemester(){
        return semester;
    }
    
    public void  setCourseNo(int courseNo){
        this.courseNo=courseNo;
    }
    
    public int getCourseNo(){
        return courseNo;
    }
    
    public void setCourseTitle(String courseTitle){
        this.courseTitle=courseTitle;
    
    }
    public String getCourseTitle(){
        return courseTitle;
    
    }
    public void  setCrHours(int crHours){
        this.crHours=crHours;
    
    }
    public int getCrHours(){
        return crHours;
    }
    public void setMaxMarks(int maxMarks){
        this.maxMarks=maxMarks;
    }
    public int getMaxMarks(){
        return maxMarks;
        }
    public void setIsCreditable(String Iscreditable){
        this.Iscreditable=Iscreditable;
    }
    public String getIsCreditable(){
        return Iscreditable;
        }
    
    public void setSubjectType(String subjectType){
        this.subjectType=subjectType;
    
    }
       public String getSubjectType(){
           return subjectType;
    }
       public void setRemarks(String remarks){
           this.remarks=remarks;
           
           
       }
       public String getRemarks(){
           return remarks;
       }
        public String toString(){
            return courseTitle;
       } 
    
  
    
    
    
    
    
    
    
    
    
    
    
    
}
