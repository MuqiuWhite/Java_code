package aa.bb.dd;

import java.util.Arrays;
class stu implements Comparable<stu>
{
    public String name;
    public String sex;
    public int score;

    public stu(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }


    @Override
    public int compareTo(stu o) {
        if(this.score>o.score)//当前对象和传进来的参数比较
        {
            return 1;
        }
        else
            return -1;
    }
}



public class test5 {
    public static void main(String[] args) {
//        int []a={3,2,4};
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));

        stu s1=new stu("nihao","f",124);
        stu s2=new stu("qq","t",123);
        stu s3=new stu("dd","f",334);
        stu[] stus=new stu[3];
        stus[0]=s1;
        stus[1]=s2;
        stus[2]=s3;
        if(s1.compareTo(s2)>0)
        {
            System.out.println("s1大");
        }
        Arrays.sort(stus);
        System.out.println(Arrays.toString(stus));
    }


}
