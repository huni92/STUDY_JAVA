package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

public class Application {
    public static void main(String[] args) {
        MemberVO memberVO = new MemberVO();

        System.out.println("id : " + memberVO.getId());
        System.out.println("pwd : " + memberVO.getPwd());
        System.out.println("name : " + memberVO.getName());
        System.out.println("age : " + memberVO.getAge());
        System.out.println("gender : " + memberVO.getGender());
        System.out.println("phone : " + memberVO.getPhone());
        System.out.println("email : " + memberVO.getEmail());


        memberVO.setId("user01");
        memberVO.setPwd("pass01");
        memberVO.setName("홍길동");
        memberVO.setAge(20);
        memberVO.setGender('M');
        memberVO.setPhone("010-1234-5678");
        memberVO.setEmail("hong123@greedy.com");

        System.out.println(memberVO.toString());
    }
}
