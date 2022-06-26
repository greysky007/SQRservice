package ru.netology.sqr.squares.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({

            "3, 201, 301",//граничное значение верха диапазона
            "3, 199, 299",//граничное значение верха диапазона
            "0, 0, 81", //граничное значение для нижней границы перебора чисел
            "90,0,10000" //граничное значение для верхней границы перебора чисел
    })
    public void test(int expected, int lowBounds, int highBounds) {
        SQRService service = new SQRService();
        //int expected=1;
        int actual = service.enumNum(lowBounds, highBounds);
        Assertions.assertEquals(expected, actual);

    }
}
