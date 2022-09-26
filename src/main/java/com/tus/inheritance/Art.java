package com.tus.inheritance;

public class Art {

    public Art() {
        System.out.println("Art constructor");
    }

    public void sketch() {
        System.out.println("Art::sketch()");
    }

    @Override
    public String toString() {
        return "Art::toString()";
    }
}
