import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        Scanner input =new Scanner(System.in);
        System.out.println("Kaç kg armut aldığınızı giriniz : ");
        int a = input.nextInt();
        System.out.println("Kaç kg elma aldığınızı giriniz : ");
        int e = input.nextInt();
        System.out.println("Kaç kg domates aldığınızı giriniz : ");
        int d = input.nextInt();
        System.out.println("Kaç kg muz aldığınızı giriniz : ");
        int m = input.nextInt();
        System.out.println("Kaç kg patlıcan aldığınızı giriniz : ");
        int p = input.nextInt();
        System.out.println("Armut kilo : " +a);
        System.out.println("Elma kilo : " +e);
        System.out.println("Domates kilo : " +d);
        System.out.println("Muz kilo : " +m);
        System.out.println("Patlıcan kilo : " +p);
        double toplam = armut*a + elma*e + domates*d + muz*m + patlican*p;
        System.out.println("Toplam tutar: " +toplam);
    }
}