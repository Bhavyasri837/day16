class method_type
{
    public static void m1(int a,int b)
    {
         a+=b;
         b++;
        System.out.println(a);
        System.out.println(b);
    }
    public void swap(int c,int d)
    {
        int temp=c;
        c=d;
        d=temp;
        System.out.println(c+"\n"+d);
    }
    public static void main(String args[])
    {
        method_type.m1(4,6);
        method_type obj=new method_type();
        obj.swap(12,87);
    }
}