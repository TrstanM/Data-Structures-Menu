
package DataStructures.pkg1;

/**
 *
 * @author boshu
 */
import java.util.*;

public class Menu extends Hashmap{
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        StackClass nice = new StackClass();
        int select;
        
        do {
        System.out.println("Data Structures Menu");
        System.out.println("--------------------");
        System.out.println("1) Recursion\n2) Hash Map\n3)Array \n4)Exit");
        select = input.nextInt();
        
        switch (select) {
            case 1:
                nice.getrecursionMenu();
                break;
            case 2:
                nice.getHashmapMenu();
                break;
            case 3:
                nice.getArrayMenu();
                break;
            case 4:
                System.out.println("See ya!");
                break;
        }
        
        } while(select != 3);
    }
}
