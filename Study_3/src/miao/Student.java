package miao;

public class Student extends Person{
    int no;
    public Student(String na,int ag,int n){
        super(na,ag);//这里用到了super。
        System.out.println("【Student的构造函数】这里用到了super函数");
        no = n;
    }
    public Student(){};
    public void WhosThat(){
        System.out.println("【已将父类的函数覆盖】函数名：WhosThat");
        System.out.println("我的名字是："+name+"，我今年 "+age+" 岁了。【我是一个学生】");
    }
    public void calculate(int a,int b){
        System.out.println("【重载函数A】函数名：calculate(int a,int b)");
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    public void calculate(double a,double b){
        System.out.println("【重载函数B】函数名：calculate(int a,int b)");
        System.out.println(a+" + "+b+" = "+(a+b));
    }
}
