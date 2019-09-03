package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    void givenZeroSide_WhenCalculateArea_ThenShouldReturnZero(){

        Square squareWithSideZero=new Square(0.0f);
        assertEquals(0.0f,squareWithSideZero.area());
    }
    @Test
    void givenOneSide_WhenCalculateArea_ThenShouldReturnOne(){

        Square squareWithSideOne = new Square(1.0f);
        assertEquals(1.0f, squareWithSideOne.area());
    }

    @Test
    void givenNonZeroSide_WhenCalculateArea_ThenShouldReturnNonZero(){
        Square squareWithNonZeroSide=new Square(2.0f);
        assertEquals(4.0f,squareWithNonZeroSide.area());
    }
}
