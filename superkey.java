class demo
{
    int i=10;
    void show()
    {
        System.out.println("parent class i value is :"+i);
    }
}
class result extends demo
{
int i=20;
void show()
{
    super.show();
    System.out.println("the child class i value is:"+i);
}
}
class superkey
{
public static void main(String args[])
{
result r=new result();
r.show();
}
}
