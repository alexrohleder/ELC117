package fuelstation.views.helpers;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class FieldMask
{
    public static MaskFormatter getMaskFormatter(String format)
    {
        MaskFormatter F_Mascara = new MaskFormatter();  

        try {
            F_Mascara.setMask(format);
            F_Mascara.setPlaceholderCharacter(' '); 
        } catch (ParseException e) {
            // continue
        }
        
        return F_Mascara;
    }
}
