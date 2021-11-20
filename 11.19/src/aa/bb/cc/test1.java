package aa.bb.cc;


class cycle extends shape
{
    //重写
    @Override
    public void draw()
    {
        System.out.println("画一个圆");
    }
}

class react extends shape
{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}


class tra extends shape
{
    public void draw()
    {
        System.out.println("画一个三角形");
    }
}


abstract class shape
{
    public abstract void draw();
    int a;
}


public class test1 {

    public static void drawmap(shape x)
    {
        x.draw();
    }
    public static void main(String[] args) {
        shape s1=new cycle();
        shape s2=new react();
        drawmap(s1);
    }
}
