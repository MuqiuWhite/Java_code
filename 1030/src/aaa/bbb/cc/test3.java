package aaa.bbb.cc;

//import aaa.bbb.ccc.AN;


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

class AN{

    public String name;
    public AN(String name)
    {
        this.name=name;
        eat();
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
    public String huzi;

    public  cat(String name)
    {
        super(name);//去调用父类
        //super.eat();
        //this.huzi=huzi;//给自己的胡子赋值
    }

    public void sleep()
    {
        System.out.println(this.name+"cat:sleep");
    }
    public void eat()
    {
        System.out.println(this.name+"cat:eat");
    }

    public void func()
    {
        System.out.println(this.name);//当前Cat这个对象的引用
    }
}

public class test3 {

    public static void main(String[] args) {

        cat cc=new cat("猫");

    }



    public static void main4(String[] args) {
        AN aa=new cat("鸟");


        //调用子类的方法
        //向下转型， 父类的引用 赋值给子类
        if(aa instanceof bird)
        {
            bird bb = (bird) aa;
            bb.fly();
        }
    }








    public static void main3(String[] args) {
        AN an=new cat("qq");
        an.eat();
    }





    public static AN func()
    {
        cat vv=new cat("qq");//cat继承AN,子类对象保存子类对象引用。直接给AN进行引用
        return vv;
    }
    public static void main2(String[] args) {

        AN an=func();
    }
    public static void bbbb(AN pp)
    {
        pp.eat();
    }
    public static void main1(String[] args)
    {
        bbcat a=new bbcat("hh");//hh传给bbcat
        a.eat();
        AN aa=new AN("dd");
        cat vv=new cat("qq");

    }
}
