package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    void givenZeroSide_WhenCalculateArea_ThenShouldReturnZero(){

        Square squareWithSideZero=new Square(0.0f);
        assertEquals(0.0f,squareWithSideZero.area());
    }
}
