package com.ohgiraffers.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        /* 예제 문제를 기재해주세요 */

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/

        //System.out.println(y >= 5 || x < 0 && x > 2); //&& 연산자가 || 연산자보다 우선순위가 높기때문에 x < 0 && x > 2가 false로 먼저 값이 나오나 y >= 5 || false 인 상황에서 y >= 5 는 true 값이기에 정답은 true로 나온다.
        //System.out.println(y += 10 - x++); //y에 10을 더한 값을 다시 y에 대입해 y는 15, x++ 의 ++은 괄호안에 수식이 끝난 후 1을 더해주기 때문에 15-2 = 13이 나온다.
        //System.out.println(x+=2); //x값에 3를 더하고 다시 대입하여 5가 나온다.
        //System.out.println( !('A' <= c && c <='Z') ); //'A' 값은 c와 같기때문에 && 왼쪽값은 true 'Z' 값은 90이기 때문에 오른쪽도 true로 반환 하지만 앞에 !표로 인하여 not(true)이기 때문에 false를 반환
        //System.out.println('C'-c); //'C'값은 67이기때문에 결과값은 67-65 = 2
        //System.out.println('5'-'0'); //아스키코드에서 '5'은 53  '0'은 48이기 때문에 결과값은 53-48 = 5;
        //System.out.println(c+1); //아스키코드로 인해서 65+1 = 66
        //System.out.println(++c); //증감연산자가 앞에 있어 인해 65가 66로 먼저 연산되어 아스키코드값으로 인하여 B가 출력된다.
        //System.out.println(c++); //증감연산자가 뒤에 있어 System.out.println 출력 후 c값이 증가한다. 그로인해 출력은 A로 나온다.
        //System.out.println(c); //문자 그대로 출력되어 A로 나온다.

        
    }
}
