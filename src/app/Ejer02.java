package app;

public class Ejer02 extends Thread{
    public static void main(String[] args) throws Exception{
        for (int i = 1; i <= 25; i++) {
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
}