public class Class_A implements A{

    @Override
    public int mathod(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
    //Class_A来实现接口Interface_A，实现int method(int n)接口方法时，要求计算1到n的和；
}
