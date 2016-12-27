import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by AlexanderSavenok on 12/27/2016.
 */
public class testngexampleTest {

    @Test(dataProvider = "getClient2Data")
    public void firstTest() {

    }


    @DataProvider
    public static Object[][] getClient2Data() {
        return new Object[][]{
                {2},
                {3},
                {5}
        };

    }

}
