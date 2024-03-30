package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {} //다른곳에서 생성자 사용 불가능

    public static EagerSingleton getInstance() {return eager;}


}
