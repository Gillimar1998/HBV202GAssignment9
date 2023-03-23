package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberLeafObservedTest implements Observer {

    private int lastObservedResult;
    private NumberLeaf number1;

    @Before
    public void setUp() {
        number1 = new NumberLeaf(1);
    }

    @Test
    public void testAttachAndUpdateAfterSetValue() {
        number1.attach((is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod.Observer) this);
        number1.setValue(3);

        assertEquals("A leaf observed by this testcase should call update method of this testcase after having " +
                        "set value of this leaf to 3 and this leaf should returns this new value 3 when asked by the update method",
                3, lastObservedResult);
    }

    @Override
    public void update() {
        lastObservedResult = number1.getResult();
    }
}

