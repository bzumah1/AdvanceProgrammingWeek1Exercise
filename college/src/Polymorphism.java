class Sushant
{
    public void skills()
    {
        System.out.println("Something");
    }
}

class Student extends Sushant
{
    public void skills()
    {
        System.out.println("Programming");
    }
}

class Son extends Sushant
{
    public void skills()
    {
        System.out.println("Cooking");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Sushant sushant = new Sushant();
        Student student = new Student();
        Son son = new Son();

        sushant.skills();
        student.skills();
        son.skills();
    }
}
