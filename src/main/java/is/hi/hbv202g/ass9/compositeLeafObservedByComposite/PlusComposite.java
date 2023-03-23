package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements Observer, MathExpression {
    private List<MathExpression> expressions;
    private int lastObservedResult;

    public PlusComposite() {
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
