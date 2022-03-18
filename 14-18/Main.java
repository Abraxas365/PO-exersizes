public class MyClass {
    public static void main(String args[]) {
      System.out.println("Answer");
      
    }
    
    
    //method for p1
    public Node findIntersection(myLinkedList list1, myLinkedList list2){
          Node list1var = list1.head;
          Node list2var = list2.head;
          
          //get lengths of lists by iterating through them
          int list1length = 1;
          int list2length = 1;
          while(list1var.next != null){
              list1var = list1var.next;
              list1length++;
          }
          while(list2var.next != null){
              list2var = list2var.next;
              list2length++;
          }
          
          list1var = list1.head;
          list2var = list2.head;
          
          //set pointers to have the same-sized length of list remaining
          while(list1length > list2length){
              list1var = list1var.next;
              list1length--;
          }
          while(list1length < list2length){
              list2var = list2var.next;
              list2length--;
          }
          
          //iterate through remaining lists until there's an intersection
          while(list1var != null){
              if(list1var == list2var){ //intersection
                  return list1var;
              } else { //iterate through lists
                  list1var = list1var.next;
                  list2var = list2var.next;
              }
          }
        return list1var;
        
    }
}