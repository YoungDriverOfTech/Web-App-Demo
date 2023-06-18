package com.app.web.template;

public class Teacher extends People{

    @Override
    public void wakeup() {
        System.out.println("Waken up by alarm");
    }

    @Override
    public void goToSchool() {
        System.out.println("Taking subway go to school");
    }
}
