class Order_Agnostic_Binary_Search{
     public static void main(String[] args) {
          int[] arr = {85,75,43,21,20,15,7,5,3,1,-4,-45,-67};
          int index = order_agnostic_BS(arr);
          System.out.println("Index: " + index);
     }

     static int order_agnostic_BS(int[] arr) {
          int start = 0;
          int end = arr.length - 1;
          int target = 20;
          boolean isOA = arr[start] < arr[end];
          while(start <= end){
               int mid = (int)((start + end)/2);
               if (arr[mid] == target){
                    return mid;
               }
               if (isOA) {
                    if (target < arr[mid]){
                         end = mid - 1;
                    }
                    else{
                         start = mid + 1;
                    }
               }
               else {
                    if (target < arr[mid]){
                         end = mid + 1;
                    }
                    else{
                         start = mid - 1;
                    }
               }
          }
          return -1;
     }
}
