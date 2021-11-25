import java.util.*;

public class Test {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        int b = sc.nextInt();
//        int c=0;
//        while(a%b!=0)
//        {
//            c=a%b;
//            a=b;
//            b=c;
//        }
//        double sum=0;
//        int f=1;
//        for(int i=1;i<=n;i++)
//        {
//            sum=sum+1.0/i*f;
//            f=-f;
//        }
//        int c=0;
//        for(int i=1;i<=100;i++)
//        {
//            if(i%10==9)
//                c++;
//            else if(i/10==9)
//                c++;
//        }
        int c=Math.pow(3,2);
        System.out.println(c);

    }
    public static void main2(String[] args)
    {
        int n=15,c=0;
        while(n!=0)
        {
            n=n&(n-1);
            c++;
        }
    }
    public static void main1(String[] args) {
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<32;i++)
        {
            if(((n>>i)&1)==1);

        }
    }

}
