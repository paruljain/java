package com.hotmail.paruljain.units;

public class Temperature {
    public float f2c(float f) {
        return (f-32)*5/9;
    }
    public float c2f(float c) {
        return c*9/5+32;
    }
}