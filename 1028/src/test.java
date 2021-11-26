import java.util.*;
import java.util.Arrays;
public class test {
    public static void main(String[] args) {

        int [] a={1,2};
        int [] a2=new  int []{1,3};
        int [] a3=new int[4];
        int l=a.length;
 //       System.out.println(l);
        for (int x:a) {
            System.out.println(x);
        }
       String ret=Arrays.toString(a);//将数组以字符串输出
        System.out.println(ret);
    }
}
