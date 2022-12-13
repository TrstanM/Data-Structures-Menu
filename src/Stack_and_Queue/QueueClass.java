
package Stack_and_Queue;

/**
 *
 * @author boshu
 */
import MainStructures.LinkedListClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner; 


public class QueueClass extends LinkedListClass {
    
    Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
    List<String> list = new ArrayList<>();
    
    private void menu() {
        int choice = 0; String enter = null;
        try {
            menuSelect(choice, enter);
        }catch (RuntimeException e) {
            System.out.println("Not a valid input!");
        }
    }

    private void menuSelect(int choice, String enter ) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\nWelcome to Your Web History!\n1) Show History\n2) Find a location\n3) Get a random link\n4) Exit");
            choice = input.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("\nHere is your history!" + 
                                       "\n-----------------------");
                    historyList();
                    System.out.println("\nWould you like to add more links?: ");
                    enter = input.next();
                    enterLink(enter, "");
                    break;
                case 2:
                    System.out.println("Enter website you are trying to get to:");
                    enter = input.next();
                    find(enter);
                    break;
                case 3:
                    System.out.println("Here is a random link: " + random(list));
                    break;
                case 4:
                    System.out.println("You have exited Your Web History!");
                    break;
            }
            }while(choice != 4);
    }
    
    public void historyList() {
        queue.offer("geeksforgeeks.org");
        queue.offer("YouTube.com");
        queue.offer("google.com/mail");
        queue.offer("visualstudio.com");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        queue.add("geeksforgeeks.org");
        list.add("geeksforgeeks.org");
        
        queue.add("YouTube.com");
        list.add("YouTube.com");
        
        queue.add("google.com/mail");
        list.add("google.com/mail");
        
        queue.add("visualstudio.com");
        list.add("visualstudio.com");
    }
    
    public String enterLink(String choice, String element) {
        Scanner input = new Scanner(System.in);
        if (choice.equals("yes")) {
            do {
            System.out.println("Enter link (enter 'stop' to exit): ");
            element = input.next();
            queue.add(element);
            queue.remove("stop");
            list.add(element);
            list.remove("stop");
            System.out.println(queue);
            }while(!element.equals("stop"));
            return element;
        }
        else if (element.equals("no")) {
            System.out.println(queue);
            return element;
        }
        else {
            System.out.println("That is not a valid choice.");
            return element;
        }
    }
    
    public boolean find(String element) {
        if (queue.contains(element)) {
            System.out.println("The location is in your history!");
            return true;
        }
        else {
            System.out.println("That is not in your history");
            return false;
        }
    }
    public String random(List<String> list) {
        Random link = new Random();
        list.add(queue.toString());
        return list.get((link.nextInt(list.size())));
    }
    
    
    public void getQueueMenu() {
        menu();
    }
}