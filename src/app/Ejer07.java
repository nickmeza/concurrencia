package app;

public class Ejer07 {
    //pares par = new pares();
    public static void main(String[] args) {
        Thread sum1 = new pares();
        sum1.start();
        Thread sum2 = new impares();
        sum2.start();
    }
}
class pares extends Thread{
    int sumador = 0;
    public pares(){
        System.out.println("pares");
    }
    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            if (i%2==0) {
                System.out.println(i);
                this.sumador = this.sumador+i;
            }
        }
        System.out.println("sumador de los pares "+this.sumador);
    }
}
class impares extends Thread{
    int sumador = 0;
    public impares(){
        System.out.println("impares");
    }
    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            if (i%2!=0) {
                System.out.println(i);
                this.sumador = this.sumador+i;
            }
        }
        System.out.println("sumador de los impares "+this.sumador);
    }
}
