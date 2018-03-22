public class RomanNumeralsConverter {

    public String convert(int arabic) {
        String roman = "";
        if(arabic == 4){
            return "IV";
        }
        if(arabic == 10){
            return "X";
        }
        if(arabic >= 5){
            roman =  "V";
            arabic = arabic - 5;
        }
        for(int i=0;i<arabic;i++){
            roman+= "I";
        }
        return roman ;
    }
}
