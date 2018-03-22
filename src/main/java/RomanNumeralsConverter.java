import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.entry;

public class RomanNumeralsConverter {

    public String convert(int arabic) {
        Map<Integer,String> literals = new LinkedHashMap();
        literals.put(1000,"M");
        literals.put(900,"CM");
        literals.put(100,"C");
        literals.put(90,"XC");
        literals.put(50, "L");
        literals.put(40, "XL");
        literals.put(10,"X");
        literals.put(5, "V");
        literals.put(4,"IV");
        literals.put(1,"I");
        String roman = "";



        for (Map.Entry<Integer, String> literalArabicToRoman : literals.entrySet())
        {
            int literalNumberKey = literalArabicToRoman.getKey();
            while (arabic >= literalNumberKey){
                roman = roman + literalArabicToRoman.getValue();
                arabic = arabic - literalNumberKey;
            }
        }

        return roman;
    }
}
