import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj cene detaliczna plytki");
        double cena = klawiatura.nextDouble();

        double marza = 0.4;

        double zysk = cena * marza;

        System.out.println(zysk);
    }
}
