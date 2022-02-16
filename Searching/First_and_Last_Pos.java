import java.util.Arrays;

class First_And_Last_Pos{
     public static void main(String[] args) {
          int[] arr = {5, 7, 7, 8, 8, 10};
          int target = 10;
          System.out.println(Arrays.toString(firstAndLastPos(arr, target)));
     }

     static int[] firstAndLastPos(int[] arr, int target) {
          int[] indices = new int[2];
          int start = 0;
          int end = arr.length - 1;
          int lower_index = -1;
          int upper_index = -1;
          while (start <= end) {
               int mid = (int) ((start + end)/2);
               if (arr[mid] == target) {
                    while (arr[mid - 1] == target) {
                         lower_index = mid - 1;
                         mid = lower_index;
                    }
                    while (arr[mid + 1] == target) {
                         upper_index = mid + 1;
                         mid = upper_index;
                    }
                    indices[0] = lower_index;
                    indices[1] = upper_index;
                    return indices;
               }

               else if (arr[mid] < target) {
                    start = mid + 1;
               }

               else if (arr[mid] > target) {
                    end = mid - 1;
               }
          }
          indices[0] = lower_index;
          indices[1] = upper_index;
          return indices;
     }
}