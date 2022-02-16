import java.util.Arrays;

class Insertion_Sort {

     public static void main(String[] args) {

          int[] arr = { 5, 3, 4, 1, 2 };

          System.out.print("Before Sorting: ");
          System.out.println(Arrays.toString(arr));

          insertion_sort(arr);

          System.out.print("After Sorting: ");
          System.out.print(Arrays.toString(arr));

     }

     static void insertion_sort(int[] arr) {

          for (int i = 0; i < arr.length - 1; i++) {
               boolean checker = true;
               for (int j = i + 1; j > 0; j--) {

                    if (arr[j] < arr[j - 1]) {

                         int temp;
                         temp = arr[j];
                         arr[j] = arr[j - 1];
                         arr[j - 1] = temp;
                         checker = false;

                    }

                    if (checker) {
                         break;
                    }

               }
          }

     }

}