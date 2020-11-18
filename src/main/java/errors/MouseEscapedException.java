package errors;

import mouse.Mouse;

public class MouseEscapedException extends RuntimeException {
    public MouseEscapedException() {
        super();
    }
    public MouseEscapedException(String s) {
        super(s);
    }
    public MouseEscapedException(String s, Throwable throwable) {
        super(s, throwable);
    }
    public MouseEscapedException(Throwable throwable) {
        super(throwable);
    }
    public MouseEscapedException(Mouse mouse) {
        super(String.format("Mouse at (%.4f, %.4f) escaped", mouse.X(), mouse.Y()));
    }

}
