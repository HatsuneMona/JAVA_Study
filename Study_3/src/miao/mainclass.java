package miao;

public class mainclass {
    static public void main(String args[]){
        System.out.println("**********以下创建的是Person类**********");
        Person aperson = new Person("汪汪汪",10);
        aperson.WhosThat();
        System.out.println("**********以下创建的是Student类**********");
        Student astudent = new Student("喵喵喵",12,102054213);
        astudent.WhosThat();
        System.out.println("********以下通过Student测试重载函数********");
        int x = 6;
        int y = 6;
        double m = 22.33;
        double n = 33.22;
        astudent.calculate(x,y);
        astudent.calculate(m,n);
    }
}
