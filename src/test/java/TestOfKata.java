import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestOfKata {

    @Test
    public void asserts() throws Exception {
        Kata k = new Kata();
        assertEquals(k.doIt("hola"), 501);
    }

    @Test(expected = Exception.class)
    public void catches() throws Exception {
        Kata k = new Kata();
        throw new Exception();
    }
}