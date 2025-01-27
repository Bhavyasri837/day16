import java.util.*;
class method_overloading
{
    public void arith()
    {
        int a=12;
        int b=34;
        System.out.println(a+b);
    }
    public void arith( Scanner sc)
    {
         int x=sc.nextInt();
         int y=sc.nextInt();
        System.out.println(x-y);
    }
    public void arith(double m,int n)
    {
        System.out.println(m*n);
    }
    public int arith(int u,int v)
    {
        return(u/v);
    }
    public static void arith(int p)
    {
       System.out.println(p%5);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        method_overloading o=new method_overloading();
        o.arith();
        o.arith(sc);
        double c=sc.nextDouble();
        int d=sc.nextInt();
        o.arith(c,d);
        int res=o.arith(87,5);
        System.out.println(res);
        method_overloading.arith(3);
    }
}