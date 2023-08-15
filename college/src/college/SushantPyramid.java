package college;
public class SushantPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 4 - i; j > 0; j--)
            {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l < i + 1; l++)
            {
                    System.out.print(l);
            }
            System.out.println();
        }
    }
}
