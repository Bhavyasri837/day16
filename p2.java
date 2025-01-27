import java.util.*;
class p2
{
    public int m1(int a,int b)
    {
        return a*b;
    }
    public static void main(String args[])
    {
        p2 o=new p2();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int res=o.m1(x,y);
        System.out.println(res);
    }
}