public class RomanNumeralsConverter {

    public String convert(int arabic) {
        String roman = "";
        if(arabic == 4){
            return "IV";
        }
        if(arabic >= 5){
            roman = "V";
            return addOnes(5,arabic,roman);
        }
        return addOnes(0,arabic,roman);
    }

    private String addOnes(int i, int arabic, String roman) {
        for(;i<arabic;i++){
            roman+= "I";
        }
        return roman;
    }
}
