package mouse;

import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
public class Mouse {

    public Mouse(double X, double Y, double size) {
        this.X = X;
        this.Y = Y;
        this.size = size;
    }

    private double X;
    private double Y;
    private double size;
}
