import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgelabz.genericproblem.Maximum;


public class TestMaximum {
    @Test
    public void givenThreeIntegers_ShouldReturnMaximumValue() {
        Integer maxInteger = Maximum.findMaximum(7, 3, 5);
        Assert.assertEquals(Integer.valueOf(7), maxInteger);
    }

    @Test
    public void givenThreeFloats_ShouldReturnMaximumValue() {
        Float maxFloat = Maximum.findMaximum(7.4f, 8.9f, 5.5f);
        Assert.assertEquals(Float.valueOf(8.9f), maxFloat);
    }

    @Test
    public void givenThreeString_ShouldReturnMaximumValue() {
        String maxString = Maximum.findMaximum("Papaya", "Apple", "WaterMelon");
        Assert.assertEquals("WaterMelon", maxString);
    }
}
