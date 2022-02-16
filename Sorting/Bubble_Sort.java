import java.util.Arrays;

class Bubble_Sort {

     public static void main(String[] args) {

          int arr[] = { 3, 1, 5, 4, 2 };

          System.out.print("Before sorting: ");
          System.out.println(Arrays.toString(arr));

          bubble_sort(arr);

          System.out.print("After sorting: ");
          System.out.println(Arrays.toString(arr));

     }

     static void bubble_sort(int[] arr) {

          for (int i = 0; i < arr.length - 1; i++) { // for loop for passes.
               boolean checker = true;
               for (int j = 0; j < arr.length - i - 1; j++) { // for loop for conparisions and exchanging values.

                    if (arr[j] > arr[j + 1]) {
                         
                         int temp;
                         temp = arr[j];
                         arr[j] = arr[j + 1];
                         arr[j + 1] = temp;
                         checker = false;

                    }

               }

               if(checker){

                    break;

               }

          }
          
     }

}