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