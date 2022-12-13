
package MainStructures;

/**
 *
 * @author boshu
 */
import java.util.*;

public class LinkedListClass extends Hashmap{

    LinkedList<String> vault = new LinkedList<>();
    private String item;
    
    private void menu () {
        int choice = 0;
        do {
            try {
            LinkedListMenuSelect(choice);
            }catch(RuntimeException e) {
                System.out.println("Not a valid input!");
            }
        }while(choice != 5);
    }

    private void LinkedListMenuSelect(int choice) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the Vault!\n1. Add items to the vault\n2. Find an item\n3. Change an item\n4. Delete an item\n5. Exit");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                add(null);
                break;
            case 2:
                System.out.print("\nEnter the item you want to find:");
                find();
                break;
            case 3:
                System.out.print("\nEnter the item you want to change:");
                change();
                break;
            case 4:
                System.out.print("\nEnter the item you want to delete from the vault:");
                delete();
                break;
            case 5:
                System.out.println("You have closed the Vault!");
                break;
        }
    }
    
    private String add (String item) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\nEnter an item(enter 'stop' to exit):");
            item = input.next();
            vault.add(item);
            vault.remove("stop");
            System.out.println(vault);
        }while(!item.equals("stop"));
        
        return vault.toString();
    }
    
    private void find () {
        if (vault.isEmpty()) {
            System.out.println("Vault is empty");
            return;
        }
        Scanner input = new Scanner(System.in);
        item = input.next();
        Iterator finder = vault.iterator();
        while(finder.hasNext()) {
            if(finder.next() == item) {
                System.out.println("We found" + item + " !");
                return;         
            }
        }
    }
    
    private String change() {
        Scanner input = new Scanner(System.in);
        find();
        System.out.println("Enter new item:");
        vault.remove(item);
        item = input.next();
        vault.add(item);
        System.out.println(vault);
        return vault.toString();
    }
    
    
    private String delete() {
        Scanner input = new Scanner(System.in);
        find();
        System.out.println("Do you really want to delete this item?:");
        String choice = input.next();
        switch (choice) {
            case "yes":
            case "Yes":
            case "YES":    
                vault.remove(item);
                System.out.println(vault);
                break;
            case "no":
            case "No":
            case "NO":
                System.out.println("The item will stay in the vault");
                break;
            default:
                System.out.println("Not a valid input");
                break;
        }
        return vault.toString();
    }
    
    public void getLinkedListMenu() {
        menu();
    }
}