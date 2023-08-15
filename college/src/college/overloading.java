package college;
class sum {
    public int sum1(int a, int b)
    {
        return a+b;
    }
    public int sum1(int a, int b, int c)
    {
        return a + b + c;
    }
}
public class overloading {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        sum s = new sum();
        int sum2 = s.sum1(a, b, c);
        //int sum3 = s.sum1(a, b, c);

        System.out.println(sum2);
        //System.out.println(sum3);
    }
}
