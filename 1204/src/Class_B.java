public class Class_B implements A {

    //Class_B来实现接口Interface_A，实现int method(int n)接口方法时，要求计算n的阶乘（n!）


    @Override
    public int mathod(int n) {
        int sum=1;
        for (int i = 1; i <=n; i++)
        {
            sum*=i;
        }
        System.out.println(n+"!="+sum);
        return sum;
    }
}
