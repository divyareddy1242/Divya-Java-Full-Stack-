package main.java.week2;

public class Stringrotation {
    public static void main(String args[]) {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        if (s1.length() == s2.length()) {
            String s3 = s1 + s1;
            if (s3.contains(s2)) {
                System.out.println("True");
            } else
                System.out.println("False");
        } else
            System.out.println("Given Strings are of not equal length so strings are not rotational");
    }
}

