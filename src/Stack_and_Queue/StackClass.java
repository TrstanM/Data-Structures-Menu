
package Stack_and_Queue;
import java.util.*;


/**
 *
 * @author boshu
 */

public class StackClass extends QueueClass{
    Stack<String> stack = new Stack<>();
    
    private void menu() {
        Scanner input = new Scanner(System.in);
        int choice;
        String word;
        
        do {
        System.out.println("\nWelcome to the Palindroime Checker!\n1) Check for Palindrome\n2) Check a letter in the Palindrome\n3) Get a random string\n4) Exit");
        choice = input.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("\nEnter a string: ");
                word = input.next();
                palChecker(word);
                break;
            case 2:
                try {
                System.out.println("\nEnter a palindrome you would like to use: " + stack);
                word = input.next();
                System.out.println("\nEnter a letter:");
                String letter = input.next();
                letterCheck(word, letter);
            } catch(RuntimeException e) {
                System.out.println("invalid input");
            }
                break;
            case 3:
                System.out.println("\nHow long should the word be?: ");
                int len = input.nextInt();
                System.out.println("\nHere's your random string: " + random(len));
                palChecker(random(len));
                break;
            case 4:
                System.out.println("You have exited the Palindroime Checker!");
                break;
        }
        }while(choice != 4);
    }
    
    public boolean palChecker(String str) {
        Stack s1 = new Stack();
        for (int i = 0; i < str.length(); i++) {
            s1.add(str.charAt(i));
        }
        String reverseStr = "";
        while(!s1.isEmpty()) {
            reverseStr = reverseStr + s1.pop();
        }
        if (str.equals(reverseStr)) {
            System.out.println("It's a palindrome!");
            stack.add(str);
            return true;
        }
        else {
            System.out.println("It's not a palindrome");
            return false;
        }
    }
    
    public String letterCheck(String word, String letter) {
        if (stack.isEmpty()) {
            return("The stack is empty");
        }
        for(int i = 0; i < word.length(); i++) {
            if (letter.equals(word.charAt(i))) {
                break;
            }
        }
        return letter + " exits!";
    }
    
    public String random(int len) {
        StringBuilder build = new StringBuilder(len);
        String ABC = "abcdefghijklmnopqrstuvxyz";
        
        for(int i = 0; i < len; i++) {
            int index = (int)(ABC.length() * Math.random());
            build.append(ABC.charAt(index));
        }
        return build.toString();
    }
    
    public void getStackMenu() {
        menu();
    }
}