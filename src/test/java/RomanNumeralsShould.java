import static org.junit.Assert.assertEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class RomanNumeralsShould {

    @Test
    @Parameters({"1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "10, X",
            "11, XI",
            "20, XX",
            "50, L",
            "73, LXXIII"
    })
    public void convert_arabic_to_roman(int arabic, String roman){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();

        assertEquals(roman, converter.convert(arabic));
    }
}