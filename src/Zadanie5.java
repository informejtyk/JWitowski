public class Zadanie5 {
    public static void main(String[] args) {
        int wym1 = 3;
        int wym2 = 2;
        int wym3 = 4;
        int pom1 = wym1 * wym3;
        int pom2 = wym1 * wym3;
        int pom3 = wym2 * wym1;
        int pom4 = wym2 * wym2;
        int mieszkanie = pom1 + pom2 + pom3 + pom4;
        System.out.println("Pierwsze pomieszczenie ma powierzchnie " + pom1 + " metrow kwadratowych");
        System.out.println("Drugie pomieszczenie ma powierzchnie " + pom2 + " metrow kwadratowych");
        System.out.println("Trzecie pomieszczenie ma powierzchnie " + pom3 + " metrow kwadratowych");
        System.out.println("Czwarte pomieszczenie ma powierzchnie " + pom4 + " metrow kwadratowych");
        System.out.println("Cale mieszkanie ma powierzcheni " + mieszkanie + " metrow kwadratowych");

    }
}
