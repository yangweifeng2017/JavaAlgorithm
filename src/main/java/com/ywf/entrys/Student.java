package com.ywf.entrys;

/**
 * ClassName Student
 * 功能: Student 实体
 * Author yangweifeng
 * Date 2019-07-14 20:28
 * Version 1.0
 **/
public class Student {

    private  Integer id;
    private  String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private  String gender;
    private  Integer age;

    public Student(Integer id, String name, String gender, Integer age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", age=" + age + '}';
    }
}
