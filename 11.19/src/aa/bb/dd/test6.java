package aa.bb.dd;

class Perspn implements Cloneable
{
    public int a;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Perspn p=(Perspn) super.clone();//复制person，并赋值给p
        p.m=(money)this.m.clone();//p的m对象要指向当前对象复制出来的m
        return p;
    }

    money m=new money();
}
class money implements Cloneable
{
    double mon=11;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class test6 {

    public static void main(String[] args) throws CloneNotSupportedException {
         int []a={1,2,3};
         int []a2=a.clone();
         Perspn p1=new Perspn();
        Perspn p2= (Perspn) p1.clone();

        p2.a=8;
        System.out.println(p1.a);
        System.out.println(p2.a);

        p2.m.mon=100;
        System.out.println(p1.m.mon);
        System.out.println(p2.m.mon);

    }
}
