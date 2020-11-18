package cat;

import mouse.Mouse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
public class CatTest {

    @Test
    void catRangeCalcTest() {

        double expectedRange = 5.0d;
        double range = new Cat(0, 0, 0).range(3,4);

        assertEquals(expectedRange, range);
    }

    @ParameterizedTest
    @CsvSource({
            // by range:
            "5, 3, 4, 3, true",
            "5, 3, 3.9, 3, true",
            "5, 3.1, 4, 3, false",

            // by size:
            "5, 3, 4.1, 6, false",
            "5, 3.1, 4, 6.1, true",
    })
    void catCatchMouseTest(double effectiveRange,
                           double mouseX ,
                           double mouseY,
                           double mouseSize,
                           boolean expectedResult) {

        Cat testCat = new Cat(0, 0, effectiveRange);
        Mouse testMouse = new Mouse(mouseX, mouseY, mouseSize);

        assertEquals(expectedResult, testCat.catchMouse(testMouse));
    }
}
