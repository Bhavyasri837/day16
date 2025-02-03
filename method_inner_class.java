class method_inner_class
{
    void outer_method()
    {
        class inner
        {
            void inner_method()
            {
                System.out.println("inner class method");
            }
        }
        inner i=new inner();
        i.inner_method();
    }
    public static void main(String args[])
    {
        method_inner_class m=new method_inner_class();
        m.outer_method();
        
    }
}