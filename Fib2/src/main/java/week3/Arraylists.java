package main.java.week3;
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
public class Arraylists {
    public static void main(String args[])
    {
        ArrayList<String> subject=new ArrayList<String>();
        subject.add("Physics");
        subject.add("Chemistry");
        subject.add("Biology");
        System.out.println(subject);
        //Using for-loop
        for(int i=0;i<subject.size();i++)
        {
            System.out.println(subject.get(i));
        }
        //Using enhanced for-loop
        for(String s:subject)
        {
            System.out.println(s);
        }
        //Using iterator
        ListIterator<String>li=subject.listIterator();
        {
            while (li.hasNext()) {
                System.out.println(li.next());
            }
        }
        subject.stream().forEach(System.out::println);//Using for-each and parallel stream

    }
}
