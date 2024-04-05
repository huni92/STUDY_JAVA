package com.greedy.level01.basic.member.model.vo;

public class MemberVO {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public MemberVO() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "변경 후 id : " + id + '\n' +
                "변경 후 pwd : " + pwd + '\n' +
                "변경 후 name : " + name + '\n' +
                "변경 후 age : " + age + '\n' +
                "변경 후 gender : " + gender + '\n' +
                "변경 후 phone : " + phone + '\n' +
                "변경 후 email : " + email;
    }
}