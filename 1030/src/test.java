import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Stu
{
    private String name;
    private int age;
    public static int b=1;

    {
        System.out.println("实例代码块");
    }

    static
    {
        System.out.println("静态");
    }
    public Stu()
    {
        this("xxx",40);
        System.out.println("666");
    }
    public Stu(String name,int age)
    {
        this.name="111";
        this.age=30;
        System.out.println("Stu<String,int>");
    }
    public String getName()
    {
        return  name;
    }
    public void setName (String n)
    {
        this.name=n;
    }
    public  void eat()
    {
        System.out.println(this.getName());
        System.out.println(this.age);
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
public class test {
    public static void main(String[] args) {
        Stu s=new Stu();
        System.out.println("___________");
        Stu s2=new Stu();
        new Stu().eat();
    }
    public static void main1(String[] args) {

        Stu s=new Stu();
        Stu s1=new Stu("2345",30);
        System.out.println(s1);
    }
}
