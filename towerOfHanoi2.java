//Tower of Hanoi solved through iteration
import java.util.Scanner;
import java.util.Stack;
class towerOfHanoiState{
    char start;
    char auxiliary;
    char end;
    int n;
    towerOfHanoiState(char start, char end, char auxiliary, int n){
        this.start = start;
        this.end = end;
        this.auxiliary = auxiliary;
        this.n = n;
    }
}
public class towerOfHanoi2 {
    static int move = 1;
    public static void getTowerOfHanoi (int n, char start, char auxiliary, char end){
        Stack<towerOfHanoiState> stack = new Stack<>();

        while ((n >= 1) || !stack.isEmpty()) {
            while (n >= 1) {
                towerOfHanoiState current = new towerOfHanoiState(start, end, auxiliary, n);
                stack.push(current);
                char temp = end;
                end = auxiliary;
                auxiliary = temp;
                n--;
            }

            if (!stack.isEmpty()) {
                towerOfHanoiState current = stack.pop();
                System.out.println("Step " + move + ": ");
                move++;
                System.out.println("Move disk " + current.n + " from " + current.start + " to " + current.end);
                start = current.auxiliary;
                auxiliary = current.start;
                end = current.end;
                n = current.n - 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of disks: ");
        int numberOfDisks = scanner.nextInt();
        getTowerOfHanoi(numberOfDisks, 'A', 'B', 'C');
    }
}

