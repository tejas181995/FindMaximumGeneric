import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgelabz.genericproblem.Maximum;


public class TestMaximum {

    @Test
    public void givenThreeIntegerNumber_AtFirstPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = Maximum.maxInteger(7, 3, 5);
        Assert.assertEquals( Integer.valueOf(7),  maxInteger);
    }

    @Test
    public void givenThreeIntegerNumber_AtSecondPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = Maximum.maxInteger(4, 9, 5);
        Assert.assertEquals( Integer.valueOf(9),  maxInteger);
    }

    @Test
    public void givenThreeIntegerNumber_AtThirdPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = Maximum.maxInteger(2, 8, 11);
        Assert.assertEquals( Integer.valueOf(11),  maxInteger);
    }
    @Test
    public void givenThreeFloats_AtFirstPosition_ShouldReturnMaximumValue() {
        Float maxFloat = Maximum.maxFloat(7.4f, 3.1f, 5.5f);
        Assert.assertEquals(Float.valueOf(7.4f), maxFloat);
    }

    @Test
    public void givenThreeFloats_AtSecondPosition_ShouldReturnMaximumValue() {
        Float maxFloat = Maximum.maxFloat(4.5f, 9.2f, 5.8f);
        Assert.assertEquals(Float.valueOf(9.2f), maxFloat);
    }

    @Test
    public void givenThreeFloats_AtThirdPosition_ShouldReturnMaximumValue() {
        Float maxFloat = Maximum.maxFloat(2.5f, 8.2f, 11.8f);
        Assert.assertEquals(Float.valueOf(11.8f), maxFloat);
    }
}
