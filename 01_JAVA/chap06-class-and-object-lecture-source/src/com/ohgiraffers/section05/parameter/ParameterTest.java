package com.ohgiraffers.section05.parameter;

public class ParameterTest {
    
    public void testPrimaryType(int num) {
        System.out.println("매개변수로 전달 받은 값 = " + num);
    }

    public void testPrimaryTypeArray(int[] iarr) {
        System.out.println("매개변수로 전달 받은 값 = " + iarr);

        System.out.print("배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;

        System.out.print("변경된 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassType(RectAngle rectAngle) {

        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        System.out.println("사각형의 넓이와 둘레=================");
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setWidth(100);
        rectAngle.setHeight(100);

    }

    public void testVariableLengthArray(String name, String ...hobby) {
        // String ...hobby 이렇게 ... 문법을 쓰면 가변배열을 인자로 받을수있다. 항상 마지막에 작성해야함 String ...hobby, String name은 안된다.
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
    }

    /*
        public void testVariableLengthArray(String ...hobby) {
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
    }*/

}
