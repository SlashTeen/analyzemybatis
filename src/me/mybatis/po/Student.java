package me.mybatis.po;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable{
    private String sno;

    private String sname;

    private String ssex;

    private String sage;

    private List<Score> scores;

    public Student(){

    }

    public Student(String sno,String sname,String ssex,String sage){
        this.sno=sno;
        this.sname=sname;
        this.ssex=ssex;
        this.sage=sage;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}