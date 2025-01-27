class main
{
public void add()
{
    int a=10;
    int b=34;
    System.out.println(a+b);
    System.out.println(a-b);
}
public void mul()
{
    int c=12;
    int d=2;
    System.out.println(c*d);
    System.out.println(c/d);
    System.out.println(c%d);
}
}
class addition{
public static void main(String args[])
{
    main o=new main();
    o.add();
    o.mul();
}
}
