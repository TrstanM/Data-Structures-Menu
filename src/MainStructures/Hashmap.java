
package MainStructures;

/**
 *
 * @author boshu
 */
import java.util.*;

public class Hashmap extends Recursion {
    HashMap<String, String> map = new HashMap<>();
    
    private void HashmapMenu () {
        int choice = 0;
        try {
        HashmapMenuSelector(choice);
        } catch (RuntimeException e) {
            System.out.println("Not a valid input!");
        }
    }

    private void HashmapMenuSelector(int choice) {
        Scanner input = new Scanner (System.in);
        do {
            System.out.println("\nWelcome to the Password Manager!");
            System.out.println("1) Insert name and password\n" + "2) Delete name and password\n" + "3) Change name and/or password\n" + "4) Exit");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    input();
                    System.out.println(map);
                    break;
                case 2:
                    delete("","");
                    System.out.println(map);
                    break;
                case 3:
                    change();
                    System.out.println(map);
                    break;
                case 4:
                    System.out.println("You have exited the Password Manager!");
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
    
    public String delete (String name, String pass) {
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
        String enter_n = null, enter_p = null;
        
        System.out.println("\nDo you want to change a name or password?");
        String choose = input.next();
        
        if(null == choose) {
            return "That is not a valid option";
        }
        else {
            return choose(choose, enter_n, enter_p);
        }
    }

    private String choose (String select, String name, String pass) {
        try (Scanner input = new Scanner (System.in)) {
            switch (select) {
                case "name":
                {
                    System.out.println("Enter a name you would like to change:");
                    System.out.println(map.keySet());
                    String enter = input.next();
                    map.remove(enter);
                    System.out.print("Enter new name: ");
                    name = input.next();
                    System.out.println("passwords: " + map.values());
                    System.out.print("Re-enter password: ");
                    pass = input.next();
                    map.put(name, pass);
                    return name + "\n" + pass;
                }
                case "password":
                {
                    System.out.println("Enter a password you would like to change: " + map.values());
                    String enter = input.next();
                    map.remove(enter);
                    System.out.print("Enter new password:" + "\nNames: " + map.keySet());
                    pass = input.next();
                    map.put(map.get(pass), pass);
                    return name + "\n" + pass;
                }
                default:
                    return "That is not a valid option";
            }
        }
    }
    
    public void getHashmapMenu () {
        HashmapMenu();
    }
}
