class Linked_List{

     Node head = null;
     int size = 0;
     public static void main(String[] args) {
          Linked_List list1 = new Linked_List();
          list1.insert(1);
          list1.insert(2);
          list1.insert(3);
          list1.insert(4);
          list1.insert(5);

          list1.show_list();
          System.out.println();
          System.out.println("size: "+list1.listSize());

          System.out.println(list1.delete_ele(1)+" is deleted!");
          list1.show_list();
          System.out.println();
          System.out.println("size: "+list1.listSize());
     }

     // insert method to insert elements in list
     private void insert(int value) {
          Node node = new Node(value);

          if (head == null) {
               head = node;
               size += 1;
          }

          else {
               Node temp_node = head;
               while (temp_node.next != null) {
                    temp_node = temp_node.next;
               }
               temp_node.next = node;
               size += 1;
          }
     }

     // show_list method to print elements
     private void show_list() {
          Node temp_node = head;
          while (temp_node != null) {
               System.out.print(temp_node.value + ",");
               temp_node = temp_node.next;
          }
     }

     // listSize method to check no of elements in the list
     private int listSize() {
          return size;
     }

     // delete method to delete a element from list
     private int delete_ele(int value) {
          int delete_val = 0;
          if (head.value == value) {
               delete_val = head.value;
               head = head.next;
               size -= 1;
          }

          else {
               Node temp_node = head;
               while (temp_node.next != null) {
                    if (temp_node.next.value == value) {
                         delete_val = temp_node.next.value;
                         temp_node.next = temp_node.next.next;
                         size -= 1;
                         break;
                    }
                    else {
                         temp_node = temp_node.next;
                    }
               }
          }
          return delete_val;
     }

     // inner Node class
     class Node{
          int value;
          Node next;
          private Node(int value){
               this.value = value;
               this.next = null;
          }
     }

}