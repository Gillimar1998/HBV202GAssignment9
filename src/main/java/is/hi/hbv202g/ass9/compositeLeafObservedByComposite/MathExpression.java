package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public interface MathExpression {
    void add(MathExpression expression);

    Integer getResult();
}
