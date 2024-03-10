// [10:09] Filip Kuca AEH
// 1.2) Napisz funkcję, która przyjmuje zakres liczb i zwraca tablicę liczb pierwszych w tym zakresie.

public class ex22 {

    public static void main(String[] args) {
   int[] numbersArray = {1,2,3,4,5,6,7,11,21,23,60};
int[] primeNumbersArray;


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



    
}

    
    
}
    }
    

  
  }









   

    
