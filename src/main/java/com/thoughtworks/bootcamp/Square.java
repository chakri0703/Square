package com.thoughtworks.bootcamp;

public class Square {
    private float side;

    Square(float side){
        this.side = side;
    }
    public float area() {
        return this.side*this.side;
    }
}
