package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.thoughtworks.bootcamp.Rectangle.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

//    @BeforeEach
//    void setUp(){
//
//    }
    @Test
    void givenZeroSide_WhenCalculateArea_ThenShouldReturnZero(){

        Rectangle squareWithSideZero= createSquare(0.0f);
        assertEquals(0.0f,squareWithSideZero.area());
    }
    @Test
    void givenOneSide_WhenCalculateArea_ThenShouldReturnOne(){

        Rectangle squareWithSideOne =createSquare(1.0f);
        assertEquals(1.0f, squareWithSideOne.area());
    }

    @Test
    void givenNonZeroSide_WhenCalculateArea_ThenShouldReturnNonZero(){
      Rectangle squareWithNonZeroSide=createSquare(2.0f);
        assertEquals(4.0f,squareWithNonZeroSide.area());
    }
    @Test
    void givenZeroSide_WhenCalculatePerimeter_ThenShouldReturnZero(){

        Rectangle squareWithSideZero=createSquare (0.0f);
        assertEquals(0.0f,squareWithSideZero.perimeter());
    }
    @Test
    void givenOneSide_WhenCalculatePerimeter_ThenShouldReturnFour(){

        Rectangle squareWithSideOne = createSquare(1.0f);
        assertEquals(4.0f, squareWithSideOne.perimeter());
    }

}
