
package BFS_and_DFS;

import java.util.*;


/**
 *
 * @author boshu
 */

public class StackClass extends QueueClass{
    
    private void menu() {
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
        System.out.println("\nWelcome to the Word Search!\n1) Show words on the stack\n2) Find a word\n3) Get a random word\n4) Exit");
        choice = input.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("\nHere are the words!" + 
                                   "\n-------------------");
                Node tree = DFS_tree();
                StackClass.this.traversal_S(tree);
                break;
            case 2:
                System.out.println("\nEnter word you want to find: ");
                break;
            case 3:
                
                break;
            case 4:
                System.out.println("See ya!");
                break;
        }
        }while(choice != 4);
    }
    public static Node DFS_tree() {
        Node root = new Node("Art",
                new Node("Ball",
                        new Node ("Cat"), new Node("Dog")),
        new Node("Eden",
                new Node("Fortnight"), new Node("Glaive" ,
                        new Node("Heart"), null)));
        return root;
    }
    public void traversal_S(Node node) {
        if(node == null)
            return;
        System.out.println(node.data);
        traversal_S(node.left);
        traversal_S(node.right);
    }
    public void getStackMenu() {
        menu();
    }
}
