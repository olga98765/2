// [10:10] Filip Kuca AEH
// 1.3) Napisz funkcję, która przyjmuje tablicę i liczbę, a następnie zlicza ile razy ta liczba występuje w tablicy.

public class ex23 {

    public static void main(String[] args) {
        int[] numbersArray = { 1, 2, 3, 6, 5, 1, 2, 3, 2, 1, 1 };
        int number = 15;
        int sum = 0;

        for (int numberArray : numbersArray) {
            if (numberArray == number) {
                sum++;
                System.out.println(sum);
                break;
            } else {
                System.out.println("Liczba nie występuje w tablicy");
                break;
            }
        }
    }
}
