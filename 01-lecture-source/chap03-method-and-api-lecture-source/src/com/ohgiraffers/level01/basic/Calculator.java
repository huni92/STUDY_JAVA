package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod() {
        int result = sumTwoNumber(10, 20);
        int result2 = minusTwoNumber(10, 5);
        int result3 = multiTwoNumber(10, 5);
        int result4 = divideTwoNumber(10, 5);

        System.out.println("10과 20의 합 : " + result);
        System.out.println("10과 5의 차 : " + result2);
        System.out.println("10과 5의 곱 : " + result3);
        System.out.println("10과 5의 나눈 후 몫 : " + result4);
    }

    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public int minusTwoNumber(int a, int b) {
        return a - b;
    }

    public int multiTwoNumber(int a, int b) {
        return a * b;
    }

    public int divideTwoNumber(int a, int b) {
        return a % b;
    }
}
