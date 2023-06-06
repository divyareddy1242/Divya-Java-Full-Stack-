// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    void fib(int n) {
        int num1 = 0, num2 = 1;
        System.out.print(num1 + "  " + num2 + " ");

        for (int i = 2; i <= n; i++)
        {
                int result = num1 + num2;
                System.out.print(result+"\t");
                num1=num2;
                num2 = result;

                //System.out.println(result);
            }
        }

    public static void main(String[] args) {
        Main m = new Main();
        m.fib(10);
    }
}