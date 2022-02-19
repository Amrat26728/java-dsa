package Searching;

class Ceiling_num {
     public static void main(String[] args) {
          int[] arr = {8, 9, 11, 13, 16, 18, 20};
          int target = 22;
          System.out.println("Ceiling number: "+ceilingNum(arr, target));
     }

     // return smallest number greater than or equal to target.
     static int ceilingNum(int[] arr, int target) {

          int start = 0;
          int end = arr.length - 1;

          if (arr[arr.length - 1] < target) {
               return -1;
          }

          else {
               while (start <= end) {
                    int mid = (int)((start + end)/2);
                    if (arr[mid] == target) {
                         return arr[mid];
                    }

                    else if (arr[mid] < target) {
                         start = mid + 1;
                    }

                    else if (arr[mid] > target) {
                         end = mid - 1;
                    }
               }
          }

          return arr[start];
     }
}