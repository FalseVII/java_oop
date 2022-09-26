package com.tus.inheritance;

public class Drawing extends Art {
    public Drawing() {
        System.out.println("Drawing constructor");
    }

    public void sketch() {
        System.out.println("Drawing::sketch()");
    }

    @Override
    public String toString() {
        return "Drawing::toString()";
    }
}
