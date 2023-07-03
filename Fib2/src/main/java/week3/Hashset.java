package main.java.week3;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();

        names.add("Albert");
        names.add("Anu");
        names.add("Niha");
        names.add("Niha");
        names.add("Divi");
        System.out.println(names);
        Iterator<String> itr = names.iterator();
        System.out.println("Printing names using iterator: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\n" + "printing names using ForEach Loop: ");
        names.forEach(name -> System.out.print(name + " "));
        System.out.println("\n" + "Printing names using Streams ForEach is: ");
        names.stream().forEach(name -> System.out.print(name + " "));
    }
}
