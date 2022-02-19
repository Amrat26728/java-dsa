package Searching;

class Ceiling_char {
     public static void main(String[] args) {
          char[] arr = {'c', 'e', 'g', 'i', 'l', 'm'};
          char target = 'o';
          System.out.println("Ceiling Character: "+ceilingChar(arr, target));
     }

     // returns the index of smallest element in the array if target is last element or the target is the largest element then output will be index of first element.
     static int ceilingChar(char[] arr, char target) {
          int start = 0;
          int end = arr.length - 1;
          if ((arr[arr.length - 1] < target) || (target == arr[arr.length - 1])) {
               return 0;
          }
          while(start <= end) {
               int mid = (int)((start + end)/2);
               if (arr[mid] == target) {
                    return (mid + 1);
               }

               else if (arr[mid] > target) {
                    end = mid - 1;
               }

               else if (arr[mid] < target) {
                    start = mid + 1;
               }
          }
          return start;
     }
}
