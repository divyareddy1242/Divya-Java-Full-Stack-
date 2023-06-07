// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int a[] = new int[]{9, 10, 500, 80,70};
        int i, j;
        int b[] = new int[6];
        //int smallest=0;
        // int largest =0;
        for (i = 0; i < a.length - 1; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int largest = a[i];
                    a[i] = a[j];
                    a[j] = largest;

                }
            }
        }
        for (i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("Smallest Element:" +b[0]);
        System.out.println("Largest Element:" +b[a.length-1]);
    }
}