package me.mybatis.po;

/**
 * Created by dell on 2017/8/22.
 */
public class Son extends Parent {
    public void init(){
        super.init();
        System.out.println("3,son init"+this);
        this.demo();
    }

    public void demo(){
        System.out.println("4,son demo"+this);
    }

    public static void main(String[] args){
        Son son=new Son();
        son.init();
        System.out.println("-------------------");
        Parent parent=new Son();
        parent.init();
    }
}
