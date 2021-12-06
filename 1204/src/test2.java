import java.util.*;
public class test2 {

    public static void main2(String[] args) {

        int []a={1,2,3};
        int []b=change(a);
        print(b);

    }
    public static int[] change(int []a)
    {

        int []b=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i]*2;
        }
        return b;
    }

    public static void print(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(sc.hasNextInt())
        {
            n=sc.nextInt();
        }
        sc.close();
        Random ran=new Random();
        int l=ran.nextInt(111);
    }
}
