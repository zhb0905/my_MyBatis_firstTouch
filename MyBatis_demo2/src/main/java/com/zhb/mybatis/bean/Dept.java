package com.zhb.mybatis.bean;

import java.util.List;

public class Dept {
    private Integer did;
    private String dname;
    private List<Emp> emps;

    public Dept(Integer did, String dname, List<Emp> emps) {
        this.did = did;
        this.dname = dname;
        this.emps = emps;
    }

    public Dept() {

    }

    public Dept(Integer did, String dname) {
        this.did = did;
        this.dname = dname;


    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", emps=" + emps +
                '}';
    }
}
