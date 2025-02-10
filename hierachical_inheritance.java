class acts
{
 static int a=10;
 static int b=23;
}
class base extends acts
{
    void add()
    {
    System.out.println(a+b);
    }
}
class c extends acts{
    void sub()
    {
        System.out.println(a-b);
    }
}
class d extends acts
{
    void mul()
    {
        System.out.println(a*b);
    }
}
class hierachical_inheritance
{
    public static void main(String args[])
    {
       base b=new base();
       b.add();
       c o1=new c();
       o1.sub();
       d o2=new d();
       o2.mul();
    }
}