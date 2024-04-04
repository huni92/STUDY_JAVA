package com.ohgiraffers.section02.extend;

//public class RabbitFarm<T implements Animal> {} //에러남
//public class RabbitFarm<T extends Animal> {} //정상
//public class RabbitFarm<T extends Rabbit> {}

//public class RabbitFarm<T extends Rabbit & Animal>{}
//public class RabbitFarm<T extends Rabbit, Snake>{}
//클래스 & 인터페이스 사용가능, 인터페이스 & 클래스, 클래스 & 클래스는 사용불가 클래스, 클래스는 사용가능

public class RabbitFarm<T extends Rabbit> {
    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
