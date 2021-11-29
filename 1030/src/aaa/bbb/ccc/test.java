package aaa.bbb.ccc;

import javax.rmi.CORBA.Util;
import java.util.Arrays;
import java.util.Date;

class AN{

    public String name;
    public AN(String name)
    {
        this.name=name;
    }
    public void eat()
    {
        System.out.println(this.name+"AN:eat");
    }

    public void sleep()
    {
        System.out.println("an:sleep");
    }


}


class cat extends AN
{
    //public String name;

    public  cat(String name)
    {
        super(name);//去调用父类
        super.eat();
    }

    public void sleep()
    {
        System.out.println(this.name+"cat:sleep");
    }


}

class bird extends AN
{
    public  bird(String name)
    {
        super(name);
    }
//    public String name;

//    public void eat()
//    {
//        System.out.println("bird:eat");
//    }
//
    public void fly()
    {
        System.out.println("bird:fly");
    }
}

class bbcat extends cat
{
    public  bbcat(String name)
    {
        super(name);//hh传过来了
        super.eat();
    }

}
class base
{
    public int data;

}

class dd extends  base
{

public int a;
    final int b=10;
}




    public class test {

    public static void main(String[] args)
    {
        bbcat a=new bbcat("hh");//hh传给bbcat
        a.eat();

    }


    public static void main1(String[] args) {

//        int []a={1,2,3,4,5};
//        java. util.Date date =new java.util.Date();
//        System.out.println(Arrays.toString(a));
        cat c=new cat("aa");
        //c.name="ee";
        c.eat();
        dd d=new dd();
        bird b =new bird("bb");
        b.eat();
        b.fly();
    }
}
