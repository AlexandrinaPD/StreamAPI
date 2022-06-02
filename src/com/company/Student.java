package com.company;

public class Student {

    private String fullName;
    private int age;
    private String group;
    int points;

    public Student(String fullName, int age, String group, int points) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
        this.points = points;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", points=" + points +
                '}';
    }
}
