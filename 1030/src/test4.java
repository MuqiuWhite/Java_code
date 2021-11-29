class shape
{
    public void draw()
    {

    }
}

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
public class test4 {

    public static void drawshapes1()
    {
      //  s.draw();
        react r=new react();
        cycle c=new cycle();
        tra t=new tra();
        String []shapes={"c","r","c","r","t"};
        for(String shape:shapes)
        {
            if(shape.equals("c"))
            {
                c.draw();
            }
            else if(shape.equals("r"))
                r.draw();
        }
    }

    public static void drawshapes()
    {
        shape []shapes ={new cycle(),new react(),new cycle()};
        for(shape s:shapes)
        {
            s.draw();
        }
    }
    public static void main(String[] args) {

        shape s1=new react();
        shape s2=new cycle();
        shape s3=new tra();
//        s1.draw();
//        s2.draw();
//        drawMap(s1);
//        drawMap(s2);
//        drawMap(s3);
        drawshapes1();
    }
}
