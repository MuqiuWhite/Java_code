package com.bb.demo1;
class bird
{
    public String na;
    public void eat()
    {
        System.out.println("bi:eat");
    }
    public void fly()
    {
        System.out.println("bi:fly");
    }

}
class base
{
    public int a;
}
class dd extends base
{
    public int v;
}


class animal
{
    public String na;
    public void eat()
    {
        System.out.println(this.na+"an:eat");//cat继承父类的eat，最后打印
    }
    public void sl()
    {
        System.out.println("an:sl");
    }
    public animal(String na)
    {
        this.na=na;
        System.out.println(this.na+"an:na");//第一条打印
    }
}

class cat extends animal
{
    //public String na;
//    public void eat()
//    {
//        System.out.println(na+"cat:eat");
//    }
    public cat(String na)
    {
        super(na);//去父类，这个必须放在第一行
        System.out.println("cat:na");//第二条
    }

}

public class TestDemo {
    public static void main(String[] args) {

       cat c=new cat("lll");//调用带有一个参数的构造方法
       c.eat();

    }
}
