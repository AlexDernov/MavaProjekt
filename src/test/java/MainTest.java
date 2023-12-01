import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void fizzBus_whenInt4_thenReturn5asString() {
        //GIVEN
        int a = 4;
        //WHEN
        String actual = Main.fizzBus(a);
        //THEN
        assertEquals("4", actual);
    }

    @Test
    public void isFizzTest_when3_thenReturnFizz() {
        //GIVEN
        int a = 3;
        //WHEN
        String actual = Main.fizzBus(a);
        //THEN
        assertEquals("fizz", actual);
    }

    @Test
    public void isBuzzTest_when5_thenReturnBuzz() {
        //GIVEN
        int a = 5;
        //WHEN
        String actual = Main.fizzBus(a);
        //THEN
        assertEquals("buzz", actual);
    }

    @Test
    public void isFizzBuzzTest_when15_thenReturnFizzBuzz() {
        //GIVEN
        int a = 15;
        //WHEN
        String actual = Main.fizzBus(a);
        //THEN
        assertEquals("fizzBuzz", actual);
    }


}