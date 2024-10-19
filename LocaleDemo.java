import java.util.*;
import java.text.*;

public class LocaleDemo{
    public void printTotal(Locale locale){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println(nf.format(number:45320));
    }
        
    }
