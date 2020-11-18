package cat;

public class CatBuilder {
    private double X;
    private double Y;
    private double range;

    public CatBuilder at(double X, double Y) {
        this.X = X;
        this.Y = Y;
        return this;
    }

    public CatBuilder withRange(double range) {
        this.range = range;
        return this;
    }

    public Cat assemble() {
        return new Cat(X, Y, range);
    }
}
