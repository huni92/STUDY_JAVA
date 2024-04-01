package com.ohgiraffers.section01.extend;

public class RacingCar extends Car{

    public RacingCar() {
        System.out.println("RacingCar 클래스 기본 생성자 호출됨");
    }

    @Override
    public void run() {
        //super.run(); 이렇게 작성하면 그냥 부모클래스의 run 메소드를 쓴다는 의미
        System.out.println("레이싱카가 전속력으로 질주합니다!!!!");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울리지 않습니다. (조용....)");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }
}
