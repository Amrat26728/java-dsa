import java.util.Arrays;

class Cyclic_Sort {
     public static void main(String[] args) {
          int[] arr = { 5, 4, 1, 3, 2 };

          System.out.print("Before Sorting: ");
          System.out.println(Arrays.toString(arr));

          csort(arr);

          System.out.print("After Sorting: ");
          System.out.println(Arrays.toString(arr));
     }

     static void csort(int[] arr) {
          int i = 0;
          while(i < arr.length) {
               int correct_index = arr[i] - 1;
               if (arr[i] != arr[correct_index]) {
                    swap(arr, i, correct_index);
               }
               else{
                    i++;
               }
          }
     }

     static void swap(int[] arr, int incorrect_index, int correct_index) {
          int temp = arr[incorrect_index];
          arr[incorrect_index] = arr[correct_index];
          arr[correct_index] = temp;
     }
}
