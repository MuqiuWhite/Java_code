import java.sql.SQLOutput;
import java.util.*;
public class test {

    public static int bb(int b,int c) {
        return b+c;
    }
    public static int cc(int b,int c,int d) {
        return a(a(b,c),d);
    }
    public static int a(int b,int c) {
        return b>c?b:c;
    }
    public static int n(int b) {
        int i=1,m=1,s=0;
        for(i=1;i<=b;i++)
        {
            m=i*m;
            s+=m;
        }
        return s;
    }
    public static void main(String[] args) {
        int b=5;
        System.out.println(n(5));
//        System.out.println("输入");
//        int b=3,c=2,a=1;
//        int r=cc(a,c,b);
//        int d=bb(a,b);
//        System.out.println(d);
    }
}
