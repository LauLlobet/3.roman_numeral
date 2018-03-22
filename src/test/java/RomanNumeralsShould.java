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
            "7, VII"
    })
    public void convert_arabic_to_roman(int arabic, String roman){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();

        assertEquals(converter.convert(arabic), roman);
    }
}