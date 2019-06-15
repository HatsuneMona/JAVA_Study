import java.io.*;

public class C14_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count;
        byte b[]=new byte[256];
        BufferedInputStream in = new BufferedInputStream(System.in);
        BufferedOutputStream bout = new BufferedOutputStream(System.out);
        DataOutputStream out = new DataOutputStream(bout);
        PrintStream p = new PrintStream(System.out);
        try {
            p.print("请输入短文：");
            count=in.read(b);
            in.close();
            int i=0;
            while(i<count) {
                if(b[i]==' ' && b[i+1]==' ') {
                    int length=2;
                    for(int k=i+2;k<count;k++) {//记录空格长度(如果再下一个字符为空格，
                        //则将这次需要删除的字符长度加一)
                        if(b[k]!=' ')
                            break;
                        length++;
                    }
                    for(int j=i;j<count-length;j++) {//删除空格，length为空格个数
                        b[j]=b[j+length];
                    }
                    count-=length;//将字符长度减去空格长度
                }
                i++;
            }
            p.print("输入的短文为：");
            out.write(b,0,count);
            bout.flush();
            p.close();
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("发生I/O错误");
        }
    }
}
