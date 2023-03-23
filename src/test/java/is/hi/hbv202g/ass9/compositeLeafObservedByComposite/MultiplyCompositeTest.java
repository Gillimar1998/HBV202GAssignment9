package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MultiplyCompositeTest {

    private MultiplyComposite multiplyComposite;

    @Before
    public void createMultiplyComposite() {
        multiplyComposite = new MultiplyComposite();
    }

    @Test
    public void testOneElementMultiplyComposite() {

        NumberLeaf number2 = new NumberLeaf(2);

        multiplyComposite.add(number2);
        assertEquals("A multiply composite consisting only of one leaf with value 2 should return 2",
                Optional.of(2), multiplyComposite.getResult());
    }

    public void testTwoElementMultiplyComposite() {

        NumberLeaf number2 = new NumberLeaf(2);
        NumberLeaf number4 = new NumberLeaf(4);

        multiplyComposite.add(number2);
        multiplyComposite.add(number4);
        assertEquals("A multiply composite consisting of leafs with values 2 and 4 should return 8",
                Optional.of(8), multiplyComposite.getResult());
    }

    public void testNestedMultiplyComposite() {

        NumberLeaf number2 = new NumberLeaf(2);
        NumberLeaf number4 = new NumberLeaf(4);

        multiplyComposite.add(number2);
        multiplyComposite.add(number4);

        MultiplyComposite multiplyComposite2 = new MultiplyComposite();
        multiplyComposite2.add(multiplyComposite);
        multiplyComposite2.add(multiplyComposite);
        assertEquals("A multiply composite consisting two further multiply composites, each consisting of leafs with " +
                "values 2 and 4 should return (2*4)*(2*4)=64", Optional.of(64), multiplyComposite.getResult());
    }

}
