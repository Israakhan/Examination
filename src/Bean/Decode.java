
package Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Isra Khan
 */
public class Decode {
    
    public static String DateFormat(Date date){
        if(date==null)return"";
        SimpleDateFormat d=new SimpleDateFormat("dd-MMM-yyyy");
        String str= d.format(date);
        return str;
    
    
    }
    
}
