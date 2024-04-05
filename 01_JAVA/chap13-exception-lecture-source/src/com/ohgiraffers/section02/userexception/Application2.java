package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;


public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        /* catch는 좁은 범위에서 넓은 범위로 가야함. 예외가 상속 관계일 경우 앞쪽에서 넓은 범위를 먼저 처리해버리면 뒤 catch 가 필요없게 된다. */
        try {
            //et.checkEnoughMoney(20000, 30000);
            et.checkEnoughMoney(-50000, 30000);
            System.out.println("정상동작하니?");
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생!!!");
            System.out.println(e.getMessage());
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생!!!");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생!!!");
            System.out.println(e.getMessage());
        } finally {
            /* 예외 발생 여부와 상관없이 실행 */
            System.out.println("finally 블럭 내용이 동작함");
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
