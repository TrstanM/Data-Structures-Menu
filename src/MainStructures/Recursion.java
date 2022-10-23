
package MainStructures;
/**
 *
 * @author boshu
 */
import java.util.Scanner;

public class Recursion {
    private void recursionMenu() {
        Scanner input = new Scanner(System.in);
        
        int call;
        do {
        System.out.println("\nEnter a number between 6 and 21 (Enter -1 to exit): ");
        call = input.nextInt();
        System.out.println();
        
        if (call == -1) {
            System.out.println("See ya!");
        }
        
        else {
        System.out.println("Would you like to go forward(F) or backward(B)?: ");
        String choose = input.next();
        if( null == choose){
            System.out.println("That is not a valid input.");
        }
        else switch (choose) {
                case "F":
                    checkF(call);
                    break;
                case "B":
                    checkB(call);
                    break;
                default:
                    System.out.println("That is not a valid input.");
                    break;
            }
        }
        }while(call != -1);
    }
    
    private void countForward(int call) {
        if (call == 22){
            System.out.println("Done!");
        }
        else {
            System.out.println(call++);
            countForward(call);
        }
    }
    private void countBack(int call) {
        if (call == 5){
            System.out.println("Done!");
        }
        else {
            System.out.println(call--);
            countBack(call);
        }
    }
    
    private boolean checkF (int n) {
        if (n > 21) {
            System.out.println("Number is too large!");
            return false;
        }
        else if (n < 6) {
            System.out.println("Number is too small!");
            return false;
        }
        else {
            countForward(n);
            return true;
        }
    }
    
    private boolean checkB (int n) {
        if (n > 21) {
            System.out.println("Number is too large!");
            return false;
        }
        else if (n < 6) {
            System.out.println("Number is too small!");
            return false;
        }
        else {
            countBack(n);
            return true;
        }
    }
    
    public void getrecursionMenu() {
        recursionMenu();
    }
}
