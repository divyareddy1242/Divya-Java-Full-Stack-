package week2;

public class Excep {
    public static int stringtoint(String s2) {
        int number = Integer.parseInt(s2);
        System.out.println(number);
        return number;
    }
    public static void main(String[] args)
    {
        try
        {
            stringtoint("123");
            stringtoint("test");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Given String cannot be converted into Integer");
        }

    }
}
