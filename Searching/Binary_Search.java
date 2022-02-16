class Binary_Search{

     public static void main(String[] args) {
          int[] arr = {-2,3,5,32,55,76,78,98,423};
          int index = binary_search(arr);
          System.out.println("Index: " + index);
     }

     static int binary_search(int[] arr) {
          int start = 0;
          int end = arr.length-1;
          int target = 3;
          while (start<=end){
               int mid = (int)((start+end)/2);    
               if (target == arr[mid]){
                    return mid;
               }
               else if (target > arr[mid]){
                    start = mid + 1;
               }
               else if (target < arr[mid]){
                    end = mid - 1;
               }

          }
          return -1;
     }

}