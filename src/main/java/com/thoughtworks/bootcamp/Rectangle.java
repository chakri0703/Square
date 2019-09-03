package com.thoughtworks.bootcamp;

public class Rectangle  {


    private float length;
    private float width;



    Rectangle(float lenght, float width) {
        this.length = lenght;
        this.width = width;
    }

    public static  Rectangle rectangle(float length,float width){
        return new Rectangle(length,width);
    }

    public static  Rectangle createSquare(float side){
        return new Rectangle(side,side);
    }

    public float area() {

        return length * width;
    }


    public float perimeter() {
        return 2 * (length + width);
    }
}
