import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
Cat cat;
    @Before
    public void init() {cat = new Cat(feline);}

@Test
    public void getSoundReturnMyauTest() {

    String expected = "Мяу";
    String actual = cat.getSound();
    assertEquals(expected, actual);
}

@Test
public void getFoodReturnCatsFoodTest() throws Exception {


    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.eatMeat()).thenReturn(expected);
    assertEquals(expected, cat.getFood());
}
}
