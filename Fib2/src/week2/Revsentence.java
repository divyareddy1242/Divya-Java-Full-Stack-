package week2;

public class Revsentence {
    public static void main(String args[])
    {
        String str="Java J2EE Reverse Me";
        String a[]=str.split(" ");
        String s2=" ";
        //for(i=0;i<a.length-1;i++)
        int i=0,j;
         for( i=0;i<=a.length-1;i++)//i=3
         {
             s2 = a[i];
             s2=s2+" ";
             for (j = s2.length() - 1; j >= 0; j--)//j=4
             {
                 System.out.print(s2.charAt(j));
             }

         }
    }
}
