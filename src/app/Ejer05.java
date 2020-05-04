package app;

import java.util.Scanner;

public class Ejer05 extends Thread {
    Scanner datos = new Scanner(System.in);
    int nota=0;
    int cont;
    int cant_notas;
    public Ejer05(int cant_notas) {
        this.cant_notas=cant_notas;
    }

    @Override
    public void run() {
        try {
            System.out.println("nota actual "+"("+this.cont+"+"+this.nota+")/"+this.cant_notas);
            this.cont=sumar();
        System.out.println(this.cont);
    } catch (Exception e) {
            e.getMessage();
        }
       
    }
    public int sumar() {
        System.out.println("ingresar Nota "+this.cant_notas);
        nota = datos.nextInt();
        System.out.println(nota);
        return cont = (cont + nota) / this.cant_notas;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread notas = new Ejer05(i);
            notas.start();
        }
        
    }
}