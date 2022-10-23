
package BFS_and_DFS;

/**
 *
 * @author boshu
 */
import MainStructures.LinkedListClass;
import java.util.*;

public class QueueClass extends LinkedListClass{
   Queue<Node> q = new LinkedList<>();
    private void menu() {
        Scanner input = new Scanner(System.in);
        int choice; 
        String enter;
        
        do {
        System.out.println("\nWelcome to the GPS!\n1) Show locations to the map\n2) Find a location\n3) Get a random location\n4) Exit");
        choice = input.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("\nHere are the locations!" + 
                                   "\n-----------------------");
                Node tree = BFS_tree();
                QueueClass.this.traversal_Q(tree);
                break;
            case 2:
                System.out.println("Enter location you are looking for:");
                enter = input.next();
                break;
            case 3:
                
                break;
            case 4:
                System.out.println("See ya!");
                break;
        }
        }while(choice != 4);
    }
    
    private static Node BFS_tree() {
        Node root = new Node("Alder lake",
                new Node("Big City",
                        new Node ("Capitol Hill"), new Node("Downey Town")),
        new Node("Eldritch",
                new Node("Freylord"), new Node("Garrison" ,
                        new Node("Harrington"), null)));
        return root;
    }
    
    public void traversal_Q(Node node) {
        q.add(node);
        
        while(!q.isEmpty()) {
            node = q.remove();
            System.out.println(node.data + " ");
            
            if(node.left != null)
                q.add(node.left);
            
            if(node.right != null)
                q.add(node.right);
        }
    }
    
    public void getQueueMenu() {
        menu();
    }
}
