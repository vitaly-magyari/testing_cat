package mouse;

import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
public class Mouse {

    public Mouse(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    private double X;
    private double Y;
}
