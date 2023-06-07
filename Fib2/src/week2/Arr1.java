package week2;

public class Arr1 {
    public static void main(String args[])
    {
        int a[]=new int[]{10,20,5,60,9,100};
        System.out.println("Array Reverse");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" " );
        }
    }
}
