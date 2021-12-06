public class test1 {

    public static void main1(String[] args) {

        int []a={1,2};
        try {
            System.out.println(a[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("越界了大哥");
        }
        System.out.println("我显示出来啦");
    }
}
