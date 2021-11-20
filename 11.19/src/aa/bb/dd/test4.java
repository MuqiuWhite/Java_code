package aa.bb.dd;
class animal
{
    protected String name;
    public animal(String name)
    {
        this.name=name;
    }
}

interface Fly
{
    void fly();
}
interface Run
{
    void run();
}
interface Swim
{
    void swim();
}

class fish extends animal implements Swim{
    public fish(String name)
    {
        super(name);
    }
    public void swim()
    {
        System.out.println(this.name+"游泳");
    }
}

class frog extends animal implements Run, Swim {
    public frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}

class cat extends animal implements Run
{
    public cat(String name)
    {
        super(name);
    }

    public void run()
    {
        System.out.println(this.name + "正在喵喵跑");
    }
}

class duck extends animal implements Run,Swim,Fly
{
    public duck(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println(this.name + "正在嘎嘎跑");
    }
    public void fly()
    {
        System.out.println(this.name + "正在嘎嘎飞");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在嘎嘎游泳");
    }
}
class robot implements Run
{
    public void run()
    {
        System.out.println("跑步");
    }
}

public class test4 {
    public static void walk(Run r)
    {
        System.out.println("散步");
        r.run();
    }
    public static void main(String[] args) {
        robot b=new robot();
        b.run();

        Run r =new robot();
        r.run();

        walk(r);

        Run r2 =new frog("青蛙");
        walk(r2);


    }
}
