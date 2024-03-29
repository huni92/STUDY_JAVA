package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest() {}

    public int getNonStaticCount() {
        return this.nonStaticCount;
    }

    public int getStaticCount() {
        return StaticFieldTest.staticCount; //static 은 필드명.변수명으로 사용하는게 관례
    }

    public void increaseNonStaticCount() {this.nonStaticCount++;}

    public void increaseStaticCount() {StaticFieldTest.staticCount++;}
}
