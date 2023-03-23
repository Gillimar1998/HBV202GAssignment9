package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {
    private int Number;

    public NumberLeaf(int Number) {
        this.Number = Number;
    }


    public void add(MathExpression expression) {

    }

    public Integer getResult() {
        return Number;

    }
}
