package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
    /*
    String name;
    int hp;


    // set은 내가 받겠다는 의미
    public void setinfo(String info){

        this.name = info;

    }

    public void setHp(int hp) {

        if(hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getInfo() {
        return "몬스터의 이름은 " + this.name + " 이고 체력은 " + this.hp + "입니다.";
    }
    */

    String kinds;
    int hp;


    // set은 내가 받겠다는 의미
    public void setinfo(String info){

        this.kinds = info;

    }

    public void setHp(int hp) {

        if(hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getInfo() {
        return "몬스터의 이름은 " + this.kinds + " 이고 체력은 " + this.hp + "입니다.";
    }

}
