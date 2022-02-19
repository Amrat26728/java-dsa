package Searching;


class Floor_num {
     public static void main(String[] args) {
          int[] arr = {8, 9, 11, 13, 16, 18, 20};
          int target = 7;
          System.out.println("Floor number: "+floorNum(arr, target));
     }     

     // return greatest number greater than or equal to target.
     static int floorNum(int[] arr, int target) {
          int start = 0;
          int end = arr.length - 1;

          if (arr[0] > target) {
               return -1;
          }

          while (start <= end) {
               int mid = (int) ((start + end)/2);
               if (arr[mid] == target) {
                    return arr[mid];
               }

               else if (arr[mid] > target) {
                    end = mid - 1;
               }

               else if (arr[mid] < target) {
                    start = mid + 1;
               }
          }

          return arr[end];
     }
}
