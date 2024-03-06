// 1.1) Napisz funkcję, która przyjmuje tablicę i liczbę do znalezienia, a następnie zwraca indeks tej liczby w tablicy (lub -1, jeśli nie znaleziono).

import java.util.Arrays;

public class ex21 {

    public static void main(String[] args) {

        int[] numbersTable = { 5, 1, 8, 2, 10, 5 };
        int number = 8;
        int index = Arrays.binarySearch(numbersTable, number);

        if (index >= 0) {
            System.out.println("indeks " + index);
        } else {
            System.out.println(-1);
        }
    }
}