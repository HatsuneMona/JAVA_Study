package miao;

public class Person {
    protected String name;
    protected  int age;
    public Person(String na,int ag){
        name=na;
        age=ag;
    }
    public Person(){};
    public void WhosThat(){
        System.out.println("【本函数将被子类覆盖】函数名：WhosThat");
        System.out.println("我的名字是："+name+"，我今年 "+age+" 岁了。【我不是一个学生】");
    }
}
