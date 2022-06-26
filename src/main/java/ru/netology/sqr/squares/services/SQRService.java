package ru.netology.sqr.squares.services;

public class SQRService {
    public int enumNum(int lowBound, int highBound) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i <= highBound) && (i * i >= lowBound)) {
                count++;

            }
        }
        return count;

    }
}
