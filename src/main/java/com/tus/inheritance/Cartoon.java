package com.tus.inheritance;

import org.jetbrains.annotations.NotNull;

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public void sketch() {
        System.out.println("Cartoon::sketch()");
    }

    public void tomAndJerry(){
        System.out.println("Cartoon::tomAndJerry()");
    }

    public void sketchIt(@NotNull Art art) {
        System.out.println("Cartoon::sketch(int i)");
    art.sketch();
    }

}


