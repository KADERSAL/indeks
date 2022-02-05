import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double boy, kilo;
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        double indeks = kilo / (boy*boy);
        System.out.println("Vücut kitle indeksiniz : " +indeks);
    }
}

