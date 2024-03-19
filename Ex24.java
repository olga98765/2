//1.4) Napisz funkcję rekurencyjną, która oblicza sumę liczby całkowitej, dodając do niej wszystkie liczby od 1 do tej liczby.
//Link: https://pl.wikipedia.org/wiki/Rekurencja

public class Ex24 {

    public static void main(String[] args) {
        int number = 316;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;

        }
        
        System.out.println("Wynik " + sum);

    }
}