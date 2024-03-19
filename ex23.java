// 1.3) Napisz funkcję, która przyjmuje tablicę i liczbę, a następnie zlicza ile razy ta liczba występuje w tablicy.

import java.util.Arrays;

public class Ex23 {

    public static void main(String[] args) {
        int[] numbersArray = { 1, 2, 3, 6, 5, 1, 2, 3, 2, 1, 1 };
        int number = 1;

        long count = Arrays.stream(numbersArray).filter(n -> n == number).count();

        System.out.println("Liczba " + number + " występuje w tablicy " + count + " razy.");
    }

}
