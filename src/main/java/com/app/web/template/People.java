package com.app.web.template;

public abstract class People {

    public void oneDay() {
        wakeup();
        washFace();
        goToSchool();
    }

    public void wakeup() {
        // empty
    }

    public void washFace() {
        System.out.println("Wash face and brush tooth");
    }

    public void goToSchool() {
        // empty
    }
}
