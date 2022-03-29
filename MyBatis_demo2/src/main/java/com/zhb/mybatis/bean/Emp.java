package com.zhb.mybatis.bean;

public class Emp {
    private int eid;
    private String ename;
    private int age;
    private String sex;
    private Dept dept;


    public int getEid() {
        return eid;
    }



    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Emp(int eid, String ename, int age, String sex, Dept dept) {
        this.eid = eid;
        this.ename = ename;
        this.age = age;
        this.sex = sex;
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Emp() {
    }
}
