package unitTest;

import helpers.JsonAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonTest {
    @Test
    public void areEquals() throws Exception {
        String actual ="";
        String expected = "";
        JsonAssert.areEqualJson(expected,actual,"ERROR");
    }
}
