package main.java.week2;
    public class Thread1 extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            Thread1 th = new Thread1();
            th.start();
        }
    }
