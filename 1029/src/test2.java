
class Peo
{
    public String name;
    public int age;
    public static int b=1;
    public static void eat()
    {
        System.out.println("hhh");
        b=2;

    //    age=1;
    }

    public void show() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
        eat();
    }
}

class Stu
{
    private String name;
    public int age;
    public static int b=1;

    public String getName()
    {
        return  name;
    }
    public void setName (String n)
    {
        this.name=n;
    }
    public static void eat()
    {
        System.out.println("hhh");
    }

    public void show() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class TestDemo{
    public int a;
    public static int count;
}


public class test2 {

    public static void main(String[] args) {
        Stu s=new Stu();
        System.out.println(s.getAge());
        s.setName("bbb");
        s.setAge(10);
        System.out.println(s.getAge());
        s.show();
        System.out.println(s);
     //   b=1;
//        TestDemo t1 = new TestDemo();
//t1.a++;
//TestDemo.count++;
//System.out.println(t1.a);
//System.out.println(TestDemo.count);
//System.out.println("============");
//
//TestDemo t2 = new TestDemo();
//t2.a++;
//TestDemo.count++;
//System.out.println(t2.a);
//System.out.println(TestDemo.count);
    }
}
