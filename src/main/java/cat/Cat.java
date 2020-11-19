package cat;

import mouse.Mouse;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Cat {

    Cat(double X, double Y, double effectiveRange) {
        this.X = X;
        this.Y = Y;
        this.effectiveRange = effectiveRange;
    }

    private double X;
    private double Y;

    private double effectiveRange;

    public double range(double targetX, double targetY) {
        return sqrt(pow(X - targetX, 2) + pow(Y - targetY, 2));
    }

    public boolean catchMouse(Mouse target) {
        return (target.size() > 6 || effectiveRange >= range(target.X(), target.Y()));
    }
}
