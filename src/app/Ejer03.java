package app;

import java.util.Scanner;

public class Ejer03 extends Thread{
    Scanner datos = new Scanner(System.in);
    String nombre1;
    public Ejer03(){
        System.out.println("ingresar datos del alumno");
        System.out.println("ingresar Nombre 1: ");
        nombre1= datos.nextLine();
    }
    @Override
    public void run(){
        for (int i = 1; i <= 50; i++) {
            System.out.println(i+" metros"+" "+nombre1);
        }
        System.out.println("llego "+nombre1);
    }
    public static void main(String[] args) {
        Thread primero = new Ejer03();
        Thread Segundo = new Ejer03();
        Thread Tercero = new Ejer03();
        primero.start();
        Segundo.start();
        Tercero.start();
    }
}