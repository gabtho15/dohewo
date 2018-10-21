/**
 * Created by thomas on 21.10.2018.
 */

import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MathTest {

    @Test
    public void testPlus(){
        assertTrue(Math.plus(2, 2) == 4);
    }

    @Test
    public void testPlusSecond(){
        assertFalse(Math.plus(2, 2) == 5);
    }
}
