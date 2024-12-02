import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FeelineTest {
    Feline feline;
    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnPredatorTest() throws Exception {

        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyReturnFeelineFamilyTest() {

        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GetKittensReturnOneKittenTest() {

        assertEquals(1, feline.getKittens());
    }

}
