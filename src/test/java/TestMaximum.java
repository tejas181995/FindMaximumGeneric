import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgelabz.genericproblem.Maximum;


public class TestMaximum <E extends Comparable<E>> {
    Maximum maximum;
    @Test
    public void givenThreeIntegers_ShouldReturnMaximumValue() {
        maximum = new Maximum<>(7, 3, 5);
        Integer maxInteger = (Integer) maximum.maximumFind();
        Assert.assertEquals(Integer.valueOf(7), maxInteger);
    }

    @Test
    public void givenThreeFloats_ShouldReturnMaximumValue() {
        maximum = new Maximum<>(7.4f, 8.9f, 5.5f);
        Float maxFloat = (Float) maximum.maximumFind();
        Assert.assertEquals(Float.valueOf(8.9f), maxFloat);
    }

    @Test
    public void givenThreeString_ShouldReturnMaximumValue() {
        maximum = new Maximum<>("Papaya", "Apple", "WaterMelon");
        String maxString = (String) maximum.maximumFind();
        Assert.assertEquals("WaterMelon", maxString);
    }
}
