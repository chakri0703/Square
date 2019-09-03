package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void givenZeroLengthAndWidth_whenCalculateArea_thenShouldReturnZero(){

        Rectangle rectangle=new Rectangle   (0.0f,0.0f);

        Assertions.assertEquals(0,rectangle.area());
    }
    @Test
    void givenLengthAndWidth_whenCalculateArea_thenShouldReturnArea(){
        Rectangle rectangle=new Rectangle(1.0f,1.0f);

        Assertions.assertEquals(1.0f,rectangle.area());
    }

    @Test
    void givenZeroLengthAndNonZeroWidth_whenCalculateArea_thenReturnAreaZero(){
        Rectangle rectangle=new Rectangle(0.f,1.0f);
        Assertions.assertEquals(0.0f,rectangle.area());
    }
    @Test
    void givenZeroLengthAndWidth_WhenCalculatePerameter_ThenShouldReturnZero(){

        Rectangle rectangle=new Rectangle(0.f,0.0f);
        Assertions.assertEquals(0.0f,rectangle.perameter());
    }
}


