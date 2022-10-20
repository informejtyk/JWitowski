import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double ankietowanie = 12467;

        double procentTyg = 0.14;

        double ludzieTyg = ankietowanie * procentTyg;

        double procentCyt = 0.64;

        double ludzieCyt = ludzieTyg * procentCyt;

        double ludzieTyg1 = Math.round(ludzieTyg);
        double ludzieCyt1 = Math.round(ludzieCyt);

        System.out.println(ludzieTyg1);
        System.out.println(ludzieCyt1);






    }
}
