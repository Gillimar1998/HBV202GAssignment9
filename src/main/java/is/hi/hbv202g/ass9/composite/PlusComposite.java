package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    private List<MathExpression> expressions;

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
}
