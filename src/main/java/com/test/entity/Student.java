package com.test.entity;

public class Student {
    private int xuehao;
    private String name;
    private String ssx;

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsx() {
        return ssx;
    }

    public void setSsx(String ssx) {
        this.ssx = ssx;
    }

    public Student(int xuehao, String name, String ssx) {
        this.xuehao = xuehao;
        this.name = name;
        this.ssx = ssx;
    }

    @Override
    public String toString() {
        return "Student{" +
                "xuehao=" + xuehao +
                ", name='" + name + '\'' +
                ", ssx='" + ssx + '\'' +
                '}';
    }
}
