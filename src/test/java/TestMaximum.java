import com.bridgelabz.genericproblem.Maximum;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgelabz.genericproblem.Maximum;


public class TestMaximum<E extends Comparable<E>, findMaximum> {
    Maximum maximum;
    @Test
    public void givenThreeIntegerNumber_ShouldReturnMaximumValue() {
        Integer[] intNum = {6, 2, 1, 11, 20};
       // maximum = new findMaximum();
        Integer maxInteger = maximum.findMaximum(intNum);
        maximum.printMax(maxInteger);
        Assert.assertEquals(Integer.valueOf(20), maxInteger);
    }

    @Test
    public void givenThreeFloatNumber_ShouldReturnMaximumValue() {
        Float[] floatNum = {6.1f, 2.8f, 4.6f, 1.1f, 9.8f};
        //maximum = new findMaximum();
        Float maxFloat = maximum.findMaximum(floatNum);
        maximum.printMax(maxFloat);
        Assert.assertEquals(Float.valueOf(9.8f), maxFloat);
    }

    @Test
    public void givenThreeStrings_ShouldReturnMaximumString() {
        String[] string = {" apple", " watermelon ", " orange "};
       // maximum = new findMaximum();
        String maxString = maximum.findMaximum(string);
        maximum.printMax(maxString);
        Assert.assertEquals(" watermelon ", maxString);
    }
}
