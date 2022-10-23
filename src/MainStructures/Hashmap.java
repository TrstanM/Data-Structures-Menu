
package MainStructures;

/**
 *
 * @author boshu
 */
import java.util.*;

public class Hashmap extends Recursion {
    HashMap<String, String> map = new HashMap<>();
    
    private void HashmapMenu () {
        Scanner input = new Scanner (System.in);
        int choice;
        do {
        System.out.println("\nWelcome to the Hash Map menu!");
        System.out.println("1) Insert name and password\n" + "2) Delete name and password\n" + "3) Change name and/or password\n" + "4) Exit");
        choice = input.nextInt();
        
        switch (choice) {
            case 1:
                input();
                System.out.println(map);
                break;
            case 2:
                Delete("","");
                System.out.println(map);
                break;
            case 3:
                change();
                System.out.println(map);
                break;
        }
        } while(choice != 4);
    }
    
    public String input (){
        Scanner input = new Scanner (System.in);
        System.out.println("\nEnter a name: ");
        String name = input.next();
        System.out.println("Enter a password");
        String pass = input.next();
        
        map.put(name, pass);
        return map.toString();
    }
    
    public String Delete (String name, String pass) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("\nEnter a name and password you want to delete\n");
        System.out.println("Names: " + map.keySet() + "\nPasswords: " + map.values());
        System.out.println("Name:\n" + "Password: ");
        
        name = input.next();
        pass = input.next();
        map.remove(name, pass);
        
        return "Removed: " + name + " " + pass;
    }
    
    private String change () {
        Scanner input = new Scanner (System.in);
        String enter_n, enter_p;
        
        System.out.println("\nDo you want to change a name or password?");
        String choose = input.next();
        
        if(null == choose) {
            return "That is not a valid option";
        }
        else switch (choose) {
            case "name":
            {
                System.out.println("Enter a name you would like to change:");
                System.out.println(map.keySet());
                String enter = input.next();
                map.remove(enter);
                System.out.println("Enter new name:\n" + "passwords: " + map.values());
                enter_n = input.next();
                enter_p = input.next();
                map.put(enter_n, enter_p);
                return enter_n + "\n" + enter_p;
            }
            case "password":
            {
                System.out.println("Enter a password you would like to change:");
                System.out.println(map.values());
                String enter = input.next();
                map.remove(enter);
                System.out.println("Enter new password:\n" + "Names: " + map.keySet());
                enter_n = input.next();
                enter_p = input.next();
                map.put(enter_n, enter_p);
                return enter_n + "\n" + enter_p;
            }
            default:
                return "That is not a valid option";
        }
    }
    
    public void getHashmapMenu () {
        HashmapMenu();
    }
}
