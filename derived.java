class base
{
    void method1()
    {
        System.out.println("i am from base class");
    }
}
class derived extends base
{
    void method2()
    {
        System.out.println("i am from derived class");
    }
    public static void main(String args[])
    {
        derived d=new derived();
        d.method1();
        d.method2();
    }
}