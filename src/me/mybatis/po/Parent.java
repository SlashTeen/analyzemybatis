package me.mybatis.po;

/**
 * Created by dell on 2017/8/22.
 */
public class Parent {
    public void init() {
        System.out.println("1,parent init:"+this);
        this.demo();
    }

    public void demo(){
        System.out.println("2,parent demo:"+this);
    }

    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.init();
    }
}
