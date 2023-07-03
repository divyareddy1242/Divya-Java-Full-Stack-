package main.java.week3.thread;

import java.util.ArrayList;
import java.util.Collections;

public class Lastobjectremoval {
    public static void main(String args[])
    {
        ArrayList<String> obj=new ArrayList<String>();
        obj.add("Harini");
        obj.add("Barini");
        obj.add("Dharani");
        Collections.sort(obj);
        System.out.println(obj.remove(obj.size()-1));
    }
}
