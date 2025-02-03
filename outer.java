class outer
{
    class inner
    {
        public void inner_method()
        {
            System.out.println("i am from inner method");
        }
    }
    public void outer_method()
    {
        System.out.println("i am from outer method");
    }
    public static void main(String args[])
    {
    outer o=new outer();
    o.outer_method();
    outer.inner o1=o.new inner();
    o1.inner_method();
    }
}
