package com.anu.learning.oops.exception;

public class Checked extends Exception {
    public Checked() {
        super();
    }

    public Checked(String message) {
        super(message);
    }
}


class InkFinished extends Checked {
    public InkFinished() {
        super();
    }

    public InkFinished(String message) {
        super(message);
    }
}


class FeelingSleepy extends Checked {
    public FeelingSleepy() {
        super();
    }

    public FeelingSleepy(String message) {
        super(message);
    }
}
