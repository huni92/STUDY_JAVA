package com.ohgiraffers.section01.generic;

public class GenericTest<T> { //<> 객체 타입으로 지정된 것만 넣어줄수있다. 레퍼클래스.. 등

    private T value; //<>컴파일시 타입이 결정

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}
