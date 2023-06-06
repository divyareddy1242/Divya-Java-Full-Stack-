// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public void Agegroup(int age)
    {
        if(age>=13 && age<=19 )
        {
            System.out.println("Age group is:Teen");
        }
        else if(age<13)
        {
            System.out.println("Age group is: Kid");
        }
        else if(age>19)
        {
            System.out.println("Age group is: Adult");
        }
        else
        {
            System.out.println("Agr group not found");
        }
    }
    public static void main(String[] args) {
         //System.out.println("Enter the age of the person");
        // Scanner sc=new Scanner(System.in);
         //int a=sc.nextInt();
         Main m=new Main();
         m.Agegroup(22);

    }
}