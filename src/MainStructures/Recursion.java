
package MainStructures;
/**
 *
 * @author boshu
 */
import java.util.Scanner;

public class Recursion {
    private void recursionMenu() {
        Scanner input = new Scanner(System.in);
        int call = 0; String choose = null;
        do {
            try {
                System.out.println("\nEnter a number between 6 and 21 (Enter -1 to exit): ");
                call = input.nextInt();
                System.out.println();
            }catch (RuntimeException e) {
                System.out.println("Not a valid input!");
            }
            if (call == -1) {
                System.out.println("See ya!");
            }
            else {
                moveSelector(choose, call);
            }
        }while(call != -1);
    }

    private void moveSelector(String choose, int call) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to go forward(F) or backward(B)?: ");
        choose = input.next();
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
    
    private int countForward(int call) {
        if (call == 22){
            System.out.println("Done!");
            return call;
        }
        else {
            System.out.println(call++);
            return countForward(call);
        }
    }
    private int countBack(int call) {
        if (call == 5){
            System.out.println("Done!");
            return call;
        }
        else {
            System.out.println(call--);
            return countBack(call);
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
