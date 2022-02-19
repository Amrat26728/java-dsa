package Sorting;

import java.util.Arrays;

class Selection_Sort {

     public static void main(String[] args) {

          int[] arr = { 3, 45, 21, 4, 1, -11, 56, 32 };
          System.out.print("Before Sorting: ");
          System.out.println(Arrays.toString(arr));

          selection_sort(arr);

          System.out.print("After Sorting: ");
          System.out.println(Arrays.toString(arr));

     }

     static void selection_sort(int[] arr) {

          // outer loop for passes.
          for (int i = 0; i < arr.length - 1; i++) {

               int index = 0;
               int max = arr[index];
               // inner loop to find max element in array.
               for (int j = 0; j < arr.length - 1 - i; j++) {

                    if (max < arr[j + 1]) {

                         max = arr[j + 1];
                         index = j + 1;

                    }

               }
               // swaping elements
               int temp;
               temp = arr[index];
               arr[index] = arr[arr.length - 1 - i];
               arr[arr.length - 1 - i] = temp;

          }

     }

}