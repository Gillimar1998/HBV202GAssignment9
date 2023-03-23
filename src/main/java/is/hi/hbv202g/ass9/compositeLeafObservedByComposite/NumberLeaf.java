package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf extends Observable implements MathExpression {
    private int Number;

    public NumberLeaf(int Number) {
        this.Number = Number;
    }


    public void add(MathExpression expression) {

    }

    public Integer getResult() {
        return Number;

    }

    public void setValue(int Number) {
        this.Number = Number;
        notifyObservers();

    }
}
