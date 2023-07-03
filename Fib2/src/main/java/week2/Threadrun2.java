package main.java.week2;


public class Threadrun2 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        Threadrun2 p2 = new Threadrun2();
        Thread t1 = new Thread(p2);
        t1.start();
    }
}