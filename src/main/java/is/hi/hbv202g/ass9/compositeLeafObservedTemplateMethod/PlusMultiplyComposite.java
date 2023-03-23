package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class PlusMultiplyComposite {
    protected List<MathExpression> expressions;
    protected int lastObservedResult;

    public PlusMultiplyComposite() {
        this.expressions = new ArrayList<>();
    }

    public void add(MathExpression expression) {
        expressions.add(expression);
    }

    public Integer getResult() {
        int result = 0;
        for (MathExpression expression : expressions) {
            result += expression.getResult();
        }
        return result;
    }

    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
