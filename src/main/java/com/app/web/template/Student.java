package com.app.web.template;

public class Student extends People{

    @Override
    public void wakeup() {
        System.out.println("Parents wake kid up");
    }

    @Override
    public void goToSchool() {
        System.out.println("Taking school bug go to school");
    }
}
