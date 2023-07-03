package main.java.week2;

import java.util.Locale;

public class Vowels {
   public static void main(String args[])
   {
       String str = "Niharika";
       str=str.toLowerCase();
       int vowelcount = 0;

       //String str1=new String("Niharika");
       for( int i=0; i<str.length();i++)
       {
           if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u')
               vowelcount++;
       }
       System.out.println("No of the vowels in a given string :"+ vowelcount);
   }
}



