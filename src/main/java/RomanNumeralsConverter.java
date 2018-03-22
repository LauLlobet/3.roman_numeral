import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConverter {

    public String convert(int arabic) {
        Map<Integer,String> literals = new HashMap<Integer,String>();
        literals.put(50,"L");
        literals.put(10,"X");
        literals.put(5,"V");
        literals.put(1,"I");

        String roman = "";
        if(arabic == 4){
            return "IV";
        }

        int literalArabic = 50;
        if(arabic >= literalArabic){
            roman = roman + literals.get(literalArabic);
            arabic = arabic - literalArabic;
        }
        literalArabic = 10;
        while(arabic >= 10){
            roman = roman + literals.get(literalArabic);
            arabic = arabic - literalArabic;
        }
        if(arabic >= 5){
            roman =  "V";
            arabic = arabic - 5;
        }
        while(arabic >= 1 ){
            roman+= "I";
            arabic = arabic - 1;
        }
        return roman ;
    }
}
