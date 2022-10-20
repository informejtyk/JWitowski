import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj swoje ulubione miasto");
        String miasto = klawiatura.nextLine();

        int dlugosc = miasto.length();

        String duza = miasto.toUpperCase();

        String mala = miasto.toLowerCase();

        char znak  =  miasto.charAt(0);

        System.out.println(dlugosc);
        System.out.println(duza);
        System.out.println(mala);
        System.out.println(znak);




    }
}
