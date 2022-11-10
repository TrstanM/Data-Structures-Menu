
package MainStructures;

/**
 *
 * @author boshu
 */
import GUI_Package.GUI;
import Stack_and_Queue.StackClass;
import java.util.*;

public class Menu extends Hashmap{
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        StackClass nice = new StackClass();
        int select;
        
        do {
        System.out.println("Data Structures Menu");
        System.out.println("--------------------");
        System.out.println("1) Recursion\n2) Hash Map(Password Manager)\n3) Linked List(Item Vault)\n4) Queue(Web History)\n5) Stack(Palindrome)\n6) Exit");
        select = input.nextInt();
        
        switch (select) {
            case 1:
                nice.getrecursionMenu();
                break;
            case 2:
                nice.getHashmapMenu();
                break;
            case 3:
                nice.getLinkedListMenu();
                break;
            case 4:
                nice.getQueueMenu();
                break;
            case 5:
                nice.getStackMenu();
                break;
            case 6:
                System.out.println("See ya!");
                break;
        }
        
        } while(select != 6);
    }
}
