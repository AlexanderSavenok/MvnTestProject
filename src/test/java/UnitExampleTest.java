import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by AlexanderSavenok on 12/27/2016.
 */
@RunWith(Parameterized.class)
public class UnitExampleTest {

    int value1 = 4;
    int value2 = 6;
    int result = value1 + value2;

    public UnitExampleTest(int value1, int value2, int result) {
        this.value1 = value1;
        this.value2 = value2;
        this.result = result;
    }

    @Test
    public void FirstTest() {
        assertEquals(result, value1 + value2);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        Object[][] data = new Object[][] {
                {3, 4, 7},
                {5, 5, 10},
                {6, 6, 12}
        };
        return Arrays.asList(data);
    }
}
