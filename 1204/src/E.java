public class E {
    //在测试类E的main方法中使用接口回调的形式来测试实现接口的类。
    public static void main (String[] args)
    {
        int n=6;
        A a=new Class_A();
        System.out.println(a.mathod(6));

        A b=new Class_B();
        System.out.println( b.mathod(6));
    }
}
