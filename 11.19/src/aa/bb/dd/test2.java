package aa.bb.dd;

interface shape
{
    int a=10;
    void draw();
//    default void func()
//    {
//        System.out.println("aaa");
//    }
}

class cycle implements shape
{
    public void draw()
    {
        System.out.println("○");
    }
}

class react implements shape
{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}


class tra implements shape
{
    public void draw()
    {
        System.out.println("画一个三角形");
    }
}
public class test2 {
    public static void drawmap(shape x)
    {
        x.draw();
    }
    public static void main(String[] args) {
        shape s1=new cycle();
        drawmap(s1);
    }
}
