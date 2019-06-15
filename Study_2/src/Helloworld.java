public class Helloworld {
    public static void main(String[] args){
        System.out.println("");
        System.out.println("Hello World!\nJAVA书 P65 3.11题");
        double s = 0;
        for(int i = 0; i <= 20; i++)
            s+=Math.pow(2,i)-1;
        System.out.println("s = "+s);
    }
}
