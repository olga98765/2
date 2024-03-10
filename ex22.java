// [10:09] Filip Kuca AEH
// 1.2) Napisz funkcję, która przyjmuje zakres liczb i zwraca tablicę liczb pierwszych w tym zakresie.

import java.util.ArrayList;
import java.util.Arrays;

public class ex22 {

    public static void main(String[] args) {
   int[] numbersArray = {1,2,3,4,5,6,7,11,21,23,60};
ArrayList<Integer> primeNumbersList = new ArrayList<>();


   for (int number : numbersArray) {
    boolean prime = true;

    if (number <= 1) {
      prime = false;
    } else {
      for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
          prime = false;
          break;
        }
      }
     

      if (prime == true) {
        primeNumbersList.add(number);

        System.out.println(primeNumbersList);
        // int[] primeNumbersArray = new int[number];

// Arrays.fill(primeNumbersArray, number);


      }
   
      

    
}

    
}
    }
    

  
  }









   

    
