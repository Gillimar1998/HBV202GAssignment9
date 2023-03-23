package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class NumberLeafTest {

    @Test
    public void testNumberLeaf() {
        NumberLeaf number1 = new NumberLeaf(1);
        assertEquals("A leaf with value 1 should return 1", Optional.of(1), number1.getResult());

        NumberLeaf number2 = new NumberLeaf(2);
        assertEquals("A leaf with value 2 should return 2", Optional.of(2), number2.getResult());
    }

}

