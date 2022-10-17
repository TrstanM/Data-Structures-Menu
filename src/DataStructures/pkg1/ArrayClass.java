
package DataStructures.pkg1;

/**
 *
 * @author boshu
 */
import java.util.*;

public class ArrayClass extends Hashmap{
    final int size = 20;
    int[] array = new int[size];
    
    
    private void menu () {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array Class!\n1. Add an elemet to the list\n2. Delete an element\n3. Change an element\n4. Add a random element");
        int choice = input.nextInt();
        
        switch (choice) {
            
            case 1:
                System.out.println("Enter a number: ");
                int enter = input.nextInt();
                add(enter);
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
        }
    }
    
    public int add (int element) {
        int capacity = 1;
        if (element == 0) {
            capacity *= 2;
        }
        else {
            capacity += element;
        }
        double [] newArray = new double [capacity];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return element;
    }
    
    public void getArrayMenu() {
        menu();
    }
}
