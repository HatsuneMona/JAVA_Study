package c2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JApplet;

public class C13_2 extends JApplet{
    public void init() {
        Container cp = getContentPane();//得到窗口容器对象
        CString pa=new CString();//创建JPanel类的对象
        CSquare pa1=new CSquare();//创建JPanel类的对象
        pa.setPreferredSize(new Dimension(300,150));
        pa.setBackground(Color.cyan);//设置pa的对象背景颜色
        pa1.setPreferredSize(new Dimension(300,150));
        pa1.setBackground(Color.cyan);//设置pa1的对象背景颜色
        //cp容器的布局为BorderLayout，添加pa及pa1的对象到cp容器中
        cp.add(pa,BorderLayout.NORTH);
        cp.add(pa1,BorderLayout.SOUTH);
    }
    static public void main(String[] args){
        C13_2 a = new C13_2();
        a.init();
    }
}
