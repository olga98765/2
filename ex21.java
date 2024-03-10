// 1.1) Napisz funkcję, która przyjmuje tablicę i liczbę do znalezienia, a następnie zwraca indeks tej liczby w tablicy (lub -1, jeśli nie znaleziono).

import java.util.Arrays;

public class ex21 {

    public static void main(String[] args) {

        int[] numbersArray = { 5, 1, 8, 2, 10, 50 };
        int number = 5;
        int index = Arrays.binarySearch(numbersArray, number);

        if (index >= 0) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}
