package app;

import java.util.Scanner;

public class App extends Thread{
    Scanner datos = new Scanner(System.in);
    String nombre,dia;
    double hora;
    public App(String nombre,String dia, double hora){
        this.nombre = nombre;
        this.dia=dia;
        this.hora=hora;
        System.out.println("ingresar datos del alumno");
        System.out.println("ingresar Nombre : ");
        nombre= datos.nextLine();
        System.out.println("Ingrese el Dia: ");
        dia = datos.nextLine();
        System.out.println("Imgrese la Hora: ");
        hora=datos.nextDouble();
    }
    @Override
    public void run() {
        if (hora>15) {
            System.out.println(nombre +" llegaste tarde el dia" + dia);
        }else{
            System.out.println(nombre+" Legaste temprano el dia" + dia);
        }
    }
    public static void main(String[] args) throws Exception{
        Thread alumn1 = new App("", "", 0);
        alumn1.start();

        Thread.sleep(3000);

        Thread alumn2 = new App("", "", 0);
        alumn2.start();
    }
}