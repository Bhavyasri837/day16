class person
{
    person(int a)
    {
        System.out.println("person class constructor");
        System.out.println(a);
    }
}
class student extends person{
    student(float b)
    {
        super(40);
        System.out.println("student calss constructor");
        System.out.println(b);
    }
}
class test 
{
    public static void main(String args[])
    {
        student s=new student(25.66f);
    }
}
