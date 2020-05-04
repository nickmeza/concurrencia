package app;

import java.util.Scanner;

public class Ejer05 extends Thread {
    Scanner datos = new Scanner(System.in);
    int nota=0;
    int cont;
    int cant_notas;
    public Ejer05(int cant_notas) {
        this.cant_notas=cant_notas;
        System.out.println("cont al empesar"+this.cont);
        System.out.println("ingresar Nota "+this.cant_notas);
        nota = datos.nextInt();
        System.out.println(nota);
    }

    @Override
    public void run() {
        try {
            System.out.println("nota actual "+"("+this.cont+"+"+this.nota+")/"+this.cant_notas);
            this.cont = (cont+nota)/cant_notas;
        System.out.println(this.cont);
    } catch (Exception e) {
            e.getMessage();
        }
       
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread notas = new Ejer05(i);
            notas.start();
        }
        
    }
}