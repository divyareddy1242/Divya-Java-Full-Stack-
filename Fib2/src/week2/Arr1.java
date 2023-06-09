package week2;

public class Arr1 {
    static int a[] = {10,20,30,40,50};

            static void reverse() {
                System.out.println("Reversed Array");
                int newArr[] = new int[a.length];
                for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
                    newArr[j] = a[i];

                }
                for (int i = 0; i < newArr.length; i++)
                    System.out.print(newArr[i] + " ");
                System.out.println("\n");
            }
            public static void main(String[] args){
                reverse();
            }
}
