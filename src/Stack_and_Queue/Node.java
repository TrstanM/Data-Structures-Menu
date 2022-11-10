
package Stack_and_Queue;



/**
 *
 * @author boshu
 */
public class Node{
   private String val;
   private Node next;
   
   Node(String x) {
       val = x;
       next = null;
   }
   
   public void setVal(String val) {
       val = this.val;
   }
   public String getVal() {
       return val;
   }
   
   public void setNext(Node next) {
       next = this.next;
   }
   public Node getNext() {
       return next;
   }
}