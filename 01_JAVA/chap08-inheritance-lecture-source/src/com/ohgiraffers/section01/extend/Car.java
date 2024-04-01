package com.ohgiraffers.section01.extend;

public class Car { //Car도 Object를 상속받은것 컴파일 이유로 따로 안적어줘도된다.

    private boolean runningStatus;

    public Car() {
        // super(); 라는게 호출 돼있는거임 알아서 컴파일 되기 때문에 안나오는것

        System.out.println("Car 클래스 기본 생성자 호출됨...");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다~");
    }

    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빵!빵!");
        } else {
            System.out.println("주행 중이 아닌 상태에는 경적을 울릴 수 없습니다.");
        }
    }

    //private boolean isRunning() {} //자식이 상속받지 못함 private
    protected boolean isRunning() {
        return runningStatus;
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
