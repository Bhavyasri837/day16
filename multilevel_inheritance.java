class a
{
    void m1()
    {
    System.out.println("i am from first base class");
    }
}
class b extends a
{
    void m2()
    {
    System.out.println("i am from an intermediate class which acts as parent for class c and child for class a");
    }
}
class c extends b
{
    void m3()
    {
    System.out.println("i am from an intermediate class which acts as parent for class multilevelinheritance and child class for class b");
    }
}
class multilevel_inheritance extends c
{
    void m4()
    {
        System.out.println("i am from derived class");
    }
public static void main(String args[])
{
    multilevel_inheritance o=new multilevel_inheritance();
    o.m1();
    o.m2();
    o.m3();
    o.m4();
}
}
