import com.bridgelabz.genericproblem.FindMaximum;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.bridgelabz.genericproblem.FindMaximum.findMaximum;

public class TestFindMaximum {

    @Test
    public void givenThreeIntegerNumber_AtFirstPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = findMaximum(7, 3, 5);
        Assert.assertEquals( Integer.valueOf(7),  maxInteger);
    }

    @Test
    public void givenThreeIntegerNumber_AtSecondPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = findMaximum(4, 9, 5);
        Assert.assertEquals( Integer.valueOf(9),  maxInteger);
    }

    @Test
    public void givenThreeIntegerNumber_AtThirdPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = findMaximum(2, 8, 11);
        Assert.assertEquals( Integer.valueOf(11),  maxInteger);
    }
}
