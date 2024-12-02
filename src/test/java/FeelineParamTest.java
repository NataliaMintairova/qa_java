import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FeelineParamTest {

    private final int kittenNumber;
    private final int expected;

    public FeelineParamTest(int kittenNumber, int expected) {
        this.kittenNumber = kittenNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "expectedKittensCount = {0}, kittensCount = {1}")
    public static Object[][] getKittenNumber() {
        return new Object[][] {
                {2, 2},
                {0, 0},
                {10, 10},
        };
    }

    @Test
    public void GetKittensParamTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittenNumber);
        assertEquals(expected, actual);
    }
}
